package com.spring.blogs.myblogs.repository;

import com.spring.blogs.myblogs.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * user repository 接口
 */
public interface UserRepo extends CrudRepository<User,Long> {
   //自定义的接口就不需要了,,Spring data JPA提供了
    //实现类也不需要了(删了),Spring data JPA提供了
}
