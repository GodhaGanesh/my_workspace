const fs = require("fs");

fs.writeFile("sample.txt", "Hii Guys,\n\tHow are You!!\n\tthinnara.", (err) => {
  if (err) {
    console.log(err);
    return;
  }
  console.log("Text written Successfully.");
});
