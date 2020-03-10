package com.yyysh.study.boots.sys.controll;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SystemController {
	

	
	  /**
     * GET 登录
     * @return {String}
     */
    @GetMapping("/loginsys")
    public String login() {
        return "system/login";
    }
    
    @GetMapping({"/", "", "/index"})
    public String index() {
    	return "index/index";
    }
}
