package com.study.diffoath2service.modules.inter.web;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class UserController {

    /**
     * 返回授权用户信息
     * @param user
     * @return
     */
    @RequestMapping("/user")
    public Map<String, Object> user(OAuth2Authentication user){
        Map<String, Object> userInfo = new LinkedHashMap<>();
        userInfo.put("user", user.getUserAuthentication().getPrincipal());
        userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
        return userInfo;
    }
}
