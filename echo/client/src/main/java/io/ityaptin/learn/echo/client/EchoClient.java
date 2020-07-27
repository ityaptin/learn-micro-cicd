package io.ityaptin.learn.echo.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "echo-server", path = "echo")
public interface EchoClient {
    @GetMapping()
    String call(@RequestParam("req") String req);
}
