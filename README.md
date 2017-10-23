# organization-api


http: localhost:5001/organizations

## Accessing API without Token
* {
    "error": "unauthorized",
    "error_description": "Full authentication is required to access this resource"
}

## Accessing API with Access Token 
Authorization: Bearer <<acccess_token>>

```javascript
[
 {
            "name": "RevaturePRO",
            "content": [],
            "links": [
                {
                    "rel": "self",
                    "href": "http://localhost:5001/organizations/1"
                },
                {
                    "rel": "organization",
                    "href": "http://localhost:5001/organizations/1"
                }
            ]
        }
 ]
