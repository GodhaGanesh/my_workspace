const fs = require('fs');

fs.mkdir('filesStorer',(err)=>{
  if(err){
    console.log('got a error :- '+err);
    return;
  }
  console.log('folder Created!!')
})