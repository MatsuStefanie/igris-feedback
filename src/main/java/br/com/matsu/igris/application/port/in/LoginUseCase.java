package br.com.matsu.igris.application.port.in;

import br.com.matsu.igris.domain.Response.LoginResponse;
import br.com.matsu.igris.domain.request.LoginRequest;

public interface LoginUseCase {
    LoginResponse login(LoginRequest loginRequest);
}
