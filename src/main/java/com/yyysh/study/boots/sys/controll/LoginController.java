package com.yyysh.study.boots.sys.controll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyysh.study.common.eneity.BaseController;
import com.yyysh.study.common.util.StringUtils;

/**
 * 
* @ClassName: LoginController 
* @Description: 登录
* @author Austin YE
* @date 2020年3月7日 下午3:04:06 
*
*/
@Controller
public class LoginController extends BaseController{

	
    /**
     * GET 登录
     * @return {String}
     */
    @GetMapping("/login")
    public String login() {
        logger.info("GET请求登录");
      /*  if (SecurityUtils.getSubject().isAuthenticated()) {
            return "redirect:/index";
        }*/
        return "system/login";
    }
    
    
    /**
     * POST 登录 shiro 写法
     *
     * @param username 用户名
     * @param password 密码
     * @return {Object}
     */
    @PostMapping("/loginsubmit")
    @ResponseBody
    public Object loginPost(HttpServletRequest request, HttpServletResponse response,
            String username, String password, String captcha, 
            @RequestParam(value = "rememberMe", defaultValue = "0") Integer rememberMe) {
        logger.info("POST请求登录");
        // 改为全部抛出异常，避免ajax csrf token被刷新
        if (StringUtils.isBlank(username)) {
            throw new RuntimeException("用户名不能为空");
        }
        if (StringUtils.isBlank(password)) {
            throw new RuntimeException("密码不能为空");
        }
        if (StringUtils.isBlank(captcha)) {
            throw new RuntimeException("验证码不能为空");
        }
       /* if (验证码模块.validate(request, response, captcha)) {
            throw new RuntimeException("验证码错误");
        }*/
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 设置记住密码
        token.setRememberMe(1 == rememberMe);
        try {
            user.login(token);
            return "baseController公共方法";
        } catch (UnknownAccountException e) {
            throw new RuntimeException("账号不存在！", e);
        } catch (DisabledAccountException e) {
            throw new RuntimeException("账号未启用！", e);
        } catch (IncorrectCredentialsException e) {
            throw new RuntimeException("密码错误！", e);
        } catch (Throwable e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    
    
    
    /**
     * 未授权
     * @return {String}
     */
    @GetMapping("/unauth")
    public String unauth() {
        if (SecurityUtils.getSubject().isAuthenticated() == false) {
            return "redirect:/login";
        }
        return "unauth";
    }
    
    
    /**
     * 退出
     * @return {Result}
     */
    @PostMapping("/logout")
    @ResponseBody
    public Object logout() {
        logger.info("登出");
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "成功";
    }
    
}
