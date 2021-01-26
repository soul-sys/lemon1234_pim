# lemon1234_pim

## 使用技术

	- redis
	- elasticsearch
	- security
	- mybatis plus
	- JWT
	- swagger2
	- logback
	
## 项目编码

	项目编码：UTF-8
	
## 数据库

### 删除数据库
	DROP TABLE IF EXISTS `t_pim_admin`;
	DROP TABLE IF EXISTS `t_pim_admin_role`;
	DROP TABLE IF EXISTS `t_pim_role`;
	
### 创建表

	-- admin 管理员表
	CREATE TABLE `t_pim_admin`  (
		`id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
		`account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`password` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`createDt` datetime(0) NULL DEFAULT NULL,
		`email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`phoneNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`gender` int(0) NULL DEFAULT NULL,
		`name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`img` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`ban` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		PRIMARY KEY (`id`) USING BTREE
	) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
	

	-- admin & role 管理员权限表
	CREATE TABLE `t_pim_admin_role`  (
		`id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
		`adminId` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`roleId` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		PRIMARY KEY (`id`) USING BTREE
	) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


	-- role 权限表
	CREATE TABLE `t_pim_role`  (
		`id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
		`name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		`engName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
		PRIMARY KEY (`id`) USING BTREE	
	) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
	
README.md 编写规范：https://www.cnblogs.com/wj-1314/p/8547763.html