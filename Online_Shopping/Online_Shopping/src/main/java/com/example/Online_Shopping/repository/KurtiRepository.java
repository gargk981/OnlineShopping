package com.example.Online_Shopping.repository;
import com.example.Online_Shopping.models.Kurti;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KurtiRepository extends MongoRepository<Kurti,String> {
}
