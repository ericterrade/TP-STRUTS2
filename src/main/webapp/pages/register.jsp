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
                    <h1 class="page-header"><s:property value="%{getText('register.body.h1')}"/></h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Form Elements
                        </div>
                        <div class="panel-body">
							<div class="row">
								<div class="col-lg-6">
									<s:form action="registration">
										<%-- 		<s:fielderror/> --%>
										<div class="form-group">
											<s:textfield name="personne.nom"
												label="%{getText('personne.nom.label')}"
												class="form-control" />
										</div>
										<div class="form-group">
											<s:textfield name="personne.prenom"
												label="%{getText('personne.prenom.label')}"
												class="form-control" />
										</div>
										<div class="form-group">
											<s:textfield name="personne.age"
												label="%{getText('personne.age.label')}"
												class="form-control" />
										</div>
										<div class="form-group">
											<s:textfield name="personne.email"
												label="%{getText('personne.email.label')}"
												class="form-control" />
										</div>
										<div class="form-group">
											<s:textfield name="personne.username"
												label="%{getText('personne.username.label')}"
												class="form-control" />
										</div>
										<div class="form-group">
											<s:password name="personne.password"
												label="%{getText('personne.password.label')}"
												class="form-control" />
										</div>
										<s:submit class="btn btn-default" />
							
									</s:form>

								</div>
								<!-- /.col-lg-6 (nested) -->
								<div class="col-lg-6"></div>
								<!-- /.col-lg-6 (nested) -->
							</div>
							<!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
<%@ include file="JspFooter.jsp" %>
   
</body>

</html>