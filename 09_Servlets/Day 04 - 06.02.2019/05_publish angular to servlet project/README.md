# How to publish angular to java EE
* Craete an angular project
* Change the path in the cli to the angular project
* Run the command:
    ```
    ng build --prod
    ```
* Coppy the html + css + js files from the nested folder in `dist` to `WebContent`
* Delete from `index.html` this line:
    ```html
    <base href="/">
    ```