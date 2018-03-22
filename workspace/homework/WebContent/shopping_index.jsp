<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>拖放加入购物车</title>
		<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<style>
			*{padding:0px;margin:0px}
			table,thead{width: 100%;}
			tr th{width:25%;height:30px;background-color: #23B7E5;font-size: 16px;padding: 2px 0px;color:#fff;}
			tr td{text-align: center;padding: 5px 0px;background-color: #fff;font-size: 14px;}
			tr td a{padding: 2px 5px;border:1px solid #ddd;cursor: pointer;}
			ul li{list-style-type: none;overflow: hidden;}
			#div1{width:350px;height:100%;border:1px solid #ddd;position:fixed;right:0px;top:0px;
				background-color: #F5F5F5;
			}
			#div1 ul li p{50%;text-align: right;flex: 1;}
			#div2 ul{overflow: hidden;}
			#div2 ul li{float: left;width:150px;height:120px;border:1px solid #ddd;margin-right: 10px;}
			#div2 ul li img{width: 100%;height: 100%;}
			.div_panel{min-height: 200px;}
			.allMoney{position: absolute;right: 0px;}
		</style>
</head>
	<body>
	拖拽到右侧
		<div id="div2">
			<ul>
				<li>
					<img id="img1" src="shopping_images/cup1.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="23"/>
					<input type="hidden" id="inp_name" value="夏日凉凉" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup2.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="23"/>
					<input type="hidden" id="inp_name" value="果汁雪碧" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup4.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="23"/>
					<input type="hidden" id="inp_name" value="果汁可乐" /><br/><br/>
				</li>
				<li>
					<img id="img1" src="shopping_images/cup5.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="20"/>
					<input type="hidden" id="inp_name" value="西瓜汁" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup6.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="18"/>
					<input type="hidden" id="inp_name" value="水蜜桃" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup7.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="18"/>
					<input type="hidden" id="inp_name" value="凤梨汁" />
				</li><li>
					<img id="img1" src="shopping_images/cup8.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="18"/>
					<input type="hidden" id="inp_name" value="草莓汁" /><br/><br/>
				</li>
				<li>
					<img id="img1" src="shopping_images/cup9.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="20"/>
					<input type="hidden" id="inp_name" value="橙汁" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup10.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="18"/>
					<input type="hidden" id="inp_name" value="金桔汁" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup11.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="23"/>
					<input type="hidden" id="inp_name" value="珍珠奶茶" />
				</li>
				<li>
					<img id="img1" src="shopping_images/cup12.png" draggable="true" ondragstart="drag(this)" />
					<input type="hidden" id="inp_money" value="23"/>
					<input type="hidden" id="inp_name" value="原味奶茶" />
				</li>
			</ul>
		</div>
		<div id="div1" ondrop="drop()" ondragover="allowDrop(event)">
			<div class="div_panel">
				<table border="0" cellspacing="0" cellpadding="0">
					<thead>
						<tr>
							<th>名称</th>
							<th>单价</th>
							<th>数量</th>
							<th>价格</th>
						</tr>
					</thead>
					<tbody id="ul_panel"></tbody>
				</table>
			</div>
			<form align="center" width="600px" border="1" name="form1" method="post">
			<p class="allMoney">总价:<span id="totalMoney">0</span></p><br/><br/>
			<input type="submit" value="提交订单" onclick="form1.action='success.jsp'"/>
			<input type="submit" value="返回首页" onclick="form1.action='index.jsp'"/>
			</form>
		</div>
	</body>
	<script>
		var money=0;
		var name="";
		var data=[];
		function allowDrop(e){
			e.preventDefault();
		}
		function drag(t){
			money=$(t).siblings("#inp_money").val();
			name=$(t).siblings("#inp_name").val();
			/*var num=1;
			add(name,money,num);*/
		}
		function addJson(name,money){
			for(var j=0;j<data.length;j++){
				if(data[j].name==name){
					data[j].num++;
					return;
				}
			}
			data.push({
				money:money,
				name:name,
				num:1
			});
		}
		function addHtml(){
			var text_html='';
			var totalMoney=0;
			$("#ul_panel").html("");
			for(var i=0;i<data.length;i++){
				text_html+='<tr><td>'+data[i].name+'</td><td>'+data[i].money+'</td><td><a onclick="reduce(\'\'+'+i+',this)">-</a> '+data[i].num+' ';
				text_html+='<a onclick="addNum(\'\'+'+i+',this)">+</a></td><td>￥'+(data[i].money*data[i].num)+'</td></tr>';
				totalMoney+=data[i].money*data[i].num;
				$("#totalMoney").text(totalMoney);
			}
			$("#ul_panel").append(text_html);
		}
		function drop(){
			addJson(name,money);
			addHtml();
		}
		function reduce(a,t){
			data[a].num--;
			if(data[a].num==0){
				data.splice(a,1);
			}
			if(data.length==0){
				$("#totalMoney").text(0);
			}
			addHtml();
		}
		function addNum(a,t){
			data[a].num++;
			addHtml();
		}
		
	</script>