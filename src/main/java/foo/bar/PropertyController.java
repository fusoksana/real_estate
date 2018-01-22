package foo.bar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/proreties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;


  @Autowired
   private PropertyRepository propertyRepository;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Property> getAllProperties() {

        return propertyRepository.findAll();
    }

}