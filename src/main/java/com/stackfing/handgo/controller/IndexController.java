package com.stackfing.handgo.controller;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.service.ProductTypeService;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
	private ProductTypeService productTypeService;

	@GetMapping("/")
	public String index(ModelMap modelMap) {
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		return "index";
	}

}
