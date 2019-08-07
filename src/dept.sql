/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : web

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-07-23 17:28:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(11) NOT NULL,
  `dept_code` varchar(30) CHARACTER NOT NULL,
  `dept_name` varchar(30) CHARACTER NOT NULL,
  `dept_catagory` int(11) NOT NULL,
  `dept_type` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', 'XXGNK', '心血管内科', '11', '1');
INSERT INTO `dept` VALUES ('2', 'SJNK', '神经内科', '11', '1');
INSERT INTO `dept` VALUES ('3', 'PTNK', '普通内科', '11', '1');
INSERT INTO `dept` VALUES ('4', 'XHNK', '消化内科', '11', '1');
INSERT INTO `dept` VALUES ('5', 'HXNK', '呼吸内科', '11', '1');
INSERT INTO `dept` VALUES ('6', 'NFMK', '内分泌科', '11', '1');
INSERT INTO `dept` VALUES ('7', 'SBNK', '肾病内科', '11', '1');
INSERT INTO `dept` VALUES ('8', 'XYNK', '血液内科', '11', '1');
INSERT INTO `dept` VALUES ('9', 'GRNK', '感染内科', '11', '1');
INSERT INTO `dept` VALUES ('10', 'LNBNK', '老年病内科', '11', '1');
INSERT INTO `dept` VALUES ('11', 'FSMYNK', '风湿免疫内科', '11', '1');
INSERT INTO `dept` VALUES ('12', 'TXK', '透析科', '11', '1');
INSERT INTO `dept` VALUES ('13', 'BTFYK', '变态反应科', '11', '1');
INSERT INTO `dept` VALUES ('14', 'PTWK', '普通外科', '12', '1');
INSERT INTO `dept` VALUES ('15', 'MNWK', '泌尿外科', '12', '1');
INSERT INTO `dept` VALUES ('16', 'SJWK', '神经外科', '12', '1');
INSERT INTO `dept` VALUES ('17', 'XWK', '胸外科', '12', '1');
INSERT INTO `dept` VALUES ('18', 'ZXWK', '整形外科', '12', '1');
INSERT INTO `dept` VALUES ('19', 'GCWK', '肛肠外科', '12', '1');
INSERT INTO `dept` VALUES ('20', 'GDWK', '肝胆外科', '12', '1');
INSERT INTO `dept` VALUES ('21', 'RXWK', '乳腺外科', '12', '1');
INSERT INTO `dept` VALUES ('22', 'XXGWK', '心血管外科', '12', '1');
INSERT INTO `dept` VALUES ('23', 'XZWK', '心脏外科', '12', '1');
INSERT INTO `dept` VALUES ('24', 'QGYZ', '器官移植', '12', '1');
INSERT INTO `dept` VALUES ('25', 'WCWK', '微创外科', '12', '1');
INSERT INTO `dept` VALUES ('26', 'GNSJWK', '功能神经外科', '12', '1');
INSERT INTO `dept` VALUES ('27', 'XTWK', '腺体外科', '12', '1');
INSERT INTO `dept` VALUES ('28', 'EKZH', '儿科综合', '14', '1');
INSERT INTO `dept` VALUES ('29', 'XEWK', '小儿外科', '14', '1');
INSERT INTO `dept` VALUES ('30', 'ETBJK', '儿童保健科', '14', '1');
INSERT INTO `dept` VALUES ('31', 'XSEK', '新生儿科', '14', '1');
INSERT INTO `dept` VALUES ('32', 'XEGK', '小儿骨科', '14', '1');
INSERT INTO `dept` VALUES ('33', 'XESJNK', '小儿神经内科', '14', '1');
INSERT INTO `dept` VALUES ('34', 'XEHXK', '小儿呼吸科', '14', '1');
INSERT INTO `dept` VALUES ('35', 'XEXYK', '小儿血液科', '14', '1');
INSERT INTO `dept` VALUES ('36', 'XEEBHK', '小儿耳鼻喉科', '14', '1');
INSERT INTO `dept` VALUES ('37', 'XEXNK', '小儿心内科', '14', '1');
INSERT INTO `dept` VALUES ('38', 'XEKFK', '小儿康复科', '14', '1');
INSERT INTO `dept` VALUES ('39', 'XEJSK', '小儿精神科', '14', '1');
INSERT INTO `dept` VALUES ('40', 'XESNK', '小儿肾内科', '14', '1');
INSERT INTO `dept` VALUES ('41', 'XEXHK', '小儿消化科', '14', '1');
INSERT INTO `dept` VALUES ('42', 'XEPFK', '小儿皮肤科', '14', '1');
INSERT INTO `dept` VALUES ('43', 'XEJZK', '小儿急诊科', '14', '1');
INSERT INTO `dept` VALUES ('44', 'XENFMK', '小儿内分泌科', '14', '1');
INSERT INTO `dept` VALUES ('45', 'XEMNWK', '小儿泌尿外科', '14', '1');
INSERT INTO `dept` VALUES ('46', 'XEGRK', '小儿感染科', '14', '1');
INSERT INTO `dept` VALUES ('47', 'XEXWK01', '小儿心外科', '14', '1');
INSERT INTO `dept` VALUES ('48', 'XEXWK02', '小儿胸外科', '14', '1');
INSERT INTO `dept` VALUES ('49', 'XESJWK', '小儿神经外科', '14', '1');
INSERT INTO `dept` VALUES ('50', 'XEZXK', '小儿整形科', '14', '1');
INSERT INTO `dept` VALUES ('51', 'XEFSMYK', '小儿风湿免疫科', '14', '1');
INSERT INTO `dept` VALUES ('52', 'XEFK', '小儿妇科', '14', '1');
INSERT INTO `dept` VALUES ('53', 'CRK', '传染科', '15', '1');
INSERT INTO `dept` VALUES ('54', 'GBK', '肝病科', '15', '1');
INSERT INTO `dept` VALUES ('55', 'AZBK', '艾滋病科', '15', '1');
INSERT INTO `dept` VALUES ('56', 'CRWZS', '传染危重室', '15', '1');
INSERT INTO `dept` VALUES ('57', 'FCKZH', '妇产科综合', '16', '1');
INSERT INTO `dept` VALUES ('58', 'FK', '妇科', '16', '1');
INSERT INTO `dept` VALUES ('59', 'CK', '产科', '16', '1');
INSERT INTO `dept` VALUES ('60', 'JHSYK', '计划生育科', '16', '1');
INSERT INTO `dept` VALUES ('61', 'FKNFM', '妇科内分泌', '16', '1');
INSERT INTO `dept` VALUES ('62', 'YCZYK', '遗传咨询科', '16', '1');
INSERT INTO `dept` VALUES ('63', 'CQJCK', '产前检查科', '16', '1');
INSERT INTO `dept` VALUES ('64', 'FMNK', '妇泌尿科', '16', '1');
INSERT INTO `dept` VALUES ('65', 'QLX', '前列腺', '17', '1');
INSERT INTO `dept` VALUES ('66', 'XGNZA', '性功能障碍', '17', '1');
INSERT INTO `dept` VALUES ('67', 'SZQGR', '生殖器感染', '17', '1');
INSERT INTO `dept` VALUES ('68', 'NXBY', '男性不育', '17', '1');
INSERT INTO `dept` VALUES ('69', 'SZZX', '生殖整形', '17', '1');
INSERT INTO `dept` VALUES ('70', 'JSK', '精神科', '18', '1');
INSERT INTO `dept` VALUES ('71', 'SFJDK', '司法鉴定科', '18', '1');
INSERT INTO `dept` VALUES ('72', 'YWYLK', '药物依赖科', '18', '1');
INSERT INTO `dept` VALUES ('73', 'ZYJSK', '中医精神科', '18', '1');
INSERT INTO `dept` VALUES ('74', 'SXZAK', '双相障碍科', '18', '1');
INSERT INTO `dept` VALUES ('75', 'PFK', '皮肤科', '19', '1');
INSERT INTO `dept` VALUES ('76', 'XBK', '性病科', '19', '1');
INSERT INTO `dept` VALUES ('77', 'ZYZHK', '中医综合科', '20', '1');
INSERT INTO `dept` VALUES ('78', 'ZJK', '针灸科', '20', '1');
INSERT INTO `dept` VALUES ('79', 'ZYGK', '中医骨科', '20', '1');
INSERT INTO `dept` VALUES ('80', 'ZYFCK', '中医妇产科', '20', '1');
INSERT INTO `dept` VALUES ('81', 'ZYWK', '中医外科', '20', '1');
INSERT INTO `dept` VALUES ('82', 'ZYEK', '中医儿科', '20', '1');
INSERT INTO `dept` VALUES ('83', 'ZYGCK', '中医肛肠科', '20', '1');
INSERT INTO `dept` VALUES ('84', 'ZYPFK', '中医皮肤科', '20', '1');
INSERT INTO `dept` VALUES ('85', 'ZYWGK', '中医五官科', '20', '1');
INSERT INTO `dept` VALUES ('86', 'ZYAMK', '中医按摩科', '20', '1');
INSERT INTO `dept` VALUES ('87', 'ZYXHK', '中医消化科', '20', '1');
INSERT INTO `dept` VALUES ('88', 'ZYZLK', '中医肿瘤科', '20', '1');
INSERT INTO `dept` VALUES ('89', 'ZYXNK', '中医心内科', '20', '1');
INSERT INTO `dept` VALUES ('90', 'ZYSJNK', '中医神经内科', '20', '1');
INSERT INTO `dept` VALUES ('91', 'ZYSBNK', '中医肾病内科', '20', '1');
INSERT INTO `dept` VALUES ('92', 'ZYNFM', '中医内分泌', '20', '1');
INSERT INTO `dept` VALUES ('93', 'ZYHXK', '中医呼吸科', '20', '1');
INSERT INTO `dept` VALUES ('94', 'ZYGBK', '中医肝病科', '20', '1');
INSERT INTO `dept` VALUES ('95', 'ZYNK', '中医男科', '20', '1');
INSERT INTO `dept` VALUES ('96', 'ZYFSMYNK', '中医风湿免疫内科', '20', '1');
INSERT INTO `dept` VALUES ('97', 'ZYXYK', '中医血液科', '20', '1');
INSERT INTO `dept` VALUES ('98', 'ZYRXWK', '中医乳腺外科', '20', '1');
INSERT INTO `dept` VALUES ('99', 'ZYLNBK', '中医老年病科', '20', '1');
INSERT INTO `dept` VALUES ('100', 'ZLZHK', '肿瘤综合科', '21', '1');
INSERT INTO `dept` VALUES ('101', 'ZLNK', '肿瘤内科', '21', '1');
INSERT INTO `dept` VALUES ('102', 'FLK', '放疗科', '21', '1');
INSERT INTO `dept` VALUES ('103', 'ZLWK', '肿瘤外科', '21', '1');
INSERT INTO `dept` VALUES ('104', 'ZLFK', '肿瘤妇科', '21', '1');
INSERT INTO `dept` VALUES ('105', 'GZLK', '骨肿瘤科', '21', '1');
INSERT INTO `dept` VALUES ('106', 'ZLKFK', '肿瘤康复科', '21', '1');
INSERT INTO `dept` VALUES ('107', 'GWK', '骨外科', '22', '1');
INSERT INTO `dept` VALUES ('108', 'SWK', '手外科', '22', '1');
INSERT INTO `dept` VALUES ('109', 'CSGK', '创伤骨科', '22', '1');
INSERT INTO `dept` VALUES ('110', 'JZWK', '脊柱外科', '22', '1');
INSERT INTO `dept` VALUES ('111', 'GGJK', '骨关节科', '22', '1');
INSERT INTO `dept` VALUES ('112', 'GZSSK', '骨质疏松科', '22', '1');
INSERT INTO `dept` VALUES ('113', 'JXGK', '矫形骨科', '22', '1');
INSERT INTO `dept` VALUES ('114', 'EBYHTJK', '耳鼻咽喉头颈科', '23', '1');
INSERT INTO `dept` VALUES ('115', 'KQK', '口腔科', '23', '1');
INSERT INTO `dept` VALUES ('116', 'YK', '眼科', '23', '1');
INSERT INTO `dept` VALUES ('117', 'KFK', '康复科', '24', '2');
INSERT INTO `dept` VALUES ('118', 'LLK', '理疗科', '24', '2');
INSERT INTO `dept` VALUES ('119', 'MZK', '麻醉科', '25', '2');
INSERT INTO `dept` VALUES ('120', 'TTK', '疼痛科', '25', '2');
INSERT INTO `dept` VALUES ('121', 'YYK', '营养科', '26', '2');
INSERT INTO `dept` VALUES ('122', 'GYYK', '高压氧科', '27', '2');
INSERT INTO `dept` VALUES ('123', 'GNJCK', '功能检查科', '27', '2');
INSERT INTO `dept` VALUES ('124', 'BLK', '病理科', '27', '2');
INSERT INTO `dept` VALUES ('125', 'JYK', '检验科', '27', '2');
INSERT INTO `dept` VALUES ('126', 'SYZX', '实验中心', '27', '2');
INSERT INTO `dept` VALUES ('127', 'XDTK', '心电图科', '27', '2');
INSERT INTO `dept` VALUES ('128', 'FSK', '放射科', '28', '2');
INSERT INTO `dept` VALUES ('129', 'CSZDK', '超声诊断科', '28', '2');
INSERT INTO `dept` VALUES ('130', 'YXYXK', '医学影像科', '28', '2');
INSERT INTO `dept` VALUES ('131', 'HY学K', '核医学科', '28', '2');
INSERT INTO `dept` VALUES ('132', 'YJK', '药剂科', '29', '2');
INSERT INTO `dept` VALUES ('133', 'HLK', '护理科', '29', '2');
INSERT INTO `dept` VALUES ('134', 'TJK', '体检科', '29', '2');
INSERT INTO `dept` VALUES ('135', 'JZK', '急诊科', '29', '2');
INSERT INTO `dept` VALUES ('136', 'GGWSYYFK', '公共卫生与预防科', '29', '2');
INSERT INTO `dept` VALUES ('137', 'SBK', '设备科', '29', '4');
INSERT INTO `dept` VALUES ('138', 'CWK', '财务科', '29', '3');
