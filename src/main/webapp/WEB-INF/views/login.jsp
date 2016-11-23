<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Spring Security</title>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>



 <div class="container">
     <div class="row">
         <div class="col-md-offset-5 col-md-3">
             <div class="form-login">
                <c:choose>
                    <c:when test="${not empty error}">
                        <div class="alert alert-danger fade in">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                            <strong>Ops!</strong> ${error}
                        </div>
                    </c:when>
                    <c:otherwise>
                        <h4>Welcome back.</h4>
                    </c:otherwise>
                </c:choose>
                 <form name='form_login' action="j_spring_security_check" method='POST'>
                     <input type="text" name='user_login' id="userName" class="form-control input-sm chat-input" placeholder="username" />
                     </br>
                     <input type="password" name='password_login' id="userPassword" class="form-control input-sm chat-input" placeholder="password" />
                     </br>
                     <div class="wrapper">
                         <input name="submit" type="submit" value="submit" class="btn btn-primary btn-md"/>
                     </div>
 	            </form>
             </div>
         </div>
     </div>
 </div>

</body>
</html>