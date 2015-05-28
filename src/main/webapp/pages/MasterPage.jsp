<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="styles.css" rel="stylesheet" type="text/css" />
<title><tiles:insertAttribute name="titre" ignore="true" /></title>
<s:head />
</head>
<body>
	<tiles:insertAttribute name="entete" />
	<hr />
	<tiles:insertAttribute name="saisie" />
	<tiles:insertAttribute name="simulation" />
	<tiles:insertAttribute name="exception" />
	<tiles:insertAttribute name="erreur" />
	<tiles:insertAttribute name="simulations" />
</body>
</html>