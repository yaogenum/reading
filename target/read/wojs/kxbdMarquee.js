/**
 * @classDescription 模拟Marquee，无间断滚动内容
 * @author Aken Li(www.kxbd.com)
 * @date 2009-07-17
 * @DOM
 *  	<div id="marquee">
 *  		<ul>
 *   			<li></li>
 *   			<li></li>
 *  		</ul>
 *  	</div>
 * @CSS
 *  	#marquee {width:200px;height:50px;overflow:hidden;}
 * @Usage
 *  	$('#marquee').kxbdMarquee(options);
 * @options
 *		isEqual:true,//所有滚动的元素长宽是否相等,true,false
 *  	loop: 0,//循环滚动次数，0时无限
 *		direction: 'left',//滚动方向，'left','right','up','down'
 *		scrollAmount:1,//步长
 *		scrollDelay:20//时长
 *		controlBtn:{left:'#goL',right:'#goR'},//控制加速滚动的按钮ID，有四个属性left,right,up,down分别对应四个方向
 *		newAmount:4,//加速滚动的步长
 *		eventA:'mouseenter',//鼠标事件，加速
 *		eventB:'mouseleave'//鼠标事件，原速
 */
(function($){

	$.fn.kxbdMarquee = function(options){
		var opts = $.extend({},$.fn.kxbdMarquee.defaults, options);
		
		return this.each(function(){
			var $marquee = $(this);//滚动元素容器
			var _scrollObj = $marquee.get(0);//滚动元素容器DOM
			var scrollW = $marquee.width();//滚动元素容器的宽度
			var scrollH = $marquee.height();//滚动元素容器的高度
			var $element = $marquee.children(); //滚动元素
			var $kids = $element.children();//滚动子元素
			var scrollSize=0;//滚动元素尺寸
			var _type = (opts.direction == 'left' || opts.direction == 'right') ? 1:0;//滚动类型，1左右，0上下

			//防止滚动子元素比滚动元素宽而取不到实际滚动子元素宽度
			$element.css(_type?'width':'height',10000);
			//获取滚动元素的尺寸
			if (opts.isEqual) {
				scrollSize = $kids[_type?'outerWidth':'outerHeight']() * $kids.length;
			}else{
				$kids.each(function(){
					scrollSize += $(this)[_type?'outerWidth':'outerHeight']();
				});
			}
			//滚动元素总尺寸小于容器尺寸，不滚动
			if (scrollSize<(_type?scrollW:scrollH)) return; 
			//克隆滚动子元素将其插入到滚动元素后，并设定滚动元素宽度
			$element.append($kids.clone()).css(_type?'width':'height',scrollSize*2);
			
			var numMoved = 0;
			function scrollFunc(){
				var _dir = (opts.direction == 'left' || opts.direction == 'right') ? 'scrollLeft':'scrollTop';
				if (opts.loop > 0) {
					numMoved+=opts.scrollAmount;
					if(numMoved>scrollSize*opts.loop){
						_scrollObj[_dir] = 0;
						return clearInterval(moveId);
					} 
				}
				if(opts.direction == 'left' || opts.direction == 'up'){
					var newPos = _scrollObj[_dir] + opts.scrollAmount;
					if(newPos>=scrollSize){
						newPos -= scrollSize;
					}
					_scrollObj[_dir] = newPos;
				}else{
					var newPos = _scrollObj[_dir] - opts.scrollAmount;
					if(newPos<=0){
						newPos += scrollSize;
					}
					_scrollObj[_dir] = newPos;
				}
			};
			//滚动开始
			var moveId = setInterval(scrollFunc, opts.scrollDelay);
			//鼠标划过停止滚动
			$marquee.hover(
				function(){
					clearInterval(moveId);
				},
				function(){
					clearInterval(moveId);
					moveId = setInterval(scrollFunc, opts.scrollDelay);
				}
			);
			
			//控制加速运动
			if(opts.controlBtn){
				$.each(opts.controlBtn, function(i,val){
					$(val).bind(opts.eventA,function(){
						opts.direction = i;
						opts.oldAmount = opts.scrollAmount;
						opts.scrollAmount = opts.newAmount;
					}).bind(opts.eventB,function(){
						opts.scrollAmount = opts.oldAmount;
					});
				});
			}
		});
	};
	$.fn.kxbdMarquee.defaults = {
		isEqual:true,//所有滚动的元素长宽是否相等,true,false
		loop: 0,//循环滚动次数，0时无限
		direction: 'left',//滚动方向，'left','right','up','down'
		scrollAmount:1,//步长
		scrollDelay:20,//时长
		newAmount:3,//加速滚动的步长
		eventA:'mousedown',//鼠标事件，加速
		eventB:'mouseup'//鼠标事件，原速
	};
	
	$.fn.kxbdMarquee.setDefaults = function(settings) {
		$.extend( $.fn.kxbdMarquee.defaults, settings );
	};
	
})(jQuery);






function getDefaultStyle(obj,attribute){ //返回最终样式函数，兼容IE和DOM，设置参数：元素对象、样式特性
    return obj.currentStyle?obj.currentStyle[attribute]:document.defaultView.getComputedStyle(obj,false)[attribute];
}
function pr_box(id,e){
	clearInterval(document.getElementById(id).maxmin);
	var obj=document.getElementById(id);
	var cfont=getDefaultStyle(obj,"fontSize");// 得到默认的大小，附单位
	var cp=cfont.replace(/[0-9]|[\.]/g,"");// 得到默认的单位
	var fsize=parseFloat(cfont);// 得到默认的大小数值
	var s=10;// 运动速度
	if(!obj.fsizeTmpe){// 存储默认大小数值
		obj.fsizeTmpe=fsize;
		}
	if(!objfont){// 如果没有设置当前大小，则赋予其默认大小
		obj.style.fontSize = cfont;
	}
	var e = obj.fsizeTmpe*e/100;// 需要改变到的大小数值
	var objfont = parseFloat(obj.style.fontSize);// 得到当前的大小
	if(e < obj.fsizeTmpe){obj.maxmin = setInterval(function(){pr_min(obj,e,cp)},s);}
	if(e > obj.fsizeTmpe){obj.maxmin = setInterval(function(){pr_max(obj,e,cp)},s);}
	if(e == obj.fsizeTmpe){
		if(objfont < obj.fsizeTmpe){
			obj.maxmin = setInterval(function(){pr_max(obj,obj.fsizeTmpe,cp)},s);
		}
		if(objfont > obj.fsizeTmpe){
			obj.maxmin = setInterval(function(){pr_min(obj,obj.fsizeTmpe,cp)},s);
		}
	}
}
function pr_max(obj,e,cp){
	if(!obj.fs){
		obj.fs=obj.style.fontSize;
	}
	var objfont=parseFloat(obj.fs);
	if(e > objfont){
	//document.getElementById("text").innerHTML+="放大 - 原始值："+objfont+" + 递增值："+e/10+"<br />";
		obj.fs = objfont+e/10+cp;
		obj.style.fontSize = obj.fs;
	}
	else if(e < objfont){
		obj.fs = e+cp;
		obj.style.fontSize = obj.fs;
	}
	else{clearInterval(obj.maxmin);}
}
function pr_min(obj,e,cp){
	if(!obj.fs){
		obj.fs=obj.style.fontSize;
	}
	var objfont=parseFloat(obj.fs);
	if(e < objfont){
	//document.getElementById("text").innerHTML+="缩小 - 原始值："+objfont+" - 递减值："+e/10+"<br />";
		obj.fs = objfont-e/10+cp;
		obj.style.fontSize = obj.fs;
	}
	else if(e > objfont){
		obj.fs = e+cp;
		obj.style.fontSize = obj.fs;
	}
	else{clearInterval(obj.maxmin);}
}







