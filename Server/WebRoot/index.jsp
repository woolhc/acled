<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=ByWCdZrGIRyrmAxkUDTvqeKi">
   
</script>
<script type="text/javascript">
    var xmlhttp;
    var map;
    function loadMap() {
        map = new BMap.Map("container");
        var point = new BMap.Point(22.00000, 17.81722);
        map.centerAndZoom(point, 5);
    }
    function loadXMLDoc(url) {
        xmlhttp = null;
        if (window.XMLHttpRequest) {// code for all new browsers
            xmlhttp = new XMLHttpRequest();
        }
        else if (window.ActiveXObject) {// code for IE5 and IE6
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        if (xmlhttp != null) {
            xmlhttp.onreadystatechange = state_Change;
            xmlhttp.open("POST", url, true);
            xmlhttp.send(null);
        }
        else {
            alert("Your browser does not support XMLHTTP.");
        }
    }

    function state_Change() {
        if (xmlhttp.readyState == 4) {// 4 = "loaded"
            if (xmlhttp.status == 200) {// 200 = OK
                // ...our code here...
                var points = eval(xmlhttp.responseText);
                for (var i = 0; i < points.length;i++){
                    addPoint(map, points[i].jing, points[i].wei, points[i].information);
                }
     
            }
            else {
                alert("Problem retrieving XML data");
            }
        }
    }

    function addPoint(map, jing, wei, message) {
        var point = new BMap.Point(jing, wei);
        var mark = new BMap.Marker(point);
        map.addOverlay(mark);
        var opts = {
            width: 250,     // 信息窗口宽度    
            height: 100,     // 信息窗口高度    
            title: "冲突信息"  // 信息窗口标题   
        }
        var infoWindow = new BMap.InfoWindow(message, opts);  // 创建信息窗口对象    
        mark.addEventListener("click", function () {
            map.openInfoWindow(infoWindow, point);
        });
    }
</script>
</head>  
 
<body>  
<div id="container"></div> 
<script type="text/javascript"> 
//var map = new BMap.Map("container");          
//var point = new BMap.Point(22.00000, 17.81722);
    //map.centerAndZoom(point, 5);
loadMap();
loadXMLDoc("http://localhost:8080/Server/PointServlet");
</script>  
</body>  
</html>
