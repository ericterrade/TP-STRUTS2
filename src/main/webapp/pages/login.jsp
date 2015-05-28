<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<%@ include file="JspHeader.jsp"%>
<body>
	<div id="wrapper">
		<!-- Navigation -->
		<%@ include file="JspNav.jsp" %>
		<div id="page-wrapper">
			<div class="row">
				<div class=".col-md-4"></div>
				<div class=".col-md-4">
					<h1 class="page-header"><s:property value="%{getText('login.head.title')}"/></h1>

					<s:form action="login">
						<s:actionerror value="%{getText('login.error')}"/>
						<div class="form-group">
							<s:textfield name="personne.username" label="username"
								class="form-control" />
						</div>
						<div class="form-group">
							<s:password name="personne.password" label="password"
								class="form-control" />
						</div>

						<s:submit class="btn btn-success btn-lg" value="OK" />


					</s:form>
				</div>
				<div class=".col-md-4"></div>

			</div>

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->
	<%@ include file="JspFooter.jsp"%>
</body>
</html>