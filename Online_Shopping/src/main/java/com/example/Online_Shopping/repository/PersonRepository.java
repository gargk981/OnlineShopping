package com.example.Online_Shopping.repository;
import com.example.Online_Shopping.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    public Person findByEmail(String email);
    public Person findByPassword(String password);
    public Person findByName(String name);

}

