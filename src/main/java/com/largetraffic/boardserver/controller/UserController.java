package com.largetraffic.boardserver.controller;

import com.largetraffic.boardserver.service.UserService;
import com.largetraffic.boardserver.service.UserServiceImpl;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Log4j2
public class UserController {
  private final UserServiceImpl userService;


  @Autowired
    public UserController(UserServiceImpl userService){
      this.userService=userService;

  }


}