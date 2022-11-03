package com.cg;

import com.cg.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class C0522SpbAjaxBankingLocationJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(C0522SpbAjaxBankingLocationJwtApplication.class, args);
        System.out.println("Application is running.......");


    }
    @Bean(name = "USER_BEAN")
    public User setUser(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }

}
