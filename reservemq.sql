-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.4.10-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.5116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 polling 的数据库结构
CREATE DATABASE IF NOT EXISTS `polling` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `polling`;

-- 导出  表 polling.delievery 结构
CREATE TABLE IF NOT EXISTS `delievery` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `delievery` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='物流';

-- 正在导出表  polling.delievery 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `delievery` DISABLE KEYS */;
INSERT INTO `delievery` (`d_id`, `user_id`, `order_id`, `delievery`, `create_time`) VALUES
	(1, NULL, 1, NULL, '2020-06-11 20:46:44'),
	(2, 1, NULL, NULL, '2020-06-12 10:56:41'),
	(3, 1, NULL, NULL, '2020-06-12 10:59:38'),
	(4, 1, NULL, NULL, '2020-06-13 07:40:09'),
	(5, 1, NULL, NULL, '2020-06-13 07:43:07'),
	(6, 1, NULL, NULL, '2020-06-13 07:43:49');
/*!40000 ALTER TABLE `delievery` ENABLE KEYS */;

-- 导出  表 polling.order_info 结构
CREATE TABLE IF NOT EXISTS `order_info` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `buy_count` int(11) DEFAULT NULL,
  `monetary` double DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='订单';

-- 正在导出表  polling.order_info 的数据：~7 rows (大约)
/*!40000 ALTER TABLE `order_info` DISABLE KEYS */;
INSERT INTO `order_info` (`order_id`, `product_id`, `user_id`, `buy_count`, `monetary`, `create_time`) VALUES
	(1, 1, 1, 1, 30.4, '2020-06-11 17:55:42'),
	(2, 1, 1, 1, 30.4, '2020-06-11 17:56:36'),
	(3, 1, 1, 5, 30.4, '2020-06-11 17:57:02'),
	(4, 1, 1, 5, 30.4, '2020-06-12 10:56:40'),
	(5, 1, 1, 5, 30.4, '2020-06-12 10:59:37'),
	(6, 1, 1, 5, 30.4, '2020-06-13 07:40:08'),
	(7, 1, 1, 5, 30.4, '2020-06-13 07:43:06'),
	(8, 1, 1, 5, 30.4, '2020-06-13 07:43:48');
/*!40000 ALTER TABLE `order_info` ENABLE KEYS */;

-- 导出  表 polling.product 结构
CREATE TABLE IF NOT EXISTS `product` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) DEFAULT NULL,
  `img_md5` varchar(50) DEFAULT NULL,
  `publishers` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='产品';

-- 正在导出表  polling.product 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`p_id`, `product_name`, `img_md5`, `publishers`, `status`, `price`, `create_time`) VALUES
	(1, '测试', NULL, '出版商', 1, 500, '2020-06-11 16:27:36');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

-- 导出  表 polling.reserve 结构
CREATE TABLE IF NOT EXISTS `reserve` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) DEFAULT NULL,
  `total_count` int(11) DEFAULT NULL,
  `current_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='库存';

-- 正在导出表  polling.reserve 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `reserve` DISABLE KEYS */;
INSERT INTO `reserve` (`r_id`, `product_id`, `total_count`, `current_count`) VALUES
	(1, 1, 100, 50);
/*!40000 ALTER TABLE `reserve` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
