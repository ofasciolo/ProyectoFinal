package org.onboardMe.controllers;

import com.onboardMe.api.HelloApi;
import com.onboardMe.model.HelloGet200Response;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onboardMe")
public class OnboardMeController implements HelloApi {

    @Override
    public ResponseEntity<HelloGet200Response> helloGet() {
        HelloGet200Response response = new HelloGet200Response();
        response.setMessage("hello");
        System.out.println("this works");
        return ResponseEntity.ok(response);
    }
}
