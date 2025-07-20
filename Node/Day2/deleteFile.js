const fs = require('fs');

fs.unlink('info.txt',(err)=>{
  if(err){
    console.log(`can't delete the File `+err)
    return;
  }
  console.log(`File deleted !!`);
})