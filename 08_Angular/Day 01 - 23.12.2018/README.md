
# ng cli Available Commands:
* `ng new` Creates a new workspace and an initial Angular app.
* `ng serve` Builds and serves your app, rebuilding on file changes.



# Every angular project contains: 
* `a` is Archive	
* `d` is Directory	
```
Mode                LastWriteTime         Length Name
----                -------------         ------ ----
d-----        12/6/2018   6:11 PM                e2e
d-----        12/6/2018   6:16 PM                node_modules
d-----        12/6/2018   6:11 PM                src
-a----        12/6/2018   6:11 PM            246 .editorconfig
-a----        12/6/2018   6:11 PM            576 .gitignore
-a----        12/6/2018   6:11 PM           3759 angular.json
-a----        12/6/2018   6:16 PM         382584 package-lock.json
-a----        12/6/2018   6:11 PM           1304 package.json
-a----        12/6/2018   6:11 PM           1022 README.md
-a----        12/6/2018   6:11 PM            435 tsconfig.json
-a----        12/6/2018   6:11 PM           2824 tslint.json
```
You dont need for a core project this parts:
* `e2e` - runs end-to-end tests using Protractor.
* `.editorconfig` - configuration of the text editor
* `.gitignore` - is used to ignore parts when we upload this file to github
* `README.md` - is used to add documentation to github

You need for a core project this parts:
* `node_modules` - contains all the npm packages
* `src` - contains all the code of the app
* `angular.json` - contains all the configs of the angular project
* `package.json` - contains all the npm configs of the project
* `tsconfig.json` - contains all the configs to transpile ts to js
* `tslint.json` - rules to check that the ts code is written in a good way


# How to create and run basic angular app
* Open the node cli
* Run the following commands:
```bash
npm i -g @angular/cli   #install angular feom npm to global coputer
ng new proj             #create a new angular project (will create a new folder named `proj`)
cd proj                 #change the directory in the cli top the new project
ng serve --open         #runs the angular app in port 4200 in the browser 
``` 
* Open thew browser in `localhost:4200` to view the angular app



# IMPORTANT
We can delete this parts:
* `node_modules`
* `package-lock.json`
and re-install them, with this command:
```
npm i
```


# Export / Import
* To import from `node_modules/@angular/core`
```
import { Component } from '@angular/core';
```

* If we have `./` - it shows that the file is in the current directory
```
import { AppComponent } from './app.component';
```









