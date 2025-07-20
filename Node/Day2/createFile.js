const fs = require("fs");

fs.appendFile("info.txt", "Hii Guys,\n\tHow are You!!\n\tthinnara.", (err) => {
  if (err) {
    console.log(err);
    return;
  }
  console.log("file created Successfully.");
});
