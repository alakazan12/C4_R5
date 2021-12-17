
package com.usa.reto5.Crud;

import com.usa.reto5.Modelos.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;




public interface UserInterface extends MongoRepository<User, Integer> {
    
    public Optional<User> findByEmail(String email);
    public Optional<User> findByEmailAndPassword(String email, String password);
    public List<User> findByMonthBirthtDay (String brith);
   

    
}
