package com.advanced.shop.online.shop.repositoryy;

import com.advanced.shop.online.shop.modell.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {





}
