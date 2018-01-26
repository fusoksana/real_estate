package foo.bar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/proreties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;


  @Autowired
   private PropertyRepository propertyRepository;
@RequestMapping(value = "{id}",method = RequestMethod.GET)
@ResponseBody
public  Property getPropertyByID( @PathVariable("id")int id){


   Long l=new Long(id);
   return propertyRepository.findOne(l);




}

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Property> getAllProperties() {

        return propertyRepository.findAll();
    }

}