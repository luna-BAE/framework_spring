<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "../css/bootstrap.min.css"/>
<script type="text/javascript" src = "../js/jquery-1.12.4.js"></script>
<script type="text/javascript" src = "../js/bootstrap.min.js"></script>
</head>
<body>

<div class = "container">
	<div class = "row">
		<div class = "col-sm-12">
			비트교육센터
		</div>
	</div>
	
	<div class = "row">
		<div class = "col-sm-3">&nbsp;</div>
		<div class = "col-sm-2">
			<a href = "../index.do">home</a>
		</div>
		<div class = "col-sm-2">
			<a href = "list.do">dept</a>
		</div>
		<div class = "col-sm-2">
			<a href = "../list.do">emp</a>
		</div>
		<div class = "col-sm-3">&nbsp;</div>
	</div>
	
	<div class = "row">
		<div class = "col-sm-12">
			<h2>dept list</h2>
			<table class = "table">
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items = "${list }" var = "bean">
						<tr>
							<td><a href = "dept.do?deptno=${bean.deptno }"></a>${bean.deptno }</td>
							<td><a href = "dept.do?deptno=${bean.deptno }"></a>${bean.dname }</td>
							<td><a href = "dept.do?deptno=${bean.deptno }"></a>${bean.loc }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href = "add.do" class = "btn btn-default" role = "button">입력</a>
		</div>
	</div>
</div>

</body>
</html>