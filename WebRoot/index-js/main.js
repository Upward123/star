$(function(){
//	计算滑动的时间
	var clearTime = null;
//	即将显示的页面
	var $index = 0;
//	当前显示的页面
	var $qiandex = 0;
	
//	当鼠标指针位于元素上方时，会发生 mouseover 事件
	$("#list li").mouseover(function(){
//		clearInterval() 方法可取消由 setInterval() 设置的 timeout。
//		鼠标停止，图片暂停
		clearInterval(clearTime);
//		获取序列号 当前序列号等于这个页面的下标
		$index = $(this).index();
		
//		开始滑动
		scrollPlay();
//		把当前的赋值给下一次的前一个序列号
		$qiandex = $index;
	}).mouseout(function(){
//		当鼠标移开，继续轮播
		autoPlay();
	});
//	开始轮播
	autoPlay();
	
//	点击向右
	$("#box .btnright").click(function(){
		$index++;
		if ($index > 7){
			$index = 0;
		}
		
		scrollPlay()
		$qiandex = $index;
//		暂停计算时间
		clearInterval(clearTime);
//		开始轮播
		autoPlay();
	});
	
//	点击向左
	$("#box .btnleft").click(function(){
		$index--;
		if($index < 0){
			$index = 7;
		}
		
		scrollPlay()
		$qiandex = $index;
		clearInterval(clearTime);
		autoPlay();
	});
	
	//	第一次加载,强制计算下标
//	$(".select").eq($index).addClass("hover");
	
	function autoPlay(){
//		设置时间
		clearTime = setInterval(function(){
		// console.log($index);
			
//			每次序列号+1
			$index++;
			
			if($index > 7){
				$index = 0;
//				$qiandex = 7;
			}
			
			
//			开始滑动
			scrollPlay();
			
			$qiandex = $index;
		},2000);
	}
	
	function scrollPlay(){
//		:eq() 选择器选取带有指定 index 值的元素。
		//通过为 	index 的 div 添加适当的类，将其变为白色：
//		siblings() 获得匹配集合中每个元素的同胞，通过选择器进行筛选是可选的。
		$("#list li").eq($index).addClass("hover").siblings().removeClass("hover");
//		向左移动
		// console.log($qiandex);
		if($index > $qiandex){
//			.stop 是jQuery中用于控制页面动画效果的方法。运行之后立刻结束当前页面上的动画效果。
			//stop在新版jQuery中添加了2个参数：
			//第一个参数的意思是是否清空动画序列，也就是stop的是当前元素的动画效果
//			还是停止后面附带的所有动画效果，一般为false，跳过当前动画效果，执行下一个动画效果；
			//第二个参数是是否将当前动画效果执行到最后，意思就是停止当前动画的时候动画效果
//			刚刚执行了一般，这个时候想要的是动画执行之后的效果，那么这个参数就为true。
			//否则动画效果就会停在stop执行的时候。
			$("#imgbox img").eq($qiandex).stop(true, true).animate({
				"left" : "-720px"
			});
			
			$("#imgbox img").eq($index).css("left","720px").stop(true, true).animate({
				"left" : "0"
			});
		}else if($index < $qiandex){
			$("#imgbox img").eq($qiandex).stop(true, true).animate({
				"left" : "720px"
			});
			
			$("#imgbox img").eq($index).css("left","-720px").stop(true, true).animate({
				"left" : "0"
			});
		}	
	}
});