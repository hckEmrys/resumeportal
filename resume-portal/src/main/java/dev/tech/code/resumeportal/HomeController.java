package dev.tech.code.resumeportal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "hello";
    }

    @GetMapping("/edit")
    public String edit()
    {
        return "webpage";
    }

    @GetMapping("/view")
    public String getView()
    {
        return "Its a view";
    }
}
