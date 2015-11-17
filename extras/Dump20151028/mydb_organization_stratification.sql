-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.9-log

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
-- Table structure for table `organization_stratification`
--

DROP TABLE IF EXISTS `organization_stratification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization_stratification` (
  `id` varchar(255) NOT NULL,
  `organization_id` varchar(255) NOT NULL,
  `gender_male` int(11) DEFAULT NULL,
  `gender_female` int(11) DEFAULT NULL,
  `gender_other` int(11) DEFAULT NULL,
  `age_under_17` int(11) DEFAULT NULL,
  `age_18-44` int(11) DEFAULT NULL,
  `age_45-64` int(11) DEFAULT NULL,
  `age_over_65` int(11) DEFAULT NULL,
  `ethnicity_hispanic_latino` int(11) DEFAULT NULL,
  `ethnicity_not_hispanic_latino` int(11) DEFAULT NULL,
  `race_african_american` int(11) DEFAULT NULL,
  `race_american_indian` int(11) DEFAULT NULL,
  `race_asian` int(11) DEFAULT NULL,
  `race_native_hawaiian` int(11) DEFAULT NULL,
  `race_white` int(11) DEFAULT NULL,
  `race_other` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `organization_stratification_organization_idx` (`organization_id`),
  CONSTRAINT `organization_stratification_organization` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization_stratification`
--

LOCK TABLES `organization_stratification` WRITE;
/*!40000 ALTER TABLE `organization_stratification` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization_stratification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-28 11:09:29
