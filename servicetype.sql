/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.37 : Database - tagabukid_pictd
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

/*Table structure for table `pictd_master_servicetypes` */

DROP TABLE IF EXISTS `pictd_master_servicetypes`;

CREATE TABLE `pictd_master_servicetypes` (
  `objid` varchar(100) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`objid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pictd_master_servicetypes` */

insert  into `pictd_master_servicetypes`(`objid`,`name`,`code`,`description`) values ('PMS-ff0d3a1:161db7d3d74:-7dc8','ASDFASDF','ASDFADSF',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
