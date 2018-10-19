-- MySQL dump 10.13  Distrib 5.7.23, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: indieProject
-- ------------------------------------------------------
-- Server version	5.7.23-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `shift` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `first_name` varchar(25) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `product_name` varchar(30) DEFAULT NULL,
  `machine_number` int(11) DEFAULT NULL,
  `hours_worked` double DEFAULT NULL,
  `total_parts` double DEFAULT NULL,
  `credits` double DEFAULT NULL,
  `downtime` double DEFAULT NULL,
  `product_rate` double DEFAULT NULL,
  user_password varchar(200) not null
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2018-10-11',1,1,'2','2','1',1,1,11,24.962000000000003,1,NULL),(2,'2018-01-15',1,1,'E','E','1',1,1,11,16.962,1,NULL),(3,'2018-10-17',1,1,'wwwww','w','1',3,1,1,0.4620000000000001,1,NULL),(4,'2018-10-18',1,1,'ww','w','1',1,1,1,0.4620000000000001,1,NULL),(5,'2018-10-12',1,1,'w','w','1',1,1,1,16.962,1,NULL),(6,'2018-10-18',1,1,'Charles','e','2',1,1,1,0.4620000000000001,1,NULL),(7,'2018-10-18',1,1,'wwwww','w','1',1,1,1,15.026,111,NULL),(8,'2018-10-14',2,234,'Charles','Clark','4',45,6.5,226,1.1440000000000001,0.525,NULL),(9,'2018-10-18',3,213,'Charles ','Clark','3',99,6.5,224,1.038,0.255,NULL),(10,'2018-10-12',3,233,'Sally','Sue','1',2,6.5,222,1.048,0.255,NULL),(11,'2018-10-04',1,222,'Chalres ','Clakr','3',4,6.5,221,1.058,0.225,NULL),(12,'2018-10-16',1,1,'ww','w','1',1,1,11,38.961999999999996,1,NULL),(13,'2018-10-11',1,1,'eee','rrr','1',1,2,3,3.066,4,NULL),(14,'2018-10-10',1,233,'charles ','clark','3',2,6.5,232,1.414,0.544,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-14 11:07:44
