const fs = require('fs');

fs.readFile('sample.txt', 'utf8', (err,data) => {
  if(err){
    console.log('cant read file why because :-'+err);
    return;
  }
    console.log('file content : ')
    console.log(data)
})