# Real Estate API
A Real Estate API made with Spring Boot, Jpa, Mysql and Hibernate

## Version: v1

**License:** [MIT](https://choosealicense.com/licenses/mit/)

### /api/v1/users/{id}

#### GET
##### Summary

Get A Specific User

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### PUT
##### Summary

Update User's Details

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### DELETE
##### Summary

Delete a User

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/users/register

#### POST
##### Summary

Register User

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/users/login

#### POST
##### Summary

Authenticate to Use API

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/users

#### GET
##### Summary

Get All Users

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/tenants/update/{id}

#### PUT
##### Summary

Update a tenant's Details

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/tenants

#### POST
##### Summary

Add a Tenant

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/tenants/id/{id}

#### GET
##### Summary

Find a Tenant By Id

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/tenants/apartment/{apartmentId}

#### GET
##### Summary

Find Tenants By apartmentId

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| apartmentId | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/tenants/delete/{id}

#### DELETE
##### Summary

Delete a Tenant

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/landlords/update/{id}

#### PUT
##### Summary

Update A Landlords Details

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/landlords

#### GET
##### Summary

Find All Landlords

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### POST
##### Summary

Add a Landlord

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/landlords/{fullName}

#### GET
##### Summary

Find A Specific Landlord

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| fullName | path |  | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/landlords/delete/{id}

#### DELETE
##### Summary

Delete a Landlord

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units/update/{id}

#### PUT
##### Summary

Update a House Unit Details

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units

#### GET
##### Summary

Get All House Units

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### POST
##### Summary

Add A House Unit

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units/{houseNumber}

#### GET
##### Summary

Get a Specific House Unit

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| houseNumber | path |  | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units/id/{id}

#### GET
##### Summary

Get A House Unit By Id

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units/apartment/{id}

#### GET
##### Summary

Find All House Units In a Specific Apartment

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_units/delete/{id}

#### DELETE
##### Summary

Delete A House Unit

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_types/update/{id}

#### PUT
##### Summary

Update A House Type Detail

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_types

#### GET
##### Summary

Get All House Types

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### POST
##### Summary

Add House Types e.g Bedsitter, One Bedroom etc.

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/house_types/delete/{id}

#### DELETE
##### Summary

Delete A House Type

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/apartments/update/{id}

#### PUT
##### Summary

Update A Specific Apartment Details

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/apartments

#### GET
##### Summary

Find All Apartments

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

#### POST
##### Summary

Add an Apartment

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/apartments/{name}

#### GET
##### Summary

Find A Specific Apartment By name

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| name | path |  | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/apartments/id/{id}

#### GET
##### Summary

Find A Specific Apartment By Id

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/apartments/delete/{id}

#### DELETE
##### Summary

Delete A Specific Apartment By Id

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/billing

#### POST
##### Summary

Post a Bill

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/billing/tenant/{id}

#### GET
##### Summary

Get All Bills of a Tenant

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/billing/house/{id}

#### GET
##### Summary

Get All Bills of a House Unit

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |

### /api/v1/billing/apartment/{id}

#### GET
##### Summary

Get All Bills of an Apartment

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ------ |
| id | path |  | Yes | integer |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | OK |
