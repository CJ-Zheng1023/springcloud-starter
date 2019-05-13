package cn.afterwin.dao;

import cn.afterwin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: zhengchj
 * @create: 2019-05-09 16:11
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}
