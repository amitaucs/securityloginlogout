package com.amisoft.login.config;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserConfig {

    @Bean
    UserDetailsManager memory(){
        return new InMemoryUserDetailsManager();
    }


    @Bean
    InitializingBean initializer(UserDetailsManager manager){

        return () -> {

            UserDetails amisoft = User.withDefaultPasswordEncoder().username("amisoft").password("password").roles("USER").build();
            manager.createUser(amisoft);

            UserDetails dev = User.withUserDetails(amisoft).username("dev").password("password2").build();
            manager.createUser(dev);
        };
    }
}
