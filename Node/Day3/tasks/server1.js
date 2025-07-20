const http = require('http');
const server = http.createServer((req, res)=>{
  res.writeHead(200, {
    "Content-Type": "text/plain",
    "X-Powered-By": "Ganesh Node Server",
  });
  res.end();
})
server.listen(3000,()=>{
  console.log('your Server http://localhost:3000');
})