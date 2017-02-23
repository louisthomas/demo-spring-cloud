package ca.bellmedia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/team")
public class TeamController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getPing(){
        return "pong-v1";
    }
}
