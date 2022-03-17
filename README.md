
# Liv2Train (Backend)

An MVP project for registry of Govt funded Training Centers.
Spring Boot framework along with Rest API,JPA and h2 Database is used for creating API.
Spring Tool Suite is used for preparing the project.


Creator:Ravi Ranjan
## Tool's Requirement
1.Spring Tool Suite for running the application.             
2.Postman or Curl to test url.  
3.JavaSE-16
## Project Structure
The Structure of project must be followed as shown in given picture :
![Screenshot (302)~2](https://user-images.githubusercontent.com/95235883/158782103-8641a8d2-33e0-4ce7-ac11-265077c7fdbc.png)


## To Send data by Post API and Get data by Get API
By Curl or Postman

Using Postman    
1.Get All Training Centers - localhost:8080/centers   
![Screenshot (304)~2](https://user-images.githubusercontent.com/95235883/158782399-d4b1b9ae-006a-4792-a34a-7482037d1563.png)

2.For Creating a new Training Center - localhost:8080/create             
Add Header Content-Type to application/json, then add body as shown below to create a Training Center :   
 {
 	"centerName" :"KR.Solutions",   
"centerCode":"12cvbn749812",  
  "address":  
   {   
	"address":"Mera ghar",  
	"city":"Dehradun",   
	"state":"Uttrakhand",  
   	"pincode":"123456"  
   	},  
   "studentCapacity":80,  
    "coursesOffered":["java","JavaScript"],   
    "contactEmail" :"kr@gmail.com",   
    "contactPhone" :"9876543210"  
 }  
 While adding the fields must follow the given instruction :  
 1.centerCode must be unique as it is primary key.  
   Size must be 12 .  
 2.centerName size is 40.  
 3.contactPhone size must be 10.    
 ![Screenshot (303)~3](https://user-images.githubusercontent.com/95235883/158782579-45e7a25b-16ac-496b-8be5-ae9d8f376f0c.png)


Congratulations, on creating your first Training Center.

