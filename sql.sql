/*
SQLyog Ultimate v8.32 
MySQL - 5.5.40 : Database - hospitalmanager
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hospitalmanager` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hospitalmanager`;

/*Table structure for table `s_admin` */

DROP TABLE IF EXISTS `s_admin`;

CREATE TABLE `s_admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `s_admin` */

insert  into `s_admin`(`id`,`username`,`password`,`status`) values (1,'admin','123456',1);

/*Table structure for table `s_department` */

DROP TABLE IF EXISTS `s_department`;

CREATE TABLE `s_department` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `info` varchar(128) DEFAULT NULL,
  `empty_bed_num` int(5),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `s_department` */

insert  into `s_department`(`id`,`name`,`info`,`empty_bed_num`) values (1,'内科','内科治疗范围描述', 10),(2,'外科','外科治疗范围描述', 10),(3,'口腔科','治疗范围描述',10);

/*Table structure for table `s_medicine` */

DROP TABLE IF EXISTS `s_medicine`;

CREATE TABLE `s_medicine` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `type` int(5) NOT NULL,
  `valid_num` int(5) NOT NULL DEFAULT '50',
  `max_num` int(5) NOT NULL DEFAULT '50',
  `info` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `s_medicine` */

insert  into `s_medicine`(`id`,`name`,`type`,`valid_num`,`max_num`,`info`) values (1,'板蓝根',0,49,50,'药物描述'),(2,'阿司匹林',1,4,50,'药物描述');

/*Table structure for table `s_patient` */

DROP TABLE IF EXISTS `s_patient`;

CREATE TABLE `s_patient` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `department_id` int(5) DEFAULT NULL,
  `sex` varchar(5) NOT NULL DEFAULT '男',
  `mobile` varchar(12) DEFAULT NULL,
  `qq` varchar(18) DEFAULT NULL,
  `need_stay` int(5) DEFAULT '0',
  `required_fee` int(5) DEFAULT '0',
  `paid_fee` int(5) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `patient_department_id_foreign` (`department_id`),
  CONSTRAINT `patient_department_id_foreign` FOREIGN KEY (`department_id`) REFERENCES `s_department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `s_patient` */

insert  into `s_patient`(`id`,`username`,`password`,`sex`,`mobile`,`qq`) values (2,'周杰伦','123456','女','13545454548','1332365656'),(4,'陈奕迅','111111','男','13356565656','123456'),(9,'马冬梅','1','男','13333332133','131313132323');

/*Table structure for table `s_doctor` */

DROP TABLE IF EXISTS `s_doctor`;

CREATE TABLE `s_doctor` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `department_id` int(5) NOT NULL,
  `sex` varchar(5) NOT NULL DEFAULT '男',
  `mobile` varchar(12) DEFAULT NULL,
  `qq` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patient_department_id_foreign` (`department_id`),
  CONSTRAINT `s_doctor_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `s_department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `s_doctor` */

insert  into `s_doctor`(`id`,`username`,`password`,`department_id`,`sex`,`mobile`,`qq`) values (9,'张三','111',1,'男','13918655656','1193284480'),(10,'李四','111',2,'男','13656565656','123456'),(11,'赵武','123456',3,'男','18989898989','1456655565'),(18,'王二','123456',1,'女','15174857845','1745854125');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
