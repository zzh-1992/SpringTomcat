package com.grapefruit.mytomcat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@RestController
public class Homepage {
    @RequestMapping("/")
    public String homepage(){
        return Run.getTimeStr();
    }
}
