package com.yanghai.docker.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("hello")
    public String Hello() {
        return "Hello World! Hello Docker!";
    }

    @GetMapping("test")
    public String Test() {
        return "test";
    }

    @GetMapping("login.html")
    public String login() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>登录页面</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>自定义登录页面</h2>\n" +
                "<form action=\"/user/login\"  method=\"post\">\n" +
                "    <table>\n" +
                "        <tr>\n" +
                "            <td>用户名：</td>\n" +
                "            <td><input type=\"text\" name=\"username\"></td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>密码：</td>\n" +
                "            <td><input type=\"password\" name=\"password\"></td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td colspan=\"2\"><button type=\"submit\">登录</button></td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
    }
}
