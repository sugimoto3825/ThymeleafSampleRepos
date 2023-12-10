package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* TEST_MEMBERテーブル エンティティ */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Member {
	//ID
	@Id
	private Integer id;
	//名前
	private String name;
	//生年月日
	private LocalDate birth;
	//年齢
	private Integer age;

}
