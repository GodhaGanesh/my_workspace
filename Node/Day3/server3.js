const http = require("http");
const server = http.createServer((req, res) => {
  if (req.url === "/") res.write("Welcome to Ganesh Website.");
  else if (req.url === "/skills")
    res.write("ReactJs, NodeJS, HTML, CSS, JavaScript, Java");
  else if (req.url === "/projects")
    res.write("No projects yet, but some internships Completed !!");
  else if (req.url === "/goal")
    res.write("Build a Strong Product Based Company!!");
  else if (req.url === "/time") {
    const now = new Date();
    res.end(`📅 Current Date & Time: ${now}`);
  } else {
    res.write("Page Not Found!!!!");
  }
  res.end();
});

server.listen(3000, () => {
  console.log("🌐 Server running on http://localhost:3000");
});
