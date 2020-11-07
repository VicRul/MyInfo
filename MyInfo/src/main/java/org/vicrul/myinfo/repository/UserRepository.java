package org.vicrul.myinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vicrul.myinfo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findById(int id);
}
