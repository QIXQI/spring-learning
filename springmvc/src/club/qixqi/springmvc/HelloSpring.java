package club.qixqi.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloSpring{
    /**
     * 1. 使用 RequestMapping 注解映射请求的URL
     * 2. 返回值通过视图解析器解析为实际的物理视图
     *          InternalResourceViewResolver 视图解析器解析： prefix + 返回值 + suffix
     *          eg. 返回值 result, 得到实际物理视图："WEB-INF/result.jsp", 然后物理视图返回给 DispatchServlet
     */
    @RequestMapping("/click")
    public String hellospring(){
        System.out.println("hello spring");
        return "result";
    }
}