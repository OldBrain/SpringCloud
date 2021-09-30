package ru.avbugorov.frontservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class GreetingController {
    private final GreetingClient greetingClient;

    // @FeignClient("eureka-client")
    // public interface GreetingClient {
    //   @GetMapping("/parametrized/{id}")
    //   String parametrized(@PathVariable(value = "id") String id); =>
    // }
    //
    // public class GreetingClientProxy implements GreetingClient {
    //   @LoadBalanced RestTemplate restTemplate;
    //
    // => public String parametrized(@PathVariable(value = "id") String id) {
    //      return restTemplate.getForObject("http://eureka-client/app/demo/data/{" + id + "}", String.class, id);
    //    }
    // }

    @RequestMapping("/get-greeting")
    public String greeting() {
//      System.out.println(greetingClient.getClass().getName());
//      String answer = greetingClient.greeting();
        String answer = greetingClient.parametrized("1000");
        return answer;
    }
}
