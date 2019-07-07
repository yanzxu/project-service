package com.microservice.project.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${services.user-service.name}", url = "${services.user-service.url}")
public interface UserClient {
    @RequestMapping(path = "/users", method = RequestMethod.GET)
    String listUsers();
}
