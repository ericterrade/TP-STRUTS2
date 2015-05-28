<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<%@ include file="JspHeader.jsp" %>

<body>
	<div id="wrapper">

		<!-- Navigation -->
		<%@ include file="JspNav.jsp" %>
		
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header"><s:property value="%{getText('list.head.title')}"/></h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><s:property value="%{getText('list.body.h1')}" /></div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="dataTable_wrapper">
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
							</div>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<%@ include file="JspFooter.jsp" %>

</body>

</html>