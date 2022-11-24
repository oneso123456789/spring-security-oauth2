
package io.security.oauht2.springsecurityoauth2;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {

    private boolean isSecure;

    @Override
    public void init(HttpSecurity builder) throws Exception {
        super.init(builder);
        System.out.println("init method started");
    }



    public CustomSecurityConfigurer setFlag(boolean isSecure){
        this.isSecure = isSecure;
        return this;
    }

    public CustomSecurityConfigurer setFlag2(boolean isSecure){
        this.isSecure = isSecure;
        return this;
    }
}

