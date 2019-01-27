# Apache Tomcat

link to download: https://tomcat.apache.org/download-80.cgi 
***

* Apache Tomcat, often referred to as Tomcat Server, is an open-source Java Servlet Container developed by the Apache Software Foundation (ASF).
* Tomcat implements several Java EE specifications including Java Servlet, JavaServer Pages (JSP), Java EL, and WebSocket, and provides a "pure Java" HTTP web server environment in which Java code can run.
* Tomcat is developed and maintained by an open community of developers under the auspices of the Apache Software Foundation, released under the Apache License 2.0 license, and is open-source software.


## Tomcat Components
#### Catalina
* Catalina is Tomcat's servlet container. 
* Catalina implements Sun Microsystems's specifications for servlet and JavaServer Pages (JSP). 
* In Tomcat, a Realm element represents a "database" of usernames, passwords, and roles (similar to Unix groups) assigned to those users. 

#### Coyote
* Coyote is a Connector component for Tomcat that supports the HTTP 1.1 protocol as a web server. 
* This allows Catalina, nominally a Java Servlet or JSP container, to also act as a plain web server that serves local files as HTTP documents. 
* Coyote listens for incoming connections to the server on a specific TCP port and forwards the request to the Tomcat Engine to process the request and send back a response to the requesting client. 

#### Jasper
* Jasper is Tomcat's JSP Engine. 
* Jasper parses JSP files to compile them into Java code as servlets (that can be handled by Catalina). 
* At runtime, Jasper detects changes to JSP files and recompiles them.


#### Cluster
* This component has been added to manage large applications. 
* It is used for load balancing that can be achieved through many techniques. 
* Clustering support currently requires the JDK version 1.5 or higher.


