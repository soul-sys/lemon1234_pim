package com.lemon1234.entity.dict;

public class Constants {
	
	// RSA 公钥私钥
	// 公钥
	public static final String RSA_PUBLIC_KEY = "001";
	// 私钥
	public static final String RSA_PRIVATE_KEY = "002";

	
	// 系统返回状态
	// 成功
	public static final Integer HTTP_200 = 200;
	// 业务代码错误
	public static final Integer HTTP_500 = 500;
	// 权限不够
	public static final Integer HTTP_401 = 401;
	// 数据错误
	public static final Integer HTTP_201 = 201;
	
	// Jwt token 状态返回
	public static final Integer JWT_ERRCODE_NULL = 4000;
	public static final Integer JWT_ERRCODE_EXPIRE = 4001;
	public static final Integer JWT_ERRCODE_FAIL = 4002;
	
	// 账号封禁
	// ON 正常
	public static final String ON = "ON";
	// OFF 不正常
	public static final String OFF = "OFF";
	
	// 密码类型
	// 明码
	public static final String PLAINCODE = "plainCode";
	// 加密后密码
	public static final String ENCRYPTCODE = "encryptCode";
	
	// 请求方式 GET
	public static final String GET = "GET";
	// 请求方式 POST
	public static final String POST = "POST";
	
	// 性别
	// 男
	public static final Integer MAN = 1;
	// 女
	public static final Integer WOMAN = 2;
	// 未知
	public static final Integer ALIENS = 0;
	
	// 系统文件类型（对应文件上传、查看、下载等）
	// 图片
	public static final String IMAGE = "img";
	
	public static void main(String[] args) {
		System.out.println("encryptCode".toUpperCase());
	}
}
