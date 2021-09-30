package ru.avbugorov.frontservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("eureka-client")
public interface GreetingClient {
    @GetMapping("/greeting")
    String greeting();

    @GetMapping("/parametrized/{id}")
    String parametrized(@PathVariable(value = "id") String id);
}
