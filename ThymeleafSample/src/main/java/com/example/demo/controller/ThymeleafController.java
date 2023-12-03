package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	@GetMapping("show")
	public String showMember(Model model) {
		
		
		//Modelにデータを格納する
		model.addAttribute("name", "太郎");
		
		//ビュー名を返す
		//return "showMember";
		return "commons/layout";
	}
}
