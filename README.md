# Charles Clark Individual Project
 
### Problem Statement

Most manufacturing and production based factory jobs have end off the shift paperwork that needs to be filled out. This 
is done for various reasons. A few being that companies want to keep track of what each shift/individual is doing. By tracking
the number of parts produced and logging downtime companies can use the data to fix problems and run the required amount 
of weekly and daily production. Employees that are on a production rate per hour based pay can also know how much money 
they made that each day right away. The problem is with paperwork you cant get these type of results right away. Paperwork 
can also be lost and errors can happen so implementing a simple web form application allows employers and employees to
track and see shift data right away! Users will also bea able to check weather before each shit as it can play a role on how a 
machine functions that day/night and based on certain conditions let the user know if any PM/TPM (preventative maintenance) 
should be done before the start of the shift.

 ### Project Technologies/Techniques 
 
 * Security/Authentication
   * Tomcat's JDBC Realm Authentication
   * Admin role: create/read/update/delete (crud) of all data
   * User role: create shift report, edit and send data 
 * Database
   * MySQL
   * Store users and shift information
   * Store all data for the shift reports
 * ORM Framework
   * Hibernate 5
 * Dependency Management
   * Maven
 * Web Services consumed using Java
   * NOAA for weather conditions, search by zip code
 * CSS 
   * Bootstrap or Materialize
 * Data Validation
   * Bootstrap Validator for front end
   * Explore Hibernate's validation
 * Logging
   * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
 * Hosting
   * AWS
 * Independent Research Topic/s
   * CI tools in AWS
   * Google Maps API
   *Javascript action buttons
 * Unit Testing
   * JUnit tests to achieve 80%+ code coverage 
 * IDE: IntelliJ IDEA
 
 
 ### Design

* [Screen Design](screen.md)
* [Application Flow](applicationFlow.md)
* [Datbase Design](databaseDesign.md)

### Production Time
* [Journal](journal.md)
* [Time Log](timelog.md)