package se331.rest.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.security.entity.User;

public interface UserDao {
    Page<User> getUser(Pageable pageRequest);
}
