const fs = require('fs');

fs.appendFile("sample.txt", "\nUsers : Haa, thinnam! mari nuvvo!!",(err)=>{
  if (err) {
    console.log(err);
    return;
  }
  console.log("Text appended!!")
});