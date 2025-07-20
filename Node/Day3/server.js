const http = require("http");

const server = http.createServer((req, res) => {
  res.writeHead(200, { "content-type": "text/plain" });
  res.end("Hello Ganesh! Welcome to your first Node.js server.");
});

server.listen(3000, () => {
  console.log("✅ Server is running at http://localhost:3000");
});
