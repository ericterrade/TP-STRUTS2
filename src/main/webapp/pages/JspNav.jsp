 <%@ taglib prefix="s" uri="/struts-tags"%>
 <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index">TP STRUTS <span class="struts2">2</span></a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                  <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-language fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="?request_locale=fr"><i class="fa fa-flag-checkered fa-fw"></i> Français</a>
                        </li>
                        <li><a href="?request_locale=en"><i class="fa fa-flag-o fa-fw"></i> Anglais</a>
                        </li>
                    </ul>
                    </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="<%= request.getContextPath() %>/logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="<%= request.getContextPath() %>/index"><i class="fa fa-dashboard fa-fw"></i><s:property value="%{getText('nav.index')}"/></a>
                        </li>
                        <li>
                            <a href="<%= request.getContextPath() %>/secure/listPersonne"><i class="fa fa-table fa-fw"></i><s:property value="%{getText('nav.list.personne')}"/></a>
                        </li>
                        <li>
                            <a href="<%= request.getContextPath() %>/register"><i class="fa fa-edit fa-fw"></i><s:property value="%{getText('nav.new.personne')}"/></a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>