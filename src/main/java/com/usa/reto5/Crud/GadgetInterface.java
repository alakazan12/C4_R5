
package com.usa.reto5.Crud;

import com.usa.reto5.Modelos.Gadget;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;




public interface GadgetInterface extends MongoRepository<Gadget, Integer> {
    
     public List<Gadget> findByPrice(double gadget);
    
}
