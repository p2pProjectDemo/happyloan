package com.group8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.group8.service.IdCardService.getIdCardDetail;

/**
 * className:IdCard
 * descriptive:调用获取身份证方法
 * author:荣恒
 * createTime:2018/11/21 10:33
 */

@Controller
@RequestMapping("idCard")
public class IdCardController {


	/**
	 * 调用获取身份证方法
	 * @param card
	 * @return
	 */
	@ResponseBody
	@RequestMapping("idCardResult")
	public Object idCardResult(@RequestParam String card){
		String idCardDetail = getIdCardDetail(card);
//		System.out.println(idCardDetail);
		return idCardDetail;
	}

	/**
	 * 跳转页面
	 * @return
	 */
	@RequestMapping(value = "toUser")
	public String toUser(){

		return "user";
	}


}
