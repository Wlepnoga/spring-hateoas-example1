package hello;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class  PrgController {

    @RequestMapping("/prg")
    @ResponseBody
    public HttpEntity<Prg> prg(
            @RequestParam(value = "name", required = false, defaultValue = "John") String name,
            @RequestParam(value = "age", required = false, defaultValue = "49") String age) {

        Prg prg = new Prg(name, age);

        // prg.add(linkTo(methodOn(PrgController.class).prg(name)).withSelfRel());
        return new ResponseEntity<Prg>(prg, HttpStatus.OK);
    }
}
