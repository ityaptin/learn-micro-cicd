package io.ityaptin.learn.echo.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("call")
@RequiredArgsConstructor
public class UserController {
    private final EchoClient echoClient;

    @GetMapping()
    public String callEcho(@RequestParam("call") String call) {
        return echoClient.call(call);
    }
}
