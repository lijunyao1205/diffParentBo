package com.study.diffoath2service.modules.inter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class); //日志对象

    /**
     * 返回授权用户信息
     * @param user
     * @return
     */
    /*@RequestMapping("/current")
    public Map<String, Object> user(OAuth2Authentication user){
        Map<String, Object> userInfo = new LinkedHashMap<>();
        userInfo.put("user", user.getUserAuthentication().getPrincipal());
        userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
        return userInfo;
    }*/
    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info(principal.toString());
        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        return principal;
    }
}
