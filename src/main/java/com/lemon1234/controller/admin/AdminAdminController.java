package com.lemon1234.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lemon1234.entity.dto.GetAdminListDTO;
import com.lemon1234.entity.vo.GetAdminListVO;
import com.lemon1234.service.AdminService;
import com.lemon1234.sys.result.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "{管理端-管理员管理端}")
@RestController
@RequestMapping("/admin/admin")
public class AdminAdminController {
	
	@Autowired
	private AdminService adminService;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@ApiOperation(value = "查询所有系统管理员", notes = "查看可以都去查看，但是管理员不能查看到系统最高管理员", httpMethod = "POST")
	@PostMapping("/getAdminList")
	public Result getAdminList(@RequestBody GetAdminListDTO dto) throws Exception {
		Page<GetAdminListVO> adminPage = adminService.getAdminList(dto);
		return Result.success(adminPage);
	}
	
}
