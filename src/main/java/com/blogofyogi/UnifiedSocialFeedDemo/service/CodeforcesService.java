package com.blogofyogi.UnifiedSocialFeedDemo.service;


import com.blogofyogi.UnifiedSocialFeedDemo.dao.CodeforcesDaoService;
import com.blogofyogi.UnifiedSocialFeedDemo.pojo.codeforces.CodeforcesUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodeforcesService {

    @Autowired
    CodeforcesDaoService codeforcesDaoService;

    public CodeforcesUserInfo getUserInfo(String handle){
        return codeforcesDaoService.getUserInfo(handle);
    }
}
