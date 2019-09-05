$(function () {
    var arr = [
        {
            profession:"软件工程",
            course:[
                {
                    name:"软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "计算机科学与技术",
            course: [
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                },
                {
                    name: "计算机科学",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        },
        {
            profession: "软件工程",
            course: [
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                },
                {
                    name: "软件测试",
                }
            ]
        }
    ]

    console.log(arr);
    console.log(arr.length);

    function circulation(){
        var f_items = document.getElementsByClassName(".slideShow-left .f-ul .f-li");
        var s_items = document.getElementsByTagName(".f-li .slidehide ul li");
        var i = 0;
        
        for(var fop in f_items){
            document.getElementsByClassName("fop .f-a").innerHTML = arr[i].profession;
            // $("fop.f-a").html(arr[i].profession);
            console.log(document.getElementsByClassName("fop .f-a"));
            var j = 0;
            for(var sop in s_items){
                document.getElementsByClassName("sop a .s-span").innerHTML = arr[i].course[j].name;
                // $("sop.a.s-span").html(arr[i].course[j].name);
                console.log(document.getElementsByClassName("sop a .s-span"));
                j++;
            }
            i++;
        }
    }

    circulation();
});