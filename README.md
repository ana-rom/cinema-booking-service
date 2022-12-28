<h1>Cinema booking service</h1>

<p>
   <img align="right" src="img/main.jpeg"/>
</p>


#### Simple RESTful web application</br> will help you manage a small cinema platform:

- a client-server architecture model
- a layered system: 
  - handling HTTP requests in controllers
  - filtering 
  - processing logic and creating services
  - retrieving information from DB
  - responding with JSON objects
- adherence to SOLID principles

### System features

The cinema system involves **2 main parties**: business and customers.</br> 
Both of them have access to the system but different roles to play:</br>
🔸 business representatives have **ADMIN rights** </br>
🔸 customers as registered users have **USER rights** or can just be visitors (not registered)


| Admins                                     | Users                                               |
|--------------------------------------------|-----------------------------------------------------|
| manage and update  the platform            | give their details to be registered on the platform |
| add different movies and cinema halls      | go through authentication process                   |
| schedule, update and delete movie sessions | check movies and available movie sessions           |
| have access to the number registered users | book tickets via personal shopping cart             |
|                                            | complete the order and check their order history    |                           


Visual representation of the project structure along with its main classes, actions, and connections is below: </br>

<img height="576" src="img/diagram.png" width="852"/>

## 👩‍💻 How it works

----

### Technologies and tools

-  Spring MVC and Spring Security                            
-  ORM Hibernate                                             
-  Java 11 or later                                          
-  Apache Maven                                              
-  Apache Tomcat 9.0.50                                                                     
-  MySQL 8.0.22 community version                            
-  IDE IntelliJ Ultimate                                     


### Configuration

➡️️ Clone the project from GitHub </br>
➡️️ Configure connection to DB in [db.properties](src/main/resources/db.properties) file in _resources directory_ </br>

        db.driver=YOUR_DATABASE_DRIVER
        db.url=YOUR_DATABASE_URL
        db.user=YOUR_DATABASE_USERNAME
        db.password=YOUR_DATABASE_PASSWORD

➡️️ You can add your personalized admin with login and password in [DataInitializer class](src/main/java/cinema/config/DataInitializer.java) in _cinema.config package_ or use test admin credentials: </br>

        test admin email: "testadmin@gmail.com";
        test admin password: "123456789";

➡️️ Configure your local Tomcat server (recommended to use [v.9.0.50](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/)). </br>
➡️️ Take your seat, run the app, it's movie time! 🍿🎬

_*If you have any questions, or you want to give feedback,  feel free to contact!_
