

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `remove_status` int(11) NOT NULL  COMMENT '删除状态',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `department_id` int(11) NOT NULL COMMENT '部门主键',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工信息';

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
   `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `remove_status` int(11) NOT NULL  COMMENT '删除状态',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息';
