# Servlet

## What is Servlet?
* A Servlet is an object that receives a request and generates a response based on that request. 
* The basic Servlet package defines Java objects to represent servlet requests and responses, as well as objects to reflect the servlet's configuration parameters and execution environment. 
* The package `javax.servlet.http` defines HTTP-specific subclasses of the generic servlet elements, including session management objects that track multiple requests and responses between the web server and a client. 
* Servlet is a Java technology-based Web component, managed by a container called servlet container or servlet engine

## What is servlet container?
* The servlet container is a part of a Web server or application server that provides the network services over which requests and responses are sent, decodes MIME-based requests, and formats MIME-based responses. 
* A servlet container also contains and manages servlets through their lifecycle.


## When a client request is sent to the servlet container, how does the container choose which servlet to invoke?
The servlet container determines which servlet to invoke based on the configuration of its servlets, and calls it with objects representing the request and response.


## Life cycle of a servlet
Three methods are central to the life cycle of a servlet. These are init(), service(), and destroy(). They are implemented by every servlet and are invoked at specific times by the server.

During initialization stage of the servlet life cycle, the web container initializes the servlet instance by calling the init() method, passing an object implementing the javax.servlet.ServletConfig interface. This configuration object allows the servlet to access name-value initialization parameters from the web application.
After initialization, the servlet instance can service client requests. Each request is serviced in its own separate thread. The web container calls the service() method of the servlet for every request. The service() method determines the kind of request being made and dispatches it to an appropriate method to handle the request. The developer of the servlet must provide an implementation for these methods. If a request is made for a method that is not implemented by the servlet, the method of the parent class is called, typically resulting in an error being returned to the requester.
Finally, the web container calls the destroy() method that takes the servlet out of service. The destroy() method, like init(), is called only once in the lifecycle of a servlet.