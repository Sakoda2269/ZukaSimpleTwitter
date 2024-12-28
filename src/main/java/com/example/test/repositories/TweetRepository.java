package com.example.test.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entitise.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, String>{
	
	Optional<Tweet> findByTid(String tid);
	
}
