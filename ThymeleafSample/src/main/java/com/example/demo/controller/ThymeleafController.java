package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;

@Controller
public class ThymeleafController {
	@Autowired
	MemberCrudRepository repos;
	
	/*	@GetMapping("show")
		public String showMember(Model model) {
			
			
			//Modelにデータを格納する
			model.addAttribute("name", "太郎");
			
			//ビュー名を返す
			return "showMember";
			//return "commons/layout";
		}*/
	
	@GetMapping("index")
	public String showMember(Model model) {
		//MEMBERテーブルからすべてのデータを取得
		Iterable<Member> memberList = repos.findAll();
		
		//Modelにデータを格納する
		model.addAttribute("member", memberList);
		
		//ビュー名を返す
		return "showMember";
		//return "commons/layout";
	}
	
	//entry.htmlで送信ボタン押下時に呼ばれる
	//@RequestParamでビュー（entry.html）で記述したname属性の名前の変数を受け取る
	@PostMapping("confirm")
	public String confirmView(
			Model model,
			@RequestParam String name,
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth,
			@RequestParam Integer age
			) {
		model.addAttribute("name", name);
		model.addAttribute("birth", birth);
		model.addAttribute("age", age);
		
		return "confirm";
	}
	
	/* ※※※ 実装中 ※※※ */
	//MEMBERテーブルへのInsert
	@PostMapping("create")
	public String createMember(
			Model model,
			@RequestParam String name,
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth,
			@RequestParam Integer age
			) {
		model.addAttribute("name", name);
		model.addAttribute("birth", birth);
		model.addAttribute("age", age);
		
		return "confirm";
	}
}
