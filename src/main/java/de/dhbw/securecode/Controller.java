package de.dhbw.securecode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @RequestMapping(value = "/{loot}",method = RequestMethod.GET)
    public void getEndpoint(@PathVariable String loot){
        log.debug("Our loot: {}", loot);
    }
}
