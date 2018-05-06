package com.services.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.Quote;
@Repository
public interface QuotesRepository extends CrudRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);
}