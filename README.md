# BRMS
#Project P0 <br>
I am working on Trip usecase which consists of 1 foreign key. <br>
1)I have created ER diagram <br>
2)I have created Trip Table using DDL in sql workbench. I have created one more table for User for Authentication <br>
3)In eclipse I created Maven project In pom.xml file i have added apache.maven plugin I have created POJO classes for both Trip and User. In dao layer I created interface which consists of abstract methods  -----addTripDetails----- deleteTripDetails-----updateTripDetails-----showTripDetails. All these methods are implemented in dao.impl layer In service layer there is an interface for user authentication and this is implemented in service.impl. I have also written menu driven application <br> 4)While implementing, to establish connection I used JDBC I have added mysql-connector-j dependency in my pom.xml file and added database.propeties file I have established connection using singleton connection 5)For logging purpose I have added log4j dependency in pom.xml 6)For testcases I have added junit dependency in pom.xml I have created testcases for ----establishing connection ----authentication user ----addTripDetails ----ShowTripDetails for all these 4 methods i have written testcases.

#Project P1 <br>
1)In eclipse I have created Maven project using web-app archetype then in pom.xml file I have added the dependencies for servlets,jsp,mysql also i have added the plugin for tomcat server.So with the help of server my entire application can be run.<br>
2)In com.revature.config package i have created a class named CoonectionFactory in order to establish the connection between mysql and eclipse
3)Then i have created Jsp files and servlets.<br>
4)Jsp files and all my assets for project are stored in webapp folder.<br>
5)I have implemented four servlets <br>
----AddTrip which is executed when addTrip.jsp is submitted <br>
----UpdateTrip which is executed when editTrip.jsp is submitted <br>
----DeleteTrip which is executed when deleteTrip.jsp is submitted <br>
----ShowTrip which is executed and transfers the control to showBatches2.jsp when showTrip.jsp is submitted<br>



This is all about my project and the technologies used in my project
