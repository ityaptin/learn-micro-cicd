package io.ityaptin.learn.echo.server;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.text.MessageFormat;

@RestController
@RequestMapping("echo")
@Validated
public class EchoController {
    @GetMapping
    public String call(@NotNull @RequestParam("req") String req) {
        return MessageFormat.format("{0}... {0}... {0}...", req);
    }
}
