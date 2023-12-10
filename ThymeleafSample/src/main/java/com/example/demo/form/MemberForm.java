package com.example.demo.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberForm {
	private Integer id;
	private String name;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate birth;
	private Integer Age;
}
