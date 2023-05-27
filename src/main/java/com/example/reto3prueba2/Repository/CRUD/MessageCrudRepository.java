package com.example.reto3prueba2.Repository.CRUD;

import com.example.reto3prueba2.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
