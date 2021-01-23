package co.edu.udea.microserviciosudearegistration.Api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value = "/contact")
    public Contact persona(){
        return new Contact(5L, "Luis", "Rendón", "+573135116662", "luisRendon@udea.edu.co");
    }
}
