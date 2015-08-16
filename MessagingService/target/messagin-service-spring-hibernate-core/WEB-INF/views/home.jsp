<%@ include file="/WEB-INF/views/inc/header.jsp" %>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>${allPosts}</p>

<c:forEach items="${allPosts}" var="post">
	
	<h1>${ post.category.name }</h1>
	
	<a href="${ post.source }"><h2>${ post.title }</h2></a>
	
	<p>${ post.description }</p>
	
	<p>
		<span>${ post.users.firstName } ${ post.users.lastName } ${ post.users.email }</span>
		<span>${ format.format(post.datetime) }</span>	
		<span>${ post.messages }</span>
		<c:if test="${empty post.messages }">
			${ "Пусто" }
		</c:if>
	</p>
		<c:forEach items="${post.messages}" var="res">
		
			<p>${ res.message } ${ res.users.firstName } ${ res.users.lastName }</p>
			
		</c:forEach>
	
</c:forEach>

<%@ include file="/WEB-INF/views/inc/footer.jsp" %>