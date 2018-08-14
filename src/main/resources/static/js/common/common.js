var contextPath = "";

//doT.js
//将数据（dataObject）绑定到指定元素（element）的后代元素
function dataBindToElement(element,dataObject){
	for (property in dataObject)  
	  {  
		var dataValue = dataObject[property];
		if(!dataValue){
			dataValue = "";
		}
		var $node = element.find("[identity='"+property+"']");
		if($node.prop("nodeName") === "INPUT" 
			|| $node.prop("nodeName") === "TEXTAREA" 
				|| $node.prop("nodeName") ==="SELECT"){
			$node.val(dataValue);
		}
		else{
			$node.text(dataValue);
		}
	  }
}

function getDataFromElement(element){
	var data = {};
	var $nodes = $(element).find("[identity]");
	$.each($nodes,function(i,n){
		var $n = $(n);
		if($n.prop("nodeName") === "INPUT" 
			|| $n.prop("nodeName") === "TEXTAREA" 
				|| $n.prop("nodeName") ==="SELECT"){
			
			data[$n.attr("identity")] = $n.val();
			
		}
		else{
			data[$n.attr("identity")] = $n.text();
		}
	});
	return data;
}

function getQueryString(name) { 
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
	var r = window.location.search.substr(1).match(reg); 
	if (r != null) return unescape(r[2]); return null; 
} 