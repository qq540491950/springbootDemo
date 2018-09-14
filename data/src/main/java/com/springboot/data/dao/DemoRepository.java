package com.springboot.data.dao;

import com.springboot.data.entity.Demo;
import org.springframework.data.repository.CrudRepository;


/**
 * @author lirt
 *
 * 在CrudRepository自带常用的crud方法.
 * 这样一个基本dao就写完了.
 */
public interface DemoRepository extends CrudRepository<Demo, String> {
}
