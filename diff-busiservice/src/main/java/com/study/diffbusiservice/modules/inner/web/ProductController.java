package com.study.diffbusiservice.modules.inner.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class); //日志对象

    /**
     * 获取 产品信息
     * @param id
     * @return
     */
    @RequestMapping("/getProduct/{id}")
    public String getProduct(@PathVariable String id){
        logger.debug("id:" + id);
        return "product id : " + id;
    }

    /**
     * 获取认证信息
     * @param oAuth2Authentication
     * @param principal
     * @param authentication
     * @return
     */
    @RequestMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal, Authentication authentication){
        logger.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        logger.info(oAuth2Authentication.toString());
        logger.info("principal.toString() " + principal.toString());
        logger.info("principal.getName() " + principal.getName());
        logger.info("authentication: " + authentication.getAuthorities().toString());

        return oAuth2Authentication;
    }
}
