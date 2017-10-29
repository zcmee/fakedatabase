package pl.fakedatabase.configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SkyNET on 2017-10-29.
 */


//TODO Jebane gowno działa a reszta nie
@RestController
public class TempController {

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String all() {
        return "ANAL";
    }

}
