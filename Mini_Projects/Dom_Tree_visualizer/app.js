let matches = [];
let currentMatchIndex = -1;
let beautifyTimeout;

document.getElementById("htmlInput").addEventListener("input", function () {
  clearTimeout(beautifyTimeout);
  beautifyTimeout = setTimeout(() => {
    beautifyHTML();
    showBeautifyNotice();
  }, 1000); // 1 sec pause before auto-beautify
});

function showBeautifyNotice() {
  const notice = document.getElementById("beautifyNotice");
  notice.style.opacity = "1";
  setTimeout(() => {
    notice.style.opacity = "0";
  }, 1000);
}

function beautifyHTML() {
  const textarea = document.getElementById("htmlInput");
  const code = textarea.value;
  const beautified = html_beautify(code, {
    indent_size: 2,
    wrap_line_length: 80,
    end_with_newline: true,
  });
  textarea.value = beautified;
}

function generateTree() {
  const html = document.getElementById("htmlInput").value;
  const parser = new DOMParser();
  const doc = parser.parseFromString(html, "text/html");

  if (!doc.body || doc.body.innerHTML.trim() === "" || !doc.documentElement) {
    document.getElementById("errorMsg").textContent = "❌ Invalid HTML code!";
    document.getElementById("treeContainer").innerHTML = "";
    matches = [];
    updateMatchCount();
    return;
  }
  document.getElementById("errorMsg").textContent = "";

  const treeContainer = document.getElementById("treeContainer");
  treeContainer.innerHTML = "";
  matches = [];
  currentMatchIndex = -1;
  updateMatchCount();

  function createTree(node) {
    const el = document.createElement("div");
    el.classList.add("tree-node");

    const header = document.createElement("div");
    header.classList.add("tree-node-header");

    const arrow = document.createElement("span");
    arrow.classList.add("arrow");
    arrow.textContent = "▼";

    const labelContainer = document.createElement("div");
    let label = "";

    if (node.nodeType === Node.ELEMENT_NODE) {
      el.classList.add("element-node");
      label = `<strong>&lt;${node.tagName.toLowerCase()}&gt;</strong>`;
      if (node.id) {
        label += `<span class="id-badge" title="id: ${node.id}">id="${node.id}"</span>`;
      }
      if (node.className) {
        label += `<span class="class-badge" title="class: ${node.className}">class="${node.className}"</span>`;
      }
      labelContainer.innerHTML = label;
    } else if (
      node.nodeType === Node.TEXT_NODE &&
      node.nodeValue.trim() !== ""
    ) {
      el.classList.add("text-node");
      labelContainer.textContent = node.nodeValue.trim();
      header.appendChild(labelContainer);
      el.appendChild(header);
      return el;
    } else if (node.nodeType === Node.COMMENT_NODE) {
      el.classList.add("comment-node");
      labelContainer.textContent = `<!-- ${node.nodeValue} -->`;
      header.appendChild(labelContainer);
      el.appendChild(header);
      return el;
    } else {
      return null;
    }

    const copyBtn = document.createElement("button");
    copyBtn.innerHTML = `<i class="bi bi-clipboard"></i>`;
    copyBtn.classList.add("copy-btn");
    copyBtn.addEventListener("click", function (e) {
      e.stopPropagation();
      copyNodeHtml(node);
    });

    header.appendChild(labelContainer);
    header.appendChild(copyBtn);
    header.prepend(arrow);
    el.appendChild(header);

    const childrenContainer = document.createElement("div");
    childrenContainer.classList.add("tree-children");

    for (let child of node.childNodes) {
      let childEl = createTree(child);
      if (childEl) childrenContainer.appendChild(childEl);
    }

    if (childrenContainer.children.length > 0) {
      childrenContainer.style.height = childrenContainer.scrollHeight + "px";
      header.addEventListener("click", function (e) {
        e.stopPropagation();
        if (el.classList.contains("collapsed")) {
          el.classList.remove("collapsed");
          childrenContainer.style.height =
            childrenContainer.scrollHeight + "px";
          arrow.style.transform = "rotate(0deg)";
        } else {
          el.classList.add("collapsed");
          childrenContainer.style.height = "0";
          arrow.style.transform = "rotate(-90deg)";
        }
      });
    } else {
      arrow.style.visibility = "hidden";
    }

    el.appendChild(childrenContainer);
    return el;
  }

  const htmlEl = createTree(doc.documentElement);
  if (htmlEl) treeContainer.appendChild(htmlEl);

  highlightNodes();

  expandAll();
  expandAll();
}

function copyNodeHtml(node) {
  const tempDiv = document.createElement("div");
  tempDiv.appendChild(node.cloneNode(true));
  const html = tempDiv.innerHTML;
  navigator.clipboard.writeText(html).then(() => {
    alert("Subtree HTML copied to clipboard!");
  });
}

function toggleMode() {
  document.body.classList.toggle("dark-mode");
}

function highlightNodes() {
  const input = document.getElementById("highlightInput").value.trim();
  const nodes = document.querySelectorAll("#treeContainer .tree-node");

  matches = [];
  currentMatchIndex = -1;

  nodes.forEach((node) => {
    node.classList.remove("highlight", "current-highlight");
  });

  if (!input) {
    updateMatchCount();
    return;
  }

  nodes.forEach((node) => {
    const text = node.textContent || "";
    if (input.startsWith("#")) {
      if (text.includes(`id="${input.slice(1)}"`)) {
        node.classList.add("highlight");
        matches.push(node);
      }
    } else if (input.startsWith(".")) {
      if (text.includes(`class="${input.slice(1)}"`)) {
        node.classList.add("highlight");
        matches.push(node);
      }
    } else {
      if (text.startsWith(`<${input}`) || text.includes(`<${input}`)) {
        node.classList.add("highlight");
        matches.push(node);
      }
    }
  });

  if (matches.length > 0) {
    currentMatchIndex = 0;
    updateCurrentHighlight();
    matches[0].scrollIntoView({ behavior: "smooth", block: "center" });
  }

  updateMatchCount();
}

function updateMatchCount() {
  document.getElementById(
    "matchCount"
  ).textContent = `Matches: ${matches.length}`;
}

function updateCurrentHighlight() {
  matches.forEach((node) => node.classList.remove("current-highlight"));
  if (matches.length > 0 && currentMatchIndex >= 0) {
    matches[currentMatchIndex].classList.add("current-highlight");
  }
}

function nextMatch() {
  if (matches.length === 0) return;
  currentMatchIndex = (currentMatchIndex + 1) % matches.length;
  updateCurrentHighlight();
  matches[currentMatchIndex].scrollIntoView({
    behavior: "smooth",
    block: "center",
  });
}

function prevMatch() {
  if (matches.length === 0) return;
  currentMatchIndex = (currentMatchIndex - 1 + matches.length) % matches.length;
  updateCurrentHighlight();
  matches[currentMatchIndex].scrollIntoView({
    behavior: "smooth",
    block: "center",
  });
}

function expandAll() {
  const nodes = document.querySelectorAll("#treeContainer .tree-node");
  nodes.forEach((node) => {
    node.classList.remove("collapsed");
    const children = node.querySelector(".tree-children");
    if (children) children.style.height = children.scrollHeight + "px";
    const arrow = node.querySelector(".arrow");
    if (arrow) arrow.style.transform = "rotate(0deg)";
  });
}

function collapseAll() {
  const nodes = document.querySelectorAll("#treeContainer .tree-node");
  nodes.forEach((node) => {
    node.classList.add("collapsed");
    const children = node.querySelector(".tree-children");
    if (children) children.style.height = "0";
    const arrow = node.querySelector(".arrow");
    if (arrow) arrow.style.transform = "rotate(-90deg)";
  });
}

document.addEventListener("keydown", function (e) {
  if (e.ctrlKey && e.shiftKey && e.key.toLowerCase() === "f") {
    beautifyHTML();
    showBeautifyNotice();
    e.preventDefault();
  } else if (e.ctrlKey && e.key.toLowerCase() === "f") {
    e.preventDefault();
    document.getElementById("highlightInput").focus();
  } else if (e.ctrlKey && e.key.toLowerCase() === "g") {
    e.preventDefault();
    generateTree();
  } else if (e.key === "F3" && !e.shiftKey) {
    nextMatch();
    e.preventDefault();
  } else if (e.key === "F3" && e.shiftKey) {
    prevMatch();
    e.preventDefault();
  } else if (e.ctrlKey && e.key.toLowerCase() === "e" && e.shiftKey) {
    collapseAll();
    e.preventDefault();
  } else if (e.ctrlKey && e.key.toLowerCase() === "e") {
    expandAll();
    e.preventDefault();
  } else if (e.ctrlKey && e.shiftKey && e.key.toLowerCase() === "c") {
    if (matches.length > 0 && currentMatchIndex >= 0) {
      copyNodeHtml(matches[currentMatchIndex]);
    }
    e.preventDefault();
  } else if (e.ctrlKey && e.shiftKey && e.key.toLowerCase() === "s") {
    downloadImage();
    e.preventDefault();
  } else if (e.ctrlKey && e.shiftKey && e.key.toLowerCase() === "p") {
    downloadPDF();
    e.preventDefault();
  } else if (e.ctrlKey && e.key.toLowerCase() === "d") {
    toggleMode();
    e.preventDefault();
  } else if (e.key === "Escape") {
    document.getElementById("highlightInput").value = "";
    highlightNodes();
    e.preventDefault();
  }
});

function downloadImage() {
  html2canvas(document.querySelector("#treeContainer")).then((canvas) => {
    const link = document.createElement("a");
    link.download = "dom-tree-by-master-vision.png";
    link.href = canvas.toDataURL();
    link.click();
  });
}

function downloadPDF() {
  html2canvas(document.querySelector("#treeContainer")).then((canvas) => {
    const imgData = canvas.toDataURL("image/png");
    const pdf = new jspdf.jsPDF({
      orientation: "portrait",
      unit: "px",
      format: [canvas.width, canvas.height],
    });
    pdf.addImage(imgData, "PNG", 0, 0, canvas.width, canvas.height);
    pdf.save("dom-tree-by-master-vision.pdf");
  });
}
