<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Enregistrement</title>
</head>

<body>

	<hr>
	<h1>Saisir un nouveau contact</h1>
	<hr>

	<s:form action="registration">
<%-- 		<s:fielderror/> --%>
		<p><s:textfield name="personne..nom" label="nom"/></p>
		<p><s:textfield name="personne..prenom" label="prenom"/></p>
		<p><s:textfield name="personne..username" label="username"/></p>
		<p><s:password name="personne..password" label="password"/></p>
		<p><s:submit/></p>
	
	</s:form>
</body>

</html>