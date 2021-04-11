package com.grapefruit.mytomcat;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component("run")
public class Run {
    public void run(){
        System.out.println("A---->");
        int i = 1/1;
    }

    public void task1(){
        System.out.println(getTimeStr() + "任务1==========>");
    }

    public void task2(){
        System.out.println(getTimeStr() + "任务2==========>");
    }

    public static String getTimeStr(){
        return "使用java配置web " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        //return "=========graepfruit===== 20210411 =======";
    }
}
