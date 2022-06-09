# Oauth-springBoot

Step 1 :  Before running Check your application.yml file my sql configuration username and password might be different for your system.
--
Step 2 :  Right Click on SpringOauth3Application class file and click on Run.
--
Step 3 :  After successfull run GOTO http://localhost:8080/oauth/authorize?client_id=devglan-client&response_type=code&scope=user_info in chrome
--
Step 4 :  Give username as "Alex123" and password as "password"
--
Step 5 :  it will redirect to Approve page click on approve and submit
--
Step 6 :  On URl Copy the code and paste in somewhere.
--
Step 7 :  Goto to postman Now And give this url http://localhost:8080/oauth/token in post method
--
Step 8 :  click on Body Select "x-www-form-urlencoded" and down below you will see Key value section on that fill the details by given below
--
                                    "username" : "Alex123"
                                    "password" :  "password"
                                    "grant_type" : "authorization_code"
                                    "code"       :  refer Step 6 code
                                    
Step 9 :  click on send you will get bearer token copy that bearer token
--

Step 10 : GOTO to chrome and give this url http://localhost:8080/users/user?access_token= Step 9 copied token like this http://localhost:8080/users/user?access_token=9966034f-dc50-48ae-9db7-194b9c4e010a
--

Step 11 : You will see all data what you have in MySql "user" table 
--
          NOTE : make sure you have some data in user table in mysql db.

IF YOU DON'T HAVE DATA IN MYSQL DB USE BELOW QUERY

INSERT INTO User (id, username, password, salary, age) VALUES (4, 'anshu', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);
INSERT INTO User (id, username, password, salary, age) VALUES (2, 'Tom234', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 7823, 23);
INSERT INTO User (id, username, password, salary, age) VALUES (3, 'Adam', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 45);
SELECT id, age, password, salary, username FROM user;





