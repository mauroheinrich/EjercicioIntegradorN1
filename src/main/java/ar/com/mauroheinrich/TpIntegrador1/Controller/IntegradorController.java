
package ar.com.mauroheinrich.TpIntegrador1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegradorController {
    @GetMapping("/conversion/{galones}")
    public String galonesALitros(@PathVariable double galones){
        
       double litros = galones*3.78541;
       
       return "La cantidad de litros equivalentes a : " + galones + " galones" 
               +" es de "+ litros + " litros" ;
               
    }
    
}
