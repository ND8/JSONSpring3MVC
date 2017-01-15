package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Shop;


//Add @ResponseBody as return value. When Spring sees Jackson library is existed in the project classpath The mvc:annotation-driven is enabled
//Return method annotated with @ResponseBody
//Spring will handle the JSON conversion automatically


@Controller
@RequestMapping("/qactraining/food")
public class JSONController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { "nabil", "james" });

		return shop;

	}
	
	//run on tomcat then add this url at the end    --->    /rest/qactraining/food/kfc-kampar

}