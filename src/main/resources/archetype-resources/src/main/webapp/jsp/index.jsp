<%@page pageEncoding="utf-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
	<title>Index</title>
	<s:head />
</head>
<body>
	<s:form action="helloWorld">
		<s:textfield label="What is your name?" name="name" />
		<s:submit />
	</s:form>
</body>
</html>
	