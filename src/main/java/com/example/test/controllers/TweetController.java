package com.example.test.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.entitise.Tweet;
import com.example.test.services.TweetService;

@Controller
@RequestMapping("")
public class TweetController {
	
	private final TweetService tweetService;
	
	public TweetController(TweetService ts) {
		tweetService = ts;
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Tweet> tweets = tweetService.getAllTweets();
		model.addAttribute("tweets", tweets);
		return "index";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerTweet(@RequestParam("author") String author, @RequestParam("contents") String contents) {
		tweetService.addTweet(author, contents);
		return "redirect:/index";
	}
	
}
