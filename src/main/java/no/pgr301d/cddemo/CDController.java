package no.pgr301d.cddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CDController {

    @GetMapping(path = "/")
    public String hello() {
        return "Hello Glenn, looking good today ;) <br/> DevOps is really fun!!!";
    }

}