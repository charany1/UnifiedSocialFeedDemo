package com.blogofyogi.UnifiedSocialFeedDemo.dao;


import com.blogofyogi.UnifiedSocialFeedDemo.config.CodeforcesConfig;
import com.blogofyogi.UnifiedSocialFeedDemo.pojo.codeforces.CodeforcesUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class CodeforcesDaoService{

    @Autowired
    CodeforcesConfig codeforcesConfig;
    @Autowired
    RestTemplate restTemplate;

    public CodeforcesUserInfo getUserInfo(String handle){

        CodeforcesUserInfo response=  restTemplate.getForObject(codeforcesConfig.getUserInfoUrl()+handle, CodeforcesUserInfo.class);
        return response;
    }


}
