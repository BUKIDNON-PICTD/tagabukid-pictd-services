/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.1.73-community : Database - tagabukid_pictd
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tagabukid_pictd` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tagabukid_pictd`;

/*Table structure for table `image_chunk` */

DROP TABLE IF EXISTS `image_chunk`;

CREATE TABLE `image_chunk` (
  `objid` varchar(50) CHARACTER SET latin1 NOT NULL,
  `parentid` varchar(50) CHARACTER SET latin1 NOT NULL,
  `fileno` int(11) NOT NULL,
  `byte` blob NOT NULL,
  PRIMARY KEY (`objid`),
  KEY `parentid` (`parentid`),
  CONSTRAINT `image_chunk_ibfk_1` FOREIGN KEY (`parentid`) REFERENCES `image_header` (`objid`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image_chunk` */

/*Table structure for table `image_header` */

DROP TABLE IF EXISTS `image_header`;

CREATE TABLE `image_header` (
  `objid` varchar(50) CHARACTER SET latin1 NOT NULL,
  `refid` varchar(50) CHARACTER SET latin1 NOT NULL,
  `title` varchar(500) CHARACTER SET latin1 NOT NULL,
  `filesize` int(255) DEFAULT NULL,
  `extension` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`objid`),
  KEY `image_header_ibfk_1` (`refid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image_header` */

/*Table structure for table `pictd_master_servicetypes` */

DROP TABLE IF EXISTS `pictd_master_servicetypes`;

CREATE TABLE `pictd_master_servicetypes` (
  `objid` varchar(100) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`objid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pictd_master_servicetypes` */

/*Table structure for table `pictd_servicetickets` */

DROP TABLE IF EXISTS `pictd_servicetickets`;

CREATE TABLE `pictd_servicetickets` (
  `objid` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `ticketno` varchar(50) DEFAULT NULL,
  `employee_objid` varchar(50) DEFAULT NULL,
  `employee_lastname` varchar(200) DEFAULT NULL,
  `employee_firstname` varchar(200) DEFAULT NULL,
  `employee_middlename` varchar(200) DEFAULT NULL,
  `employee_fullname` varchar(200) DEFAULT NULL,
  `employee_org_objid` varchar(100) DEFAULT NULL,
  `employee_org_name` varchar(200) DEFAULT NULL,
  `employee_org_code` varchar(100) DEFAULT NULL,
  `servicetype_objid` varchar(100) DEFAULT NULL,
  `particulars` varchar(200) DEFAULT NULL,
  `priority` varbinary(50) DEFAULT NULL,
  `datetimefiled` datetime DEFAULT NULL,
  `datetimeaccepted` datetime DEFAULT NULL,
  `datetimeresolved` datetime DEFAULT NULL,
  `diagnosis` varchar(200) DEFAULT NULL,
  `resolution` varchar(200) DEFAULT NULL,
  `recordlog_createdbyuserid` varchar(100) DEFAULT NULL,
  `recordlog_createdbyusername` varchar(100) DEFAULT NULL,
  `recordlog_datecreated` datetime DEFAULT NULL,
  `recordlog_updatedbyuserid` varchar(100) DEFAULT NULL,
  `recordlog_updatedbyusername` varchar(100) DEFAULT NULL,
  `recordlog_dateupdate` datetime DEFAULT NULL,
  PRIMARY KEY (`objid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pictd_servicetickets` */

/*Table structure for table `pictd_servicetickets_item` */

DROP TABLE IF EXISTS `pictd_servicetickets_item`;

CREATE TABLE `pictd_servicetickets_item` (
  `objid` varchar(100) NOT NULL,
  `parentid` varchar(100) DEFAULT NULL,
  `checkin_datetime` datetime DEFAULT NULL,
  `checkin_liaisonname` varchar(200) DEFAULT NULL,
  `checkin_liaisonposition` varchar(200) DEFAULT NULL,
  `checkout_datetime` datetime DEFAULT NULL,
  `checkout_liaisonname` varchar(200) DEFAULT NULL,
  `checkout_liaisonposition` varchar(200) DEFAULT NULL,
  `serialno` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`objid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pictd_servicetickets_item` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
