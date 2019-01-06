# Http requests from client

# Get
*Request:* https://reqres.in/api/users?page=2    
   

*Status:* 200



*Response:*
```json
{
    "page": 2,
    "per_page": 3,
    "total": 12,
    "total_pages": 4,
    "data": [
        {
            "id": 4,
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"
        },
        {
            "id": 5,
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg"
        },
        {
            "id": 6,
            "first_name": "Tracey",
            "last_name": "Ramos",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"
        }
    ]
}
```


# Post
*Request:* https://reqres.in/api/users  

*body:*
```json
{
    "name": "morpheus",
    "job": "leader"
}
```
   

*Status:* 201



*Response:*
```json
{
    "name": "morpheus",
    "job": "leader",
    "id": "834",
    "createdAt": "2018-12-13T16:14:07.823Z"
}
```


# Put
*Request:* https://reqres.in/api/users/2

*body:*
```json
{
    "name": "morpheus",
    "job": "zion resident"
}
```


   

*Status:* 200



*Response:*
```json
{
    "name": "morpheus",
    "job": "zion resident",
    "updatedAt": "2018-12-13T16:18:08.782Z"
}
```


# Delete

*Request:* https://reqres.in/api/users/2    

*Status:* 204



