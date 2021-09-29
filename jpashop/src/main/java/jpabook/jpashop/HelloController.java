package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        // model을 통해서 controller에서 view로 데이터를 넘길 수 있어요.
        model.addAttribute("data", "Hello!");

        // return ${화면이름}
        // resources/templates/${화면이름} 을 넘기게 됨
        return "hello";
    }

}
