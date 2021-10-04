Inventory Management Spring Rest API:
- Once started, accessible on localhost port 8070

1. Product
- Attributes: ID, UpcNumber, Name, InventoryCount
- Endpoints: /api/products/
i. List all products: GET /api/products/ ; returns list of all products
ii. Find a product by its ID: GET /api/products/{id} where {id} is a path variable; returns product with id if exists, else returns an error with status code 404
iii. Find a product by its UPC Number: GET /api/products/search?upc={value} where upc is a query parameter; returns product with upc if exists, else returns an error with status code 404
iv. Edit a product: POST /api/products/{id} where {id} is a path variable; returns updated product if product with id exists, else returns an error with status code 404
v. Delete a product: DELETE /api/products/{id} where {id} is a path variable; returns status code 200 if product with id exists and deleted the product, else returns an error with status code 404
