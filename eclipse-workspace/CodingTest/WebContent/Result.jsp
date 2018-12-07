<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ListIterator"%>
<%@page import="com.Assessment.Patient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: #990000; text-align: center">
		Information of
		<%=request.getAttribute("PatientName")%>
		is shown below:
	</h1>
	<%
		List<Patient> list = (List<Patient>) request.getAttribute("PatientList");
		ListIterator<Patient> it = list.listIterator();
		int length = list.size();
		int count = 0;
		int o = 0;
	%>
	<center>
		<table style="width: 70%; top-margin: 30px; border: 1px solid white; background-color: #99ffcc; text-align: center">
			<%
				while (it.hasNext()) {
					if (it.next().getPatientName().equals(request.getAttribute("PatientName"))) {
						it.previous();
						if (o == 0) {
			%>
			<tr>
				<th style="border: 1px solid #0000cc; color: #ff3399">ID</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">NAME</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">AGE</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">BLOOD
					GROUP</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">PHONE</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">DATE OF
					ARRIVAL</th>
				<th style="border: 1px solid #0000cc; color: #ff3399">DATE OF
					RELEASE</th>
			</tr>
			<%
				}
			%>
			<tr>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getPatientNo());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getPatientName());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getPatientAge());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getPatientBlood());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getPatientPhone());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getDateOfArrival());
								it.previous();
					%>
				</td>
				<td style="border: 1px solid blue; color: #660066">
					<%
						out.println(it.next().getDateOfRelease());
					%>
				</td>
			</tr>
			<%
				o++;
					}
					count++;

				}
			%>
		</table>
	</center>
	<%
		if (count == length && o == 0) {
	%>
	<center>
		<%
			out.println("No such patient exist");
		%>
	</center>
	<%
		}
	%>
	<br>
	<br>
	<center>
		<button onclick="redirect()"
			style="width: 140px; height: 40px; border-radius: 10px; border-style: solid; border-width: 5px; color: #663300:font-size:16px">Home</button>
	</center>
	<script>
		function redirect() {
			location.href = "Index.html";
		}
	</script>
</body>
</html>