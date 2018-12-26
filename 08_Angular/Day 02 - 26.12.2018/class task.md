# Class task
* Create a new angular app
* Add to this app a "people-component" that will contain in the ts, the following array:

```json
[
    {
        "first_name": "Eve",
        "last_name": "Holt",
        "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"
    },
    {
        "first_name": "Charles",
        "last_name": "Morris",
        "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg"
    },
    {
        "first_name": "Tracey",
        "last_name": "Ramos",
        "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"
    }
]
```
* In the `html` of the "people-component" show in a table the details and image of each person (with `*ngFor`)

* Add to "app-component" html - an instance of the "people-component"