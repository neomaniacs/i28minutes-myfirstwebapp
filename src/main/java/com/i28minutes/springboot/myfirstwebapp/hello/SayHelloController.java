package com.i28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are your learning today?" ;
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer() ;
        sb.append("<html>") ;
        sb.append("<head>") ;
        sb.append("<title>Mt first HTML Page</title>") ;
        sb.append("</head>") ;
        sb.append("<body>") ;
        sb.append("My first HTML Page") ;
        sb.append("</body>") ;
        sb.append("</html>") ;
        return sb.toString() ;
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello" ;
    }

}
