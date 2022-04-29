package test.koo.koo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CONT {

    @GetMapping("k")
    public String kkk(){
        return "koo";
    }

    @GetMapping("/kup")
    public String ktest(){
        return "version upgrade koo";
    }
}
