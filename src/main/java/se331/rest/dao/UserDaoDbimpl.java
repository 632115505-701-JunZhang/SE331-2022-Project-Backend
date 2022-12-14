package se331.rest.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.security.entity.User;
import se331.rest.security.repository.UserRepository;

@Repository
public class UserDaoDbimpl implements UserDao {
    @Autowired
    UserRepository userRepository;

    @Override
    public Page<User> getUser(Pageable pageRequest) {
        return userRepository.findAll(pageRequest);
    }
}
