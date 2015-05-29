<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<%@ include file="JspHeader.jsp" %>
<body>
<div id="wrapper">
  <!-- Navigation -->
<%@ include file="JspNav.jsp" %>

<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="page-header">Rechercher une Personne</h2>
                </div>
                
              	<div class="col-lg-12">
                    <s:url id="ajaxTest" value="updateList" />
                    <sj:submit id="link1" href="%{ajaxTest}" targets="result">
                    </sj:submit>
                    <div id="result"></div>
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