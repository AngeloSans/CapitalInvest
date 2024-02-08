package com.example.CapitalInvest.Security.oauth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class CustomOAuth2Usuario implements OAuth2User {

    private OAuth2User oauth2user;

    public CustomOAuth2Usuario(OAuth2User oauth2user){
        this.oauth2user = oauth2user;
    }
    @Override
    public Map<String, Object> getAttributes(){
        return oauth2user.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return oauth2user.getAuthorities();
    }
    @Override
    public String getName(){
        return (String) oauth2user.getAttributes().get("name");
    }
    public String getEmail(){
        return (String) oauth2user.getAttributes().get("email");
    }


}
