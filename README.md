# API DOCUMENTATION

## Allowed HTTP Requests:
PUT     : To create resource 
POST    : Update resource
GET     : Get a resource or list of resources
DELETE  : To delete resource

# SHOW EMPLOYEES
Returns an array of json objects that represents the employee details
## URL
[http://localhost:3000/api/employees]
## METHOD
```GET```
## URL Params
### Required:
none
## Data Params:
none
## Query Params:
``*pagesize: The total number of items that a page shows.
..*currentpage: The current page number like 1, 2, 3, or 4.
## Success Response:
..*Code: 200
..*Content: ```{
    "employees": [
        {
            "skills": [
                "C++",
                "React",
                "Java",
                "Angular",
                ""
            ],
            "_id": "5fe7239c88b4fb5ee7705e39",
            "name": "SRISHTI WASTI",
            "dateOfBirth": "2020-02-11T18:30:00.000Z",
            "salary": "1200000",
            "imagePath": "http://localhost:3000/images/srishti-wasti-1608983452592.png",
            "__v": 0
        },
        {
            "skills": [
                "C++",
                "Java",
                "React",
                "",
                "Angular",
                ""
            ],
            "_id": "5fe7240b88b4fb5ee7705e3a",
            "name": "UMA WASTI!!!",
            "dateOfBirth": "2020-01-11T18:30:00.000Z",
            "salary": "1200000",
            "imagePath": "http://localhost:3000/images/uma-wasti-1608988809820.png",
            "__v": 0
        },
        {
            "skills": [
                "C++",
                "Java",
                "React",
                "Angular",
                ""
            ],
            "_id": "5fe787e7d5e9358ef7823722",
            "name": "SACHET WASTI",
            "dateOfBirth": "2020-11-30T18:30:00.000Z",
            "salary": "1200000",
            "imagePath": "http://localhost:3000/images/sachet-wasti-1609009127769.png",
            "__v": 0
        },
        {
            "skills": [
                "C++",
                "Java",
                "React",
                ""
            ],
            "_id": "5fe79bc89f20f89e1dbdf1fe",
            "name": "RASHMI DAHAL",
            "dateOfBirth": "2020-12-12T18:30:00.000Z",
            "salary": "1000000",
            "imagePath": "http://localhost:3000/images/rashmi-dahal-1609014216198.jpeg",
            "__v": 0
        },
        {
            "skills": [
                "C++",
                "Java",
                "React",
                ""
            ],
            "_id": "5fe79bf39f20f89e1dbdf1ff",
            "name": "SHYAM WASTI",
            "dateOfBirth": "2020-12-05T18:30:00.000Z",
            "salary": "1800000",
            "imagePath": "http://localhost:3000/images/shyam-wasti-1609014259149.png",
            "__v": 0
        }
    ],
    "maxEmployees": 5
}```
