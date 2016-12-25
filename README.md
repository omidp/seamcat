# seamcat
JBoss Seam on Tomcat

## Configuration

* Open tomcat server.xml and add below line 

```
<Resource auth="Container" driverClassName="org.postgresql.Driver" global="jdbc/TestDB" maxActive="100" maxIdle="30" maxWait="10000" name="jdbc/TestDB" password="test" type="javax.sql.DataSource" url="jdbc:postgresql://127.0.0.1:5432/testdb" username="test"/>
```

* Add postgresql jar file to tomcat lib folder

* Don't forget to create database testdb and role test for postgresql

## Run

after running tomcat, open browser 

```
http://localhost:8080/seamcat/home.seam
```
