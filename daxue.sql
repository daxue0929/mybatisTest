/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : daxue

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2019-06-15 21:39:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog_article`
-- ----------------------------
DROP TABLE IF EXISTS `blog_article`;
CREATE TABLE `blog_article` (
  `article_id` int(10) NOT NULL AUTO_INCREMENT,
  `article_title` varchar(30) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `article_content` varchar(1024) DEFAULT NULL,
  `article_date` date DEFAULT NULL,
  PRIMARY KEY (`article_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='帖子列表,外键关联用户id\r\n';

-- ----------------------------
-- Records of blog_article
-- ----------------------------
INSERT INTO `blog_article` VALUES ('1', '治国之道', '1001', '大的国要治理', '2019-06-14');
INSERT INTO `blog_article` VALUES ('2', '小国之家', '1001', '小的国要治理', '2019-06-14');
INSERT INTO `blog_article` VALUES ('3', '小雪琴技', '1007', '学习弹琴要持之以恒', '2019-06-14');
INSERT INTO `blog_article` VALUES ('4', '小雪分析金融', '1007', '金融的学习要时刻关注身边的热点和最新的金融动态', '2019-06-14');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '评论id编号',
  `user_id` int(10) DEFAULT NULL COMMENT '评论用户id',
  `comment_content` varchar(1024) DEFAULT NULL COMMENT '评论内容',
  `comment_date` date DEFAULT NULL COMMENT '评论时间',
  `comment_count` int(10) DEFAULT NULL COMMENT '评论获赞数量',
  `article_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `user_id` (`user_id`),
  KEY `article_id` (`article_id`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`userId`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`article_id`) REFERENCES `blog_article` (`article_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论列表,外键关联用户id.帖子id';

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户唯一id',
  `userName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `userPassword` varchar(50) DEFAULT NULL COMMENT '用户登录密码',
  `addTime` datetime DEFAULT NULL COMMENT '用户注册时间',
  `groupId` int(10) DEFAULT NULL COMMENT '用户组id',
  `glod` int(30) DEFAULT NULL COMMENT '金币',
  PRIMARY KEY (`userId`),
  KEY `fk_groupid_usergroup` (`groupId`),
  CONSTRAINT `fk_groupid_usergroup` FOREIGN KEY (`groupId`) REFERENCES `user_group` (`groupId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', '大雪', '123456', '2019-05-17 10:47:42', '1', '100');
INSERT INTO `user` VALUES ('1002', '朝三', '123', '2019-05-17 10:47:45', '3', '2');
INSERT INTO `user` VALUES ('1003', '李四', '456', '2019-04-13 12:21:32', '3', '3');
INSERT INTO `user` VALUES ('1004', '王五', '789', '2019-04-13 12:21:32', '3', '4');
INSERT INTO `user` VALUES ('1007', '小雪', '1234', '2019-06-06 08:55:23', '2', '99');

-- ----------------------------
-- Table structure for `user_group`
-- ----------------------------
DROP TABLE IF EXISTS `user_group`;
CREATE TABLE `user_group` (
  `groupId` int(10) NOT NULL COMMENT '组编号',
  `groupName` varchar(50) DEFAULT NULL COMMENT '组名',
  `description` varchar(100) DEFAULT NULL COMMENT '组描述',
  `grade` int(5) DEFAULT NULL COMMENT '10的等级最高,1的等级最低.刚注册就是1的等级',
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_group
-- ----------------------------
INSERT INTO `user_group` VALUES ('1', '超级管理员', '全数据库唯一权限管理员', '1');
INSERT INTO `user_group` VALUES ('2', '管理员', '站点管理员用户', '2');
INSERT INTO `user_group` VALUES ('3', '普通用户', '普通用户', '3');
