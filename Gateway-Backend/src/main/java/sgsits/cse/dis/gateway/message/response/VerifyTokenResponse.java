package sgsits.cse.dis.gateway.message.response;

import org.springframework.stereotype.Component;

@Component
public class VerifyTokenResponse {
    private String username;
    private String userType;
    private String token;

    public  VerifyTokenResponse(){

    }

    public VerifyTokenResponse(String username, String userType, String token) {
        this.token = token;
        this.username = username;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
