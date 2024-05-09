<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<html>
<head>
<meta charset="UTF-8">
<title>Home - 메인 페이지</title>
</head>
<body>
	<h2>${serverTime }</h2>
	<h2>${author }</h2>
	<h2>${company }</h2>
	<hr>
	<a href="${path2 }/sample/list.do">샘플 목록</a>
	<ul>
		<li><a href="${path2 }/test/testList.do">테스트 목록</a></li>
		<li><a href="${path2 }/test/testList2.do">테스트 목록2</a></li>
	</ul>
	<hr>
	<ul>
		<li><a href="${path2 }/test2/get1.do?num=1&title='Get1'">get1</a>
		<li><a href="${path2 }/test2/get2.do?num=2&title='Get2'">get2</a>
		<li><a href="${path2 }/test2/get3.do?num=3&title='Get3'">get3</a>
		<li><a href="${path2 }/test2/get4.do/4/'Get4'">get4</a>
		<li><a href="${path2 }/test2/get5.do?num=5&title='Get5'">get5</a>
	</ul>
	<hr>
	<ul>
		<li><a href="${path2 }/test2/post.do">post</a>
	</ul>
</body>
</html>
