const http = require("http");
const url = require("url");
const server = http.createServer((req, res) => {
  res.writeHead(200, {
    "Content-Type": "text/plain",
    "X-Powered-By": "Ganesh Node Server",
  });
  const parsedUrl = url.parse(req.url, true);
  const pathname = parsedUrl.pathname;
  const name = parsedUrl.query.name;
  if (pathname === "/greet" && name) {
    res.end(`Hello, ${name}! 👋`);
  }
  res.end();
});
server.listen(3000, () => {
  console.log("your Server http://localhost:3000/greet?name=Uday");
});
