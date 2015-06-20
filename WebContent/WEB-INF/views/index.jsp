<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../kickstart/css/kickstart.css" media="all" />                  <!-- KICKSTART -->
</head>
<body>
<h1>測試 Page</h1>
<table  cellspacing="0" cellpadding="0" class="striped tight sortable">
<thead><tr>
<td>縣市</td><td>描述</td>
</tr></thead>
<tbody>
<c:forEach var="vo" items="${list}">
<tr>
<th>${vo.city}</th>
<th>${vo.description}</th>
</tr>
</c:forEach>
</tbody>
</table>
<script type="text/javascript" src="http://codeorigin.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="../kickstart/js/kickstart.js"></script>                                  <!-- KICKSTART -->
</body>
</html>