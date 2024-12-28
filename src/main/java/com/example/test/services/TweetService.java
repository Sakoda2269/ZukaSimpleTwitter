package com.example.test.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.test.entitise.Tweet;
import com.example.test.repositories.TweetRepository;

@Service
public class TweetService {
	
	private final TweetRepository tweetRepo;
	
	public TweetService(TweetRepository tr) {
		tweetRepo = tr;
	}
	
	public List<Tweet> getAllTweets() {
		return tweetRepo.findAll();
	}
	
	public String addTweet(String author, String contents) {
		String uuid = UUID.randomUUID().toString();
		Tweet tweet = new Tweet();
		tweet.setTid(uuid);
		tweet.setAuthor(author);
		tweet.setContents(contents);
		tweetRepo.save(tweet);
		return uuid;
	}
	
}
