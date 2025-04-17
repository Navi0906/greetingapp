package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

}
