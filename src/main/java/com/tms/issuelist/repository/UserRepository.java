package com.tms.issuelist.repository;

import com.tms.issuelist.model.User;
import com.tms.issuelist.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
