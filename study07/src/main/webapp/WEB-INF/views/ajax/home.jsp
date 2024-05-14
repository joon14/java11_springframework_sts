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
<title>Ajax 메인 페이지</title>
</head>
<body>
	<h2>Ajax 메인</h2>
	<hr>
	<ul>
		<li><a href="${path2 }/ajax/ajax1.do">ajax1 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax2.do">ajax2 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax3.do">ajax3 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax4.do">ajax4 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax5.do">ajax5 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax6.do">ajax6 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax7.do">ajax7 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax8.do">ajax8 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax9.do">ajax9 테스트</a></li>
		<li><a href="${path2 }/ajax/ajax10.do">ajax10 테스트</a></li>
	</ul>
	<hr>
</body>
</html>
