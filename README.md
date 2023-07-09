# E-commerce-Application
## Language and Framework 

```bash
 Java , SpringBoot , JPA , MYSQL database , Swagger UI
```
## Data Flow

 1. Controller 

```bash
 #Apis for Address (AddressController)
  getAllAddress()
  getAddressByUserid
  addAddress()
  

 #Apis for Order (OrderController)
  addOrder()
  getOrderbyId()
  getAllOrder()

#Apis for Product (ProductController)
  addProduct()
  getAllProduct()
  deleteProduct()


#Apis for User (UserController)
  addUser()
  getUserbyId()
  getAllUser()

```
2. Service 

```bash
 #Service for Address (AddressService)
  getAllAddress()
  getAddressByUserid
  addAddress()
  

 #Service for Order (OrderService)
  addOrder()
  getOrderbyId()
  getAllOrder()

#Service for Product (ProductService)
  addProduct()
  getAllProduct()
  deleteProduct()


#Service for User (UserService)
  addUser()
  getUserbyId()
  getAllUser()

```

3. Model

```bash
 Address()
 Order()
 Product()
 User()
```
4. Repository

```bash
 IAddressRepo()
 IOrderRepo()
 IProductRepo()
 IuserRepo()
```

## Data Structure Used

```bash
 MYSQL as database
```

## Project Summary

E-Commerse APi is a system to handle activities related to E-commerse and services
 
  #### Features for Employee

- you can Add/Create User.
- you can Add/Create Address.
- you can Add/Create Product.
- you can Add/Create Order.
- you can Get all User details.
-  you can Get specific Order details by Order Id.
- you can Delete/Remove specific Product details by Product id.

