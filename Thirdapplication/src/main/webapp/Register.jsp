<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<input type="text" id="input" name="name">
		<button onclick="vam()">Submit</button>

		<%!int a = 1;%>

		<%
		out.println(a * a);
		%>
		<%
		for (int i = 0; i < 5; i++) {
		%>
		<p>value
		<p class="ki"></p>
		:
		<%=i%>
		</p>
		<%
		}
		%>
		<table border="1 " cellpadding=5px>
			<tr>
				<th>i</th>
				<th>name</th>
				<th>age</th>
			</tr>

			<%
			for (int i = 0; i < 5; i++) {
			%>
			<tr>
				<td>i</td>
				<td>name</td>
				<td>age</td>
			</tr>

			<%
			}
			%>

		</table>




	</form>
	<script>
		function vam() {

			let a = document.getElementById("input").value;
			let c = document.getElementsByClassName("ki")[0];
			console.log(a);
			if(a==""){
				 c.innerHTML = "Input is empty!";
			        c.style.color = "red";
				
			}else{
				 c.innerHTML = "proceed!";
			        c.style.color = "green";
			}

			 c = document.getElementsByClassName("ki");
			for (let i = 1; i < c.length; i++) {
				c[i].innerHTML = a;
			}
		}
	</script>

</body>
</html>