/*
Navicat MySQL Data Transfer

Source Server         : localhost_test
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : weshare

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-09-05 19:53:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for 01_courses
-- ----------------------------
DROP TABLE IF EXISTS `01_courses`;
CREATE TABLE `01_courses` (
  `CId` int(11) NOT NULL AUTO_INCREMENT,
  `CCode` varchar(255) DEFAULT NULL,
  `CName` varchar(255) DEFAULT NULL,
  `CourseImg` varchar(255) DEFAULT NULL,
  `ProfessionId` int(11) DEFAULT NULL,
  PRIMARY KEY (`CId`),
  KEY `FKkgk3mm90guyexo31agu84fa50` (`ProfessionId`),
  CONSTRAINT `FKkgk3mm90guyexo31agu84fa50` FOREIGN KEY (`ProfessionId`) REFERENCES `01_profession` (`PId`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of 01_courses
-- ----------------------------
INSERT INTO `01_courses` VALUES ('1', 'c5', '计算机科学导论', 'images/J/J_jisuanjikexuedaolun.jpg', '1');
INSERT INTO `01_courses` VALUES ('2', 'c1', '大数据基础及应用', 'images/J/J_dashujujichujiyingyong.jpg', '1');
INSERT INTO `01_courses` VALUES ('3', 'c3', '汇编语言程序设计', 'images/J/J_huibianyuyanchengxusheji.jpg', '1');
INSERT INTO `01_courses` VALUES ('4', 'c9', '数值计算方法', 'images/J/J_shuzhijisuanfangfa.jpg', '1');
INSERT INTO `01_courses` VALUES ('5', 'c2', '电路与模拟电子技术', 'images/J/J_dianluyumonidianzijishu.jpg', '1');
INSERT INTO `01_courses` VALUES ('6', 'c10', '数字图像处理', 'images/J/J_shuzituxiangchuli.jpg', '1');
INSERT INTO `01_courses` VALUES ('7', 'c7', '人工智能', 'images/J/J_rengongzhineng.jpg', '1');
INSERT INTO `01_courses` VALUES ('8', 'c6', '嵌入式操作系统原理与应用', 'images/J/J_qianrushicaozuoxitong.jpg', '1');
INSERT INTO `01_courses` VALUES ('9', 'c4', '计算机安全与密码学', 'images/J/J_jisuanjianquanyumimaxue.jpg', '1');
INSERT INTO `01_courses` VALUES ('10', 'c8', '数据挖掘与机器学习', 'images/J/J_shujuwajueyujiqixuexi.jpg', '1');
INSERT INTO `01_courses` VALUES ('11', 'c13', '结构力学', 'images/T/T_jiegoulixue.jpg', '2');
INSERT INTO `01_courses` VALUES ('12', 'c11', '工程力学', 'images/T/T_gongchenglixue.jpg', '2');
INSERT INTO `01_courses` VALUES ('13', 'c12', '弹性力学', 'images/T/T_tanxinglixue.jpg', '2');
INSERT INTO `01_courses` VALUES ('14', 'c14', '电子商务专业英语', 'images/Y/Y_dianzishangwuzhuanyeyingyu.jpg', '3');
INSERT INTO `01_courses` VALUES ('15', 'c15', '大学英语翻译教程', 'images/Y/Y_daxueyingyufanyijiaocheng.jpg', '3');
INSERT INTO `01_courses` VALUES ('16', 'c16', '现代大学英语', 'images/Y/Y_xiandaidaxueyingyu.jpg', '3');
INSERT INTO `01_courses` VALUES ('17', 'c18', '给水工程', 'images/H/H_jishuigongcheng.jpg', '4');
INSERT INTO `01_courses` VALUES ('18', 'c19', '大学化学基础教程', 'images/H/H_daxuehuaxuejichujiaocheng.jpg', '4');
INSERT INTO `01_courses` VALUES ('19', 'c17', '环境工程学', 'images/H/H_huanjinggongchengxue.jpg', '4');
INSERT INTO `01_courses` VALUES ('20', 'c24', '数值计算方法', 'images/J/J_shuzhijisuanfangfa.jpg', '5');
INSERT INTO `01_courses` VALUES ('21', 'c28', '人工智能', 'images/J/J_rengongzhineng.jpg', '5');
INSERT INTO `01_courses` VALUES ('22', 'c23', '汇编语言程序设计', 'images/J/J_huibianyuyanchengxusheji.jpg', '5');
INSERT INTO `01_courses` VALUES ('23', 'c27', '计算机安全与密码学', 'images/J/J_jisuanjianquanyumimaxue.jpg', '5');
INSERT INTO `01_courses` VALUES ('24', 'c20', '嵌入式操作系统原理与应用', 'images/J/J_qianrushicaozuoxitong.jpg', '5');
INSERT INTO `01_courses` VALUES ('25', 'c22', '电路与模拟电子技术', 'images/J/J_dianluyumonidianzijishu.jpg', '5');
INSERT INTO `01_courses` VALUES ('26', 'c25', '计算机科学导论', 'images/J/J_jisuanjikexuedaolun.jpg', '5');
INSERT INTO `01_courses` VALUES ('27', 'c21', '大数据技术原理与应用', 'images/J/J_dashujujichujiyingyong.jpg', '5');
INSERT INTO `01_courses` VALUES ('28', 'c26', '数据挖掘与机器学习', 'images/J/J_shujuwajueyujiqixuexi.jpg', '5');
INSERT INTO `01_courses` VALUES ('29', 'c29', '数字图像处理', 'images/J/J_shuzituxiangchuli.jpg', '5');
INSERT INTO `01_courses` VALUES ('30', 'c32', '数学分析', 'images/S/S_gaodengshuxue.jpg', '6');
INSERT INTO `01_courses` VALUES ('31', 'c30', '高等数学', 'images/S/S_gaodengshuxue.jpg', '6');
INSERT INTO `01_courses` VALUES ('32', 'c31', '概率论与数理统计', 'images/S/S_gailvlunyushulitongji.jpg', '6');
INSERT INTO `01_courses` VALUES ('33', 'c35', '计算机绘图', 'images/JZ/JZ_jisuanjihuitu.jpg', '7');
INSERT INTO `01_courses` VALUES ('34', 'c34', '中外建筑史', 'images/JZ/JZ_zhongwaijianzhushi.jpg', '7');
INSERT INTO `01_courses` VALUES ('35', 'c33', '建筑力学', 'images/JZ/JZ_jianzhulixue.jpg', '7');
INSERT INTO `01_courses` VALUES ('36', 'c37', '广播电视新闻学', 'images/X/X_guangbodianshixinwenxue.jpg', '8');
INSERT INTO `01_courses` VALUES ('37', 'c36', '电视摄像与非线性编辑', 'images/X/X_dianshishexiangyufeixianxingbianji.jpg', '8');
INSERT INTO `01_courses` VALUES ('38', 'c38', '广播电视概论', ' images/X/X_guangbodianshigailun.jpg', '8');

-- ----------------------------
-- Table structure for 01_file
-- ----------------------------
DROP TABLE IF EXISTS `01_file`;
CREATE TABLE `01_file` (
  `FId` int(11) NOT NULL AUTO_INCREMENT,
  `Contributor` varchar(255) DEFAULT NULL,
  `FPoint` int(11) DEFAULT NULL,
  `UploadTime` varchar(255) DEFAULT NULL,
  `DownloadCount` int(11) DEFAULT NULL,
  `FileName` varchar(255) DEFAULT NULL,
  `FilePath` varchar(255) DEFAULT NULL,
  `ContributorId` int(11) DEFAULT NULL,
  `CourseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`FId`),
  KEY `FK8if28cb6psrqcr4x3yteyk9tn` (`CourseId`),
  CONSTRAINT `FK8if28cb6psrqcr4x3yteyk9tn` FOREIGN KEY (`CourseId`) REFERENCES `01_courses` (`CId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of 01_file
-- ----------------------------
INSERT INTO `01_file` VALUES ('1', '代群', '5', '2019/07/03', '3', '（汇编）3班-201613161028-代群.doc', 'C:\\Program Files\\Apache Software Foundation\\Tomcat8.5\\webapps\\weshare\\CDUTFILES\\2019-07-03-10-39（汇编）3班-201613161028-代群.doc', '1', '3');
INSERT INTO `01_file` VALUES ('2', 'lcj', '5', '2019/09/04', '1', '学习补充.txt', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-04-04-52学习补充.txt', '3', '5');
INSERT INTO `01_file` VALUES ('3', 'lcj', '5', '2019/09/04', '2', '前端学习流程.txt', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-04-04-34前端学习流程.txt', '3', '6');
INSERT INTO `01_file` VALUES ('4', 'lcj', '5', '2019/09/04', '0', 'OneDrive 入门.pdf', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-04-04-35OneDrive 入门.pdf', '3', '2');
INSERT INTO `01_file` VALUES ('5', 'lcj', '0', '2019/09/04', '0', '个人总结.txt', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-04-04-35个人总结.txt', '3', '2');
INSERT INTO `01_file` VALUES ('6', '代群', '10', '2019/09/05', '1', '个人总结.txt', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-05-04-34个人总结.txt', '4', '6');
INSERT INTO `01_file` VALUES ('7', '哈哈哈', '5', '2019/09/05', '1', '2019.4.17(填表格式).docx', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-05-04-372019.4.17(填表格式).docx', '5', '16');
INSERT INTO `01_file` VALUES ('8', '啦啦啦', '30', '2019/09/05', '1', '2019.4.17(填表格式).docx', 'D:\\资料\\高级web课程设计\\STAR资料查询\\weshare\\out\\artifacts\\weshare_war_exploded\\CDUTFILES\\2019-09-05-04-082019.4.17(填表格式).docx', '6', '16');

-- ----------------------------
-- Table structure for 01_profession
-- ----------------------------
DROP TABLE IF EXISTS `01_profession`;
CREATE TABLE `01_profession` (
  `PId` int(11) NOT NULL AUTO_INCREMENT,
  `PCode` varchar(255) DEFAULT NULL,
  `PName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of 01_profession
-- ----------------------------
INSERT INTO `01_profession` VALUES ('1', 'p1', '软件工程');
INSERT INTO `01_profession` VALUES ('2', 'p2', '土木工程');
INSERT INTO `01_profession` VALUES ('3', 'p2', '英语');
INSERT INTO `01_profession` VALUES ('4', 'p2', '环境工程');
INSERT INTO `01_profession` VALUES ('5', 'p5', '计算机科学与技术');
INSERT INTO `01_profession` VALUES ('6', 'p6', '数学');
INSERT INTO `01_profession` VALUES ('7', 'p7', '建筑学');
INSERT INTO `01_profession` VALUES ('8', 'p8', '新闻传播');

-- ----------------------------
-- Table structure for 01_records
-- ----------------------------
DROP TABLE IF EXISTS `01_records`;
CREATE TABLE `01_records` (
  `RId` int(11) NOT NULL AUTO_INCREMENT,
  `Time` varchar(255) DEFAULT NULL,
  `Type` bit(1) DEFAULT NULL,
  `FileId` int(11) DEFAULT NULL,
  `UserId` int(11) DEFAULT NULL,
  PRIMARY KEY (`RId`),
  UNIQUE KEY `UK_l43b81ji7dpcqv9l2359cugm2` (`FileId`),
  KEY `FK854dugkk9bwbukl30menpifa9` (`UserId`),
  CONSTRAINT `FK1horkge1eemw92xjmcuevyser` FOREIGN KEY (`FileId`) REFERENCES `01_file` (`FId`),
  CONSTRAINT `FK854dugkk9bwbukl30menpifa9` FOREIGN KEY (`UserId`) REFERENCES `01_user` (`UId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of 01_records
-- ----------------------------
INSERT INTO `01_records` VALUES ('1', '2019/07/03', '', '1', '1');
INSERT INTO `01_records` VALUES ('2', '2019/09/04', '', '2', '3');
INSERT INTO `01_records` VALUES ('3', '2019/09/04', '', '3', '3');
INSERT INTO `01_records` VALUES ('4', '2019/09/04', '', '4', '3');
INSERT INTO `01_records` VALUES ('5', '2019/09/04', '', '5', '3');
INSERT INTO `01_records` VALUES ('6', '2019/09/05', '', '6', '4');
INSERT INTO `01_records` VALUES ('7', '2019/09/05', '', '7', '5');
INSERT INTO `01_records` VALUES ('8', '2019/09/05', '', '8', '6');

-- ----------------------------
-- Table structure for 01_user
-- ----------------------------
DROP TABLE IF EXISTS `01_user`;
CREATE TABLE `01_user` (
  `UId` int(11) NOT NULL AUTO_INCREMENT,
  `Account` varchar(255) DEFAULT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Point` int(11) DEFAULT NULL,
  `UserImage` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of 01_user
-- ----------------------------
INSERT INTO `01_user` VALUES ('1', '201613161028', '代群', '034321', '15', null);
INSERT INTO `01_user` VALUES ('2', '201613161126', 'ycc', '666666', '45', null);
INSERT INTO `01_user` VALUES ('3', '201613160902', 'lcj', '970707', '60', null);
INSERT INTO `01_user` VALUES ('4', '111111111111', '代群', '111111', '55', null);
INSERT INTO `01_user` VALUES ('5', '666666666666', '哈哈哈', '666666', '50', null);
INSERT INTO `01_user` VALUES ('6', '999999999999', '啦啦啦', '999999', '70', null);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `LoginName` varchar(20) NOT NULL,
  `LoginPwd` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of users
-- ----------------------------
