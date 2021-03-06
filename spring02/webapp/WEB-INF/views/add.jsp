<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<!-- menu -->
<nav class="navbar navbar-default  navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
      비트교육센터
      </a>
    </div>
    <ul class="nav navbar-nav">
    	<li><a href="index.do">home</a></li>
    	<li><a href="intro.do">intro</a></li>
    	<li><a href="list.do">dept</a></li>
    </ul>
  </div>
</nav>

<!-- content -->
<div class="container">
	<div class="row">
	  <div class="col-xs-12">
	  <!-- start -->
	  <ol class="breadcrumb">
  <li><a href="index.do">Home</a></li>
  <li><a href="list.do">DEPT</a></li>
  <li class="active">ADD</li>
</ol>
	  <div class="page-header">
  <h1>입력 페이지 <small>DEPT 테이블 추가</small></h1>
</div>

	<!-- 입력 폼 작업 -->
<form class="form-horizontal" action="insert.do" method="post">
<!-- 여기서 입력 후에 폼 액션이 일어나면 insert.do 이름으로 핸들러를 찾음 -->
  
    <div class="form-group">
    <label for="deptno" class="col-sm-2 control-label">deptno</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name = "deptno" id=""deptno placeholder="deptno">
    </div>
  </div>
  
    <div class="form-group">
    <label for="dname" class="col-sm-2 control-label">dname</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name = "dname" id="dname" placeholder="dname">
    </div>
  </div>
  
    <div class="form-group">
    <label for="loc" class="col-sm-2 control-label">loc</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name = "loc" id="loc" placeholder="loc">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">입력</button>
      <button type="reset" class="btn btn-default">취소</button>
    </div>
  </div>
</form>
	  <!-- end -->
	  </div>
	</div>
		<div class="row">
	  <div class="col-xs-12 text-center">
	  Copyright &copy; 비트캠프 </div>
	</div>
</div>
</body>
</html>