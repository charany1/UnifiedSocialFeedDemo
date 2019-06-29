package com.blogofyogi.UnifiedSocialFeedDemo.pojo.codeforces;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "result"
})
@ToString
public class CodeforcesUserInfo {

    @JsonProperty("status")
    public String status;
    @JsonProperty("result")
    public List<Result> result = null;

}