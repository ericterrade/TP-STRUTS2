<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Ceci est une page Securisée</title>
</head>

<body>

	<hr>
	<h1>PAGE SECURISEE</h1>
	<s:actionmessage/>
	<s:iterator value="personnes"><s:property/></s:iterator>
	<hr>
</body>

</html>
