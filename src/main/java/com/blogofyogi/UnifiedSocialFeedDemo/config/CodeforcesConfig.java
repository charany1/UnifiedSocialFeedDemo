package com.blogofyogi.UnifiedSocialFeedDemo.config;


import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.properties")
@ToString
public class CodeforcesConfig {
    @Value("${codeforces.userinfo.url}")
    @Getter
    private String userInfoUrl;
}
