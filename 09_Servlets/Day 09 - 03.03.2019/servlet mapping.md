# servlet mapping
when your current servlet mapping is
```xml
<servlet-mapping>
<servlet-name>Jersey REST Service</servlet-name>
<url-pattern>/*</url-pattern>
```
which redirects every request to jersey. so to make welcome page visible you need to make entry like
```xml
<servlet-mapping>
<servlet-name>Jersey REST Service</servlet-name>
<url-pattern>/rest</url-pattern>
```
this pattern will call jersey only for urls like
```
http://localhost:8080/rest/
```
and thus url
```
http://localhost:8080/index.html
```
will not be redirected to jersey servlet.
