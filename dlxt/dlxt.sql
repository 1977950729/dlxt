/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.7.20 : Database - dlxt
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`dlxt` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dlxt`;

/*Table structure for table `furnace_current_data` */

DROP TABLE IF EXISTS `furnace_current_data`;

CREATE TABLE `furnace_current_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `furnace_id` int(11) NOT NULL COMMENT '炉位',
  `master_gas_temperature` decimal(14,2) DEFAULT NULL COMMENT '主汽温度',
  `master_gas_stress` decimal(14,2) DEFAULT NULL COMMENT '主汽压力',
  `cold_hot_temperature` decimal(14,2) DEFAULT NULL COMMENT '冷再热蒸汽温度',
  `cold_hot_stress_a` decimal(14,2) DEFAULT NULL COMMENT '冷再热蒸汽压力A',
  `cold_hot_stress_b` decimal(14,2) DEFAULT NULL COMMENT '冷再热蒸汽压力B',
  `hot_hot_temperature_a` decimal(14,2) DEFAULT NULL COMMENT '再热蒸汽温度A',
  `hot_hot_temperature_b` decimal(14,2) DEFAULT NULL COMMENT '再热蒸汽温度B',
  `hot_hot_stress` decimal(14,2) DEFAULT NULL COMMENT '再热蒸汽压力',
  `furnace_water_temperature` decimal(14,2) DEFAULT NULL COMMENT '锅炉给水温度',
  `furnace_water_stress` decimal(14,2) DEFAULT NULL COMMENT '锅炉给水压力',
  `master_gas_flow` decimal(14,2) DEFAULT NULL COMMENT '主汽流量',
  `furnace_water_flow` decimal(14,2) DEFAULT NULL COMMENT '锅炉给水流量',
  `smog_out_temperature` decimal(14,2) DEFAULT NULL COMMENT '排烟温度',
  `smog_oxygen` decimal(14,2) DEFAULT NULL COMMENT '烟气氧量',
  `first_hot_flow` decimal(14,2) DEFAULT NULL COMMENT '一级过热减温水流量',
  `second_hot_flow` decimal(14,2) DEFAULT NULL COMMENT '二级过热减温水流量',
  `hot_hot_flow` decimal(14,2) DEFAULT NULL COMMENT '再热减温水流量',
  `flue_flow` decimal(14,2) DEFAULT NULL COMMENT '燃油流量',
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间',
  `parameter_status` varchar(2) DEFAULT NULL COMMENT '参数状态',
  `coal_loss` decimal(14,2) DEFAULT NULL COMMENT '煤效损耗',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='锅炉信息表';

/*Data for the table `furnace_current_data` */

insert  into `furnace_current_data`(`id`,`furnace_id`,`master_gas_temperature`,`master_gas_stress`,`cold_hot_temperature`,`cold_hot_stress_a`,`cold_hot_stress_b`,`hot_hot_temperature_a`,`hot_hot_temperature_b`,`hot_hot_stress`,`furnace_water_temperature`,`furnace_water_stress`,`master_gas_flow`,`furnace_water_flow`,`smog_out_temperature`,`smog_oxygen`,`first_hot_flow`,`second_hot_flow`,`hot_hot_flow`,`flue_flow`,`last_update_time`,`parameter_status`,`coal_loss`) values (1,1,'540.57','14.53','308.92','2.49','2.49','512.12','521.31','2.27','265.96','15.77','732.09','759.14','127.19','4.91','25.82','1.66','1.33','0.00','2019-05-12 20:35:36','','0.00');

/*Table structure for table `furnace_info` */

DROP TABLE IF EXISTS `furnace_info`;

CREATE TABLE `furnace_info` (
  `furnace_id` int(11) NOT NULL COMMENT '炉位',
  `parameter_name` varchar(20) NOT NULL COMMENT '参数名称',
  `current_value` decimal(14,2) DEFAULT NULL COMMENT '实时值',
  `standard_value` decimal(14,2) DEFAULT NULL COMMENT '标准值',
  `goal_value` decimal(14,2) DEFAULT NULL COMMENT '目标值',
  `offset_value` decimal(14,2) DEFAULT NULL COMMENT '偏差值',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间',
  `parameter_status` varchar(2) DEFAULT NULL COMMENT '参数状态',
  `coal_loss` decimal(14,2) DEFAULT NULL COMMENT '煤效损耗',
  PRIMARY KEY (`furnace_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='锅炉信息表';

/*Data for the table `furnace_info` */

insert  into `furnace_info`(`furnace_id`,`parameter_name`,`current_value`,`standard_value`,`goal_value`,`offset_value`,`unit`,`last_update_time`,`parameter_status`,`coal_loss`) values (1,'test','1.00','1.00','1.00','1.00','1','2019-05-10 23:55:30','1','1.00'),(2,'test','1.00','1.00','1.00','1.00','1','2019-05-10 23:57:06','2','2.00');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`) values ('123','root','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
