$(function(){
    var timer = null;
    //当前的索引
    var nowIndex = 0;
    //即将显示的图片的索引
    var nextIndex = 0;
    //1.封装一个运动函数
    function move(){
        //判断当前索引和即将显示的索引的大小
        if(nowIndex < nextIndex){
            $(".slide-div a img").eq(nowIndex).stop().animate({
                "left":"-700px"
            })
            $(".slide-div a img").eq(nextIndex).css("left","700px").stop().animate({
                "left":0
            })
        }else if (nextIndex == 0) {
            $(".slide-div a img").eq(nowIndex).stop().animate({
                "left": "-700px"
            })
            $(".slide-div a img").eq(nextIndex).css("left", "700px").stop().animate({
                "left": 0
            })
        }else if(nowIndex > nextIndex){
            $(".slide-div a img").eq(nowIndex).stop().animate({
                "left":"700px"
            })
            $(".slide-div a img").eq(nextIndex).css("left","-700px").stop().animate({
                "left":0
            })
        }
    }
    //2.设置一个定时器让它动起来  自动播放
    function autoPlay(){
        clearInterval(timer)
        timer = setInterval(function(){
            nextIndex++;
            if(nextIndex > 2){
                nextIndex = 0;
                nowIndex = 2;
            }
            change()
            move()
            nowIndex = nextIndex
        },1000)
    }
    autoPlay()

    //改变小圆点的样式
    function change(){
        $(".list li").removeClass("active")
        $(".list li").eq(nextIndex).addClass("active")
    }
    //鼠标移入  清除定时器
    $(".slide-div").mouseover(function(){
        clearInterval(timer)
    })
    $(".slide-div").mouseout(function(){
        autoPlay()
    })

    //左右按钮的点击事件
    $(".left-arrow").click(function(){
        nextIndex--
        if(nextIndex < 0){
            nextIndex = 2;
        }
        move()
        change()
        nowIndex = nextIndex;
    })
    $(".right-arrow").click(function(){
        nextIndex++
        if(nextIndex > 2){
            nextIndex = 0;
        }

        move()
        change()
        nowIndex =nextIndex
        
    })

    //小圆点的鼠标进入事件
    $(".list li").click(function(){
        //获取当前小圆点的索引
        nextIndex = $(this).index();
        move()
        change()
        nowIndex = nextIndex;
    })
})