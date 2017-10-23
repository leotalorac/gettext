function start(){
  var a = document.getElementsByTagName("P");
  var h = a.length;
  var d = document.getElementById("container")
  console.log(a);
  console.log(a.length);
  d.innerHTML+= '<meta charset="utf-8"> <html>';
  for (var i = 0; i <h; i++) {
    console.log(i);
    d.innerHTML += "<p>" + a[i].textContent + "</p>";
  }
  d.innerHTML += "</html>"
  download(d.innerHTML, "dlText.html", "text/plain");
}
