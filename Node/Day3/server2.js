const http = require("http");

const server = http.createServer((req, res) => {
  if (req.url === "/") {
    res.write("🏠 Home Page");
  } else if (req.url === "/about") {
    res.write("👤 About Ganesh");
  } else if (req.url === "/contact") {
    res.write("📞 Contact at: ganesh@example.com");
  } else {
    res.write("❌ Page Not Found");
  }
  res.end();
});

server.listen(3000, () => {
  console.log("🌐 Server running on http://localhost:3000");
});
