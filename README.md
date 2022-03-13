
# Liv2Train (Backend)

An MVP project for registry of Govt funded Training Centers.
Spring Boot framework along with Rest API,JPA and h2 Database is used for creating API.
Spring Tool Suite is used for preparing the project.


Creator:Ravi Ranjan
## Tool's Requirement
1.Spring Tool Suite for running the application.             
2.Postman or Curl to test url.  
3.JavaSE-16
## File Structure















## To Send data by Post API
By Curl or Postman

1.Get All Training Centers - localhost:8080/centers in Postman.   
2.For Creating a new Training Center - localhost:8080/create             
Add Header Content-Type to application/json, then add body as shown in Body to create a Training Center :   
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


Congratulations, on creating your first Training Center.

