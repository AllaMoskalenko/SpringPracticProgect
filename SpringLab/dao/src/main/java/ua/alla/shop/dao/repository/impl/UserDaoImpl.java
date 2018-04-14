package ua.alla.shop.dao.repository.impl;

import org.springframework.stereotype.Repository;
import ua.alla.shop.dao.model.User;
import ua.alla.shop.dao.repository.UserDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    private final Map<Long, User> users = new HashMap<>();

    private static volatile long idGenerator = 1L;

    public void create(User user) {
        user.setId(idGenerator++);
        users.put(user.getId(), user);
    }

    public Map<Long, User> getUsers() {
        return users;
    }

    public List<User> findAll(){
        return new ArrayList<>(users.values());
    }
}
