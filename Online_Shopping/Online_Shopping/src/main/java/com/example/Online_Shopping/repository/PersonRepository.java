package com.example.Online_Shopping.repository;
import com.example.Online_Shopping.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    public Person findByEmail(String email);
}

