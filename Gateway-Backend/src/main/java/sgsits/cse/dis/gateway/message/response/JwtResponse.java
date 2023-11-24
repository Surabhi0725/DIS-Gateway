package sgsits.cse.dis.gateway.message.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private String username;
	private Collection<? extends GrantedAuthority> authorities;


	private String userType;

	public JwtResponse(String accessToken, String username, Collection<? extends GrantedAuthority> authorities, String userType) {
		this.token = accessToken;
		this.username = username;
		this.authorities = authorities;
		this.userType = userType;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
		
	public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

	public  void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType() {
		return userType;
	}
}