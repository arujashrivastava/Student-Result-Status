<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td{
border: 1 px solid-black;
border-collapse: collapse;
}

</style>
</head>
<body>
<form method = "post" action = "movieBook">
Enter Name: <input type ="text" name ="cname" placeholder = "Enter your name">
<br><br>
<table border = 1 width =30%>

<tr>
<th>Subject</th>
<th>Marks</th>
<th>Total Marks</th>
</tr>

<tr>
<td>Machine Learning</td>
<td><input type = "text" name = "m1" placeholder = "Enter marks" size =35></td>
<td>100</td>
</tr>

<tr>
<td>Python</td>
<td><input type = "text" name = "m2" placeholder = "Enter marks" size =35 ></td>
<td>100</td>

</tr>

<tr>
<td>Data<br> Science</td>
<td><input type = "text" name = "m3"  placeholder = "Enter marks" size =35></td>
<td>100</td>
</tr>

<tr>
<td>Java<br> Advance</td>
<td><input type = "text" name = "m4" placeholder = "Enter marks" size =35></td>
<td>100</td>
</tr>

<tr>
<td>Operating System</td>
<td><input type = "text" name = "m5" placeholder = "Enter marks" size =35></td>
<td>100</td>
</tr>

</table>
<input type = "submit" value = "Submit" action = "movieBook">
</form>
</body>
</html>