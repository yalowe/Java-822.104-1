# Create and use a service - in angular
* To add a service to the project, run this command:
```
ng g s SRRVICENAME
```
* To get a refernce to this singleton service, in a component, add to the constructor a property with the service type, and angulae will do the `DI` (DEPENDENCY INJECTION).    
*note:* you must add the prefix `private` to the service property in the constructor of the component