package org.maxkey.springboot.oauthclient.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceController {
    @GetMapping("/userinfo")
    public String getUserInfo() {
        return "userinfo";
    }
    
    @GetMapping("/")
    public String index() {
    	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getPrincipal().toString();
    }
}
