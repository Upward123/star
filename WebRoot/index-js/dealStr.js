var a = document.getElementsByClassName("txt").length;
// console.log(a);
for(var i=0;i<document.getElementsByClassName("txt").length;i++) {
    var str = document.getElementsByClassName("txt")[i].innerHTML;
    // console.log(str.length);
    if(str.length>17) {
        var strCut = str.substr(0, 16);
        document.getElementsByClassName("txt")[i].innerHTML = strCut + "...";
    }
}