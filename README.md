# seamcat
JBoss Seam 2 migrated to Wildfly 10.1.x (Branch - seam_2_3-wildfly_10_1_0_Final)  on Tomcat 7.57, Hibernate 5.0.10.Final


# requirements

* Java 8
* Tomcat 7.57 or later / wildfly 10.1Final
* https://github.com/omidp/jbpm3-seam
* https://github.com/omidp/jboss-seam (Branch - seam_2_3-wildfly_10_1_0_Final)



## Configuration

* Open tomcat server.xml and add below line inside **GlobalNamingResources** tag

```
<Resource auth="Container" driverClassName="org.postgresql.Driver" global="jdbc/TestDB" 
	maxActive="100" maxIdle="30" maxWait="10000" name="jdbc/TestDB" password="test" 
	type="javax.sql.DataSource" 
	url="jdbc:postgresql://127.0.0.1:5432/testdb" username="test"/>
```


* Add postgresql jar file to tomcat lib folder

* Don't forget to create database _testdb_ and role _test_ for postgresql

## Run

after running tomcat, open browser 

```
http://localhost:8080/seamcat/home.seam
```
