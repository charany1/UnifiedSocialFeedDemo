package com.blogofyogi.UnifiedSocialFeedDemo.controller;


import com.blogofyogi.UnifiedSocialFeedDemo.pojo.codeforces.CodeforcesUserInfo;
import com.blogofyogi.UnifiedSocialFeedDemo.service.CodeforcesService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UnifiedDevProfileController {


    @Autowired
    CodeforcesService codeforcesService;

    @Autowired
    Gson gson;

    @GetMapping("/codeforces/{codeforces_handle}")
    public ResponseEntity<CodeforcesUserInfo> getUnifiedDevProfile(@PathVariable("codeforces_handle") String codeforcesHandle){
        log.info("Codeforces Handle : {}",codeforcesHandle);
        ResponseEntity<CodeforcesUserInfo> responseEntity = new ResponseEntity<CodeforcesUserInfo>(codeforcesService.getUserInfo(codeforcesHandle), HttpStatus.OK);
        return responseEntity;
    }




}
