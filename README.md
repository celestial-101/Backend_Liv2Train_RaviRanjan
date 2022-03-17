
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
![Screenshot (302)~3](https://user-images.githubusercontent.com/95235883/158783359-4bb63bb2-7238-41f1-8cf2-d66ca2efd7d9.png)


## To Send data by Post API and Get data by Get API
By Curl or Postman

Using Postman   
1.For Creating a new Training Center - localhost:8080/create             
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
 
![Screenshot (305)](https://user-images.githubusercontent.com/95235883/158784241-7314dd28-f123-46d1-9fa5-6f2b7b0cf08e.png)

2.Get All Training Centers - localhost:8080/centers   
![Screenshot (304)~2](https://user-images.githubusercontent.com/95235883/158782399-d4b1b9ae-006a-4792-a34a-7482037d1563.png)



Congratulations, on creating your first Training Center.

