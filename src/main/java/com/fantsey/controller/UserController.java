package com.fantsey.controller;

import com.fantsey.entity.TUser;
import com.fantsey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fantsey
 * @date 2019/6/24
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "user/{userId}")
    @ResponseBody
    public TUser getByUserId(@PathVariable String userId){
        return userService.findByUserId(userId);
    }


}
