package com.welab.k8s_backend_alim.api.open;

import com.welab.k8s_backend_alim.common.dto.ApiResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequestMapping(value = "/backend/alim/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class BackendAlimController {
    @GetMapping(value = "/hello")
    public ApiResponseDto<String> hello(){
        return ApiResponseDto.createOk("알림 백엔드 호출 됨");
    }
}
