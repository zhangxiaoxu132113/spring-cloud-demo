package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Result;

@RestController
@RequestMapping("/api/test")
public class TestController {

	@GetMapping("/tips")
    public Result tips() {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put("time", new Date().toLocaleString());
		System.err.println(map.toString());
		
		return Result.s(map);
	}
}
