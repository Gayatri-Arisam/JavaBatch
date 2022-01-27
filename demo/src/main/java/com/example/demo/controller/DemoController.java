package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class DemoController {
	
	static List<String>list =new ArrayList<String>();
	public DemoController() {
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
	}
	
	
	@GetMapping("/Test")
	public List<String> Test()
	{
		return list;
	}
	@GetMapping("/Test/{id}")
	public String Test(@PathVariable int id)
	{
		return list.get(id);
	}
	@PostMapping("/Test")
	public String Test(@RequestBody String S)
	{
		list.add(S);
		return "1 string added";
	}
	@PutMapping("/Test/{id}")
	public String Test(@RequestBody String S,@PathVariable int id)
	{
		list.set(id, S);
		return "1 string modified";
	}
	@DeleteMapping("/Test/{id}")
	public String Test1(@PathVariable int id)
	{
		list.remove(id);
		return "1 string deleted";
	}
	
}
