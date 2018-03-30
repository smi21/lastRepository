<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
  
<!-- Mirrored from themes.loxdesign.net/phoenix/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 13 Apr 2016 06:25:05 GMT -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta charset="utf-8">
    <title>Phoenix - Login</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="description" content="">
    <meta name="author" content="">

  <!-- ===================== Touch Icons ===================== -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="apple-touch-icon-57-precomposed.png">

    <!-- ===================== CSS ===================== -->    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>  
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap/bootstrap-responsive.min.css">    

    <!-- Site specific - CSS -->   
    <link rel="stylesheet" href="css/theme_light/filevalidation/validationEngine.jquery.css">

    <!-- Common - CSS --> 
    <link rel="stylesheet" href="css/theme_light/common.css">  
    <link rel="stylesheet" href="css/theme_light.css" class="style_set">
    
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>
  <body> 
    <div id="loader_cont"><img src="img/loaders/page_loader.gif"></div> 
    <div class="options_cont">
      <form name="myForm">
        <a class="options_btn" href="#">OPTIONS</a> 
        <div class="options group">
          <div>
            <p>Background image:</p>
            <ul class="background_list">
              <li><a class="current" id='bg_1' href="#">bg_1</a></li>
              <li><a id='bg_2' href="#">bg_2</a></li>
              <li><a id='bg_3' href="#">bg_3</a></li>
              <li><a id='bg_4' href="#">bg_4</a></li>
              <li><a id='bg_5' href="#">bg_5</a></li>
              <li><a id='bg_6' href="#">bg_6</a></li>
              <li><a id='bg_7' href="#">bg_7</a></li>
              <li><a id='bg_8' href="#">bg_8</a></li>
              <li><a id='bg_9' href="#">bg_9</a></li>
              <li><a id='bg_10' href="#">bg_10</a></li>
            </ul>
          </div>
          <div>
            <p>Color styling:</p>
            <ul class="color_list">
              <li><a class="current" id='c_1' href="#" title="Rose">rose</a></li>
              <li><a id='c_2' href="#" title="Orange">orange</a></li>
              <li><a id='c_3' href="#" title="Apple Green">apple_green</a></li>
              <li><a id='c_4' href="#" title="Sky Blue">sky_blue</a></li>
              <li><a id='c_5' href="#" title="Purple">purple</a></li>
            </ul>            
          </div>
          <div>
            <p>Patterns:</p>
            <ul class="pattern_list">
              <li><a class="current" id='p_1' href="#" title="Stripes Right">p_1</a></li>
              <li><a id='p_2' href="#" title="Stripes Left">p_2</a></li>
              <li><a id='p_3' href="#" title="Noise">p_3</a></li>
              <li><a id='p_4' href="#" title="Plain">p_4</a></li>              
            </ul>            
          </div>
          <div class="top_mn_setup">
            <p>Display top menu on:</p>
            <div>
              <input id="top_menu_click" checked="checked" type="radio" value="1" class="menu_show" name="top_menu_show"><label for="top_menu_click">Click</label>
              <input id="top_menu_hover" type="radio" value="0" class="menu_show" name="top_menu_show"><label for="top_menu_hover">Hover</label>
            </div>            
          </div>  
          <div class="clear_cache_cont"><a class="btn btn-mini" href="#">Clear Cache</a></div>              
        </div> 
      </form> 
    </div>    
      
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="go_to_front" href="#">Go to Frontpage</a>          
          <h1 class="brand"><a href="index-2.jsp">PHOENIX</a></h1>                                       
        </div>
      </div>
    </div>

    <div class="login_main_cont">      
        <div class="login_cont group login">
            <ul class="login_switcher">
             <li><a class="login_l akt" href="#"><span>Login</span></a></li>
              <li><a class="login_s" href="#"><span>Sign up</span></a></li>
              <li><a class="login_f" href="#"><span>Forgot password</span></a></li>
            </ul>
            <h2>Login</h2>          
            <div class="login_form">
              <form class="formClass" method="post" action="login">
                <fieldset>                
                    <label for="username"><span>Username</span></label>
                    <input id="username" name="name" class="validate[required] text-input" placeholder="username" type="text" tabindex="1" accesskey="u">                
                </fieldset>
                <fieldset>                
                    <label class="pw_cont" for="password"><span>Password</span></label>
                    <input id="password" name="password" class="validate[required] text-input" placeholder="password" type="password" tabindex="2" accesskey="p">                
                </fieldset>
                <fieldset class="login_submit"><button type="submit" class="btn">LOGIN</button></fieldset>
             <h4>New Member?<a href="Register.jsp"> Register Here</a></h4>
            <!--    <fieldset class="login_social">              
                    <ul class="left">
                      <li><input type="checkbox" class="remember" name="remember" value="1" tabindex="3"></li>
                      <li class="info"><span>REMEMBER ME</span></li>
                    </ul>                
                    <ul class="right">                  
                      <li class="info"><span>SIGN IN WITH</span></li>
                      <li><a class="login_facebook" href="#"><span>Facebook</span></a></li>
                      <li><a class="login_twitter" href="#"><span>Twitter</span></a></li>
                    </ul>               
                </fieldset>           -->           
              </form>      
            </div>
        </div> 
        <div class="login_cont group sign_up">
            <ul class="login_switcher">
              <li><a class="login_l" href="#"><span>Login</span></a></li>
              <li><a class="login_s akt" href="#"><span>Sign up</span></a></li>
              <li><a class="login_f" href="#"><span>Forgot password</span></a></li>
            </ul>
            <h2>Sign up</h2>
            <div class="login_form">          
              <form class="formClass" action="login">
                <fieldset>                
                    <label class="email_cont" for="email_s"><span>Email</span></label>
                    <input id="email_s" name="email_s" class="validate[custom[email]] text-input" placeholder="email" type="text" tabindex="1" accesskey="e">                
                </fieldset>
                <fieldset>                
                    <label for="username_s"><span>Username</span></label>
                    <input id="username_s" name="name" class="validate[required] text-input" placeholder="username" type="text" tabindex="2" accesskey="u">                
                </fieldset>
                 <fieldset>                
                    <label class="pw_cont" for="password_s"><span>Password</span></label>
                    <input id="password_s" name="pd" class="validate[required] text-input" placeholder="password" type="password" tabindex="3" accesskey="p">                
                </fieldset>
                <fieldset class="login_submit"><button type="submit" class="btn">SIGN UP</button></fieldset>
                  <fieldset class="login_social">                                                  
                      <ul class="right">                  
                        <li class="info"><span>SIGN IN WITH</span></li>
                        <li><a class="login_facebook" href="#"><span>Facebook</span></a></li>
                        <li><a class="login_twitter" href="#"><span>Twitter</span></a></li>
                      </ul>               
                  </fieldset>                    
              </form> 
            </div>     
        </div>
        <div class="login_cont group forgot">
            <ul class="login_switcher">
              <li><a class="login_l" href="#"><span>Login</span></a></li>
              <li><a class="login_s" href="#"><span>Sign up</span></a></li>
              <li><a class="login_f akt" href="#"><span>Forgot password</span></a></li>
            </ul>
            <h2>Forgot Password</h2> 
            <div class="login_form">          
              <form class="formClass" action="login">
                <fieldset>                
                    <label class="email_cont" for="email_f"><span>Email</span></label>
                    <input id="email_f" name="email_f" placeholder="email" class="validate[custom[email]] text-input"  type="text" tabindex="1" accesskey="u">                
                </fieldset>
                <fieldset>                
                    <label for="username_f"><span>Username</span></label>
                    <input id="username_f" name="username_f" class="validate[required] text-input" placeholder="username" type="text" tabindex="1" accesskey="u">                
                </fieldset>                            
                <fieldset class="login_submit"><button type="submit" class="btn">RECOVER PASSWORD</button></fieldset>
                  <fieldset class="login_social">                                                
                      <ul class="right">                  
                        <li class="info"><span>SIGN IN WITH</span></li>
                        <li><a class="login_facebook" href="#"><span>Facebook</span></a></li>
                        <li><a class="login_twitter" href="#"><span>Twitter</span></a></li>
                      </ul>               
                  </fieldset>                      
              </form>  
            </div>                    
        </div>                
    </div>

    <!-- ===================== JS ===================== -->
    <script src="js/libs/jquery-1.7.2.min.js"></script>    
    <script src="js/libs/bootstrap.min.js"></script>   
	<script src="js/libs/ios-orientationchange-fix.js"></script> 
    <script src="js/libs/jquery-ui-1.8.20.custom.min.js"></script>  
    <script src="js/plugins/filevalidation/languages/jquery.validationEngine-en.js"></script>  
    <script src="js/plugins/filevalidation/jquery.validationEngine.js"></script>  
    <script src="js/common.js"></script>
	
	<!-- Site specific - JS -->  
	<script src="js/script.js"></script>   
    <script src="js/specific/login.js"></script>  
    
    <script type="text/javascript">

      var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-31818910-2']);
      _gaq.push(['_setDomainName', 'loxdesign.net']);
      _gaq.push(['_trackPageview']);

      (function() {
        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
      })();

    </script>
  </body>

<!-- Mirrored from themes.loxdesign.net/phoenix/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 13 Apr 2016 06:25:07 GMT -->
</html>