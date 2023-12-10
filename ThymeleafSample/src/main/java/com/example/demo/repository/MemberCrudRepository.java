package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Member;

//CRUDメソッドを使用するため、CrudRepositoryを継承
//引数　保存対象のオブジェクトの型（エンティティ）
//　　　保存対象のオブジェクトの主キーの型
public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
