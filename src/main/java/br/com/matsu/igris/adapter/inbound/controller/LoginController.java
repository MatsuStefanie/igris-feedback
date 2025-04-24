package br.com.matsu.igris.adapter.inbound.controller;

import br.com.matsu.igris.application.port.in.LoginUseCase;
import br.com.matsu.igris.domain.Response.LoginResponse;
import br.com.matsu.igris.domain.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginUseCase loginUseCase;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return loginUseCase.login(loginRequest);
    }
}
