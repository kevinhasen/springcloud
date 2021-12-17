CREATE DATABASE springcloud;

-- 使用springcloud数据库
USE springcloud;
-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
CREATE TABLE `tb_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) DEFAULT NULL COMMENT '用户名',
  `password` VARCHAR(100) DEFAULT NULL COMMENT '密码',
  `name` VARCHAR(100) DEFAULT NULL COMMENT '姓名',
  `age` INT(11) DEFAULT NULL COMMENT '年龄',
  `sex` INT(11) DEFAULT NULL COMMENT '性别，1男，2女',
  `birthday` DATE DEFAULT NULL COMMENT '出生日期',
  `created` DATE DEFAULT NULL COMMENT '创建时间',
  `updated` DATE DEFAULT NULL COMMENT '更新时间',
  `note` VARCHAR(1000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户信息表';
-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'zhangsan', '123456', '张三', '13', '1', '2006-08-01', '2019-05-16', '2019-05-16', '张三');
INSERT INTO `tb_user` VALUES ('2', 'lisi', '123456', '李四', '13', '1', '2006-08-01', '2019-05-16', '2019-05-16', '李四');