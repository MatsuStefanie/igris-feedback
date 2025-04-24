package br.com.matsu.igris.domain.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoginResponse {
    private String token;
    private String message;
    private String userId;
    private String username;
    private List<String> roles;
    private boolean success;
}