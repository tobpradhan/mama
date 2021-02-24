package za.co.data.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.data.DataModel;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class DataController {

    @RequestMapping(value= "/save/record", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveRecord(@RequestBody DataModel model) {
        System.out.println(model.getModel());
        return true;
    }
}
