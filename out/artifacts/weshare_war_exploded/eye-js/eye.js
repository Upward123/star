
// 这里使用最原始的js语法实现，可对应换成jquery语法进行逻辑控制
var see = document.getElementById('see');//text block
var noSee = document.getElementById('noSee');//password block
var seeSure = document.getElementById('seeSure');//text block
var noSeeSure = document.getElementById('noSeeSure');//password block
var inputSee = document.getElementById('see-input');
var inputNoSee = document.getElementById('no-see-input');
var inputSeeSure = document.getElementById('see-input-sure');
var inputNoSeeSure = document.getElementById('no-see-input-sure');
//隐藏text block，显示password block
function showPsw() {
    var val = inputNoSee.value;//将password的值传给text
    inputSee.value = val;
    var name = inputNoSee.name;
    inputSee.name = name;
    inputNoSee.name = "";
    noSee.style.display = "none";
    see.style.display = "";
}
//隐藏password，显示text  
function hidePsw() {
    var val = inputSee.value;//将text的值传给password  
    inputNoSee.value = val;
    var name = inputSee.name;
    inputNoSee.name = name;
    inputSee.name="";
    noSee.style.display = "";
    see.style.display = "none";
}

//隐藏text block，显示password block
function showPswSure() {
    var val = inputNoSeeSure.value;//将password的值传给text
    inputSeeSure.value = val;
    var name = inputNoSeeSure.name;
    inputSeeSure.name = name;
    inputNoSeeSure.name = "";
    noSeeSure.style.display = "none";
    seeSure.style.display = "";
}
//隐藏password，显示text  
function hidePswSure() {
    var val = inputSeeSure.value;//将text的值传给password  
    inputNoSeeSure.value = val;
    var name = inputSeeSure.name;
    inputNoSeeSure.name = name;
    inputSeeSure.name="";
    noSeeSure.style.display = "";
    seeSure.style.display = "none";
}

