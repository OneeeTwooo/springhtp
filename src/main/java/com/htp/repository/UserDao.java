package com.htp.repository;

import com.htp.domain.User;

import java.util.List;

public interface UserDao extends GenericDao<User, Long> {

    User findByLogin(String login);

    List<Long> batchUpdate(List<User> users);

    List<User> search(String query);

    List<User> search(String query, Integer limit, Integer offset);
}
