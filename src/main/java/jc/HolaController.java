package jc;


import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaController {
    // Por defecto mapea a todos los tipos de request posibles: get, post, delete, etc...
    @RequestMapping("/hola" /*, method= RequestMethod.GET*/)
    public String sayHello() {
        return "<html><body><b>HOLA</b> </em>MUNDO!</em></body></html>";
    }
}
