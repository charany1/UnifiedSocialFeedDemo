package com.blogofyogi.UnifiedSocialFeedDemo.pojo.codeforces;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lastName",
        "country",
        "lastOnlineTimeSeconds",
        "city",
        "rating",
        "friendOfCount",
        "titlePhoto",
        "handle",
        "avatar",
        "firstName",
        "contribution",
        "organization",
        "rank",
        "maxRating",
        "registrationTimeSeconds",
        "maxRank"
})
@ToString
public class Result {

    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("country")
    public String country;
    @JsonProperty("lastOnlineTimeSeconds")
    public Integer lastOnlineTimeSeconds;
    @JsonProperty("city")
    public String city;
    @JsonProperty("rating")
    public Integer rating;
    @JsonProperty("friendOfCount")
    public Integer friendOfCount;
    @JsonProperty("titlePhoto")
    public String titlePhoto;
    @JsonProperty("handle")
    public String handle;
    @JsonProperty("avatar")
    public String avatar;
    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("contribution")
    public Integer contribution;
    @JsonProperty("organization")
    public String organization;
    @JsonProperty("rank")
    public String rank;
    @JsonProperty("maxRating")
    public Integer maxRating;
    @JsonProperty("registrationTimeSeconds")
    public Integer registrationTimeSeconds;
    @JsonProperty("maxRank")
    public String maxRank;

}