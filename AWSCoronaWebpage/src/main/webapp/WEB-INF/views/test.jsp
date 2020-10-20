<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>AWS Corona Webpage</title>

  <!-- Custom fonts for this template-->
  <link href="/aws/boot/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<script src="/aws/boot/vendor/jquery/jquery.min.js"></script>
  <!-- Custom styles for this template-->
<!--   <link href="/aws/boot/css/sb-admin-2.min.css" rel="stylesheet">
 -->
 <script type="text/javascript">
/* 	$(document).ready(function(){
		dailyCorona();
		var a="hi";
		$("#test").html(a);
	});
	function dailyCorona(){
		$.ajax({
			type: "get",
			url: "/aws/corona?date=20201018",
		    datatype: "json",
			success: function(result){
				$("#res").html(result);
				alert("값:"+result);
			}
			
		});
	} */
	$(document).ready(function(){
		dailyCorona();
		var a="hi";
		$("#test").html(a);
	});
	var settings = {
			  "url": "/aws/corona?date=20201018",
			  "method": "GET",
			  "timeout": 0,
			  "datatype": "json"
			};
	function dailyCorona(){
		$.ajax(settings).done(function (response) {
			 console.log(response);
			 var get=JSON.parse(response);
			 console.log(get);
			 var json = "<h4>Ajax Response</h4><pre>" + JSON.stringify(response, null, 4) + "</pre>";
			 $("#res").html(get.date);
				//alert("값:"+get);
		});
	}
</script>
</head>
<body>
<div id="res"gt;lt;></div>
</body>

</html>
