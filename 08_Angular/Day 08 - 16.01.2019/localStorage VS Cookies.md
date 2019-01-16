# localStorage VS Cookies
With localStorage, web applications can store data locally within the user's browser. Before HTML5, application data had to be stored in cookies, included in every server request. Large amounts of data can be stored locally, without affecting website performance. Although localStorage is more modern, there are some pros and cons to both techniques.

## Cookies
### Pros
* Legacy support (it's been around forever)
* Persistent data
* Expiration dates
### Cons
* Each domain stores all its cookies in a single string, which can make parsing data difficult
Data is unencrypted 
* cookies are sent with every HTTP request Limited size (4KB)


## Local storage
### Pros
* Support by most modern browsers
* Persistent data that is stored directly in the browser
* Same-origin rules apply to local storage data
* Is not sent with every HTTP request
* ~5MB storage per domain (that's 5120KB)
* Non-Expiration dates
### Cons
* Not supported by anything before: IE 8, Firefox 3.5, Safari 4, Chrome 4, Opera 10.5, iOS 2.0, Android 2.0
* If the server needs stored client information you purposely have to send it.

***

*localStorage values on Secure (SSL) pages are isolated" as someone noticed keep in mind that localStorage will not be available if you switch from 'http' to 'https' secured protocol, where the cookie will still be accesible. This is kind of important to be aware of if you work with secure protocols.*
