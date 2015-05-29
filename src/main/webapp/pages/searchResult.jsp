<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="table table-striped table-bordered table-hover"
	id="dataTables-example">
	<thead>
		<tr>
			<th><s:property value="#" /></th>
			<th><s:property value="%{getText('personne.nom.label')}" /></th>
			<th><s:property value="%{getText('personne.prenom.label')}" /></th>
			<th><s:property value="%{getText('personne.age.label')}" /></th>
			<th><s:property value="%{getText('personne.email.label')}" /></th>
			<th><s:property value="%{getText('personne.username.label')}" /></th>
			<th><s:property value="%{getText('personne.password.label')}" /></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="personnes">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="nom" /></td>
				<td><s:property value="prenom" /></td>
				<td><s:property value="age" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="username" /></td>
				<td><s:property value="password" /></td>
			</tr>
		</s:iterator>
	</tbody>
</table>