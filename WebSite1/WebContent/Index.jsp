<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Drools Test Page</title>
</head>
		<body>
<B>Enter the Below details!</B>
<form name="form1" onsubmit="JavaScript:evaluatefunc()"> 
	<div style="height: 54px; width: 740px"><br>
		Enter Your Name:.<input id="Name"><br><br>
		Enter your age:..... <input id="Age"><br><br>
		Are you covered?<br>
		<div>
		 True.<input name="coverage" type="radio">
		 False<input name="coverage" type="radio">
		</div><br><br>
		 <input name="Submit" type="submit" value="EVALUATE">
	</div>
</form>
		</body>

<jsp:useBean id="patients" class="com.example.website1.bean.MediclaimProcessModel">
<jsp:setProperty name="patients" property="userName"/>
<jsp:setProperty name="patients" property="userAge"/>
<jsp:setProperty name="patients" property="userCoverage"/>
</jsp:useBean>

		<script type="text/javascript">
		function evaluatefunc()
		{
		var Name = document.getElementById("Name").value;
		var Age = document.getElementById("Age").value;
		//alert("Hi");
		
	 	if (Name==="")
		alert("Name cannot be left blank !!");
		else if (Age==="")
		alert("Please enter age (in numbers!!)");
		</script>
</html>