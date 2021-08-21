package com.example.login.registration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 * RegistrationController
 */
@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;


    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
    
}