document.getElementsByClassName("langChange").addEventListener("click", () => {
  const lang = document.getElementsByClassName("langChange")[this].value;
  callApi(lang);
});
