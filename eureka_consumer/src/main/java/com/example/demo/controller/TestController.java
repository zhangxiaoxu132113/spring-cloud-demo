package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/test")
@Api(value="测试相关接口")
public class TestController {

	@Autowired
	RestTemplate restTemplate;

	@Value("${server.request.url}")
	private String SERVER_URL;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@LoadBalanced
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	@SuppressWarnings("rawtypes")
	@LoadBalanced
	@GetMapping("/tips")
	@ApiOperation(value = "访问服务器接口", notes = "负载均衡，访问服务器接口")
	@ApiParam
	public Result visitServer() {
		Map rt = restTemplate.getForObject(SERVER_URL, Map.class);
		logger.info("rt:{}", rt.toString());
		Result result = new Result(rt.get("code").toString(), rt.get("msg").toString(), rt.get("data"));
		return result;
	}

	@SuppressWarnings("deprecation")
	@ApiOperation(value = "测试数据接口", notes = "获取测试数据接口")
	@ApiParam(name = "name", value = "名字")
	@GetMapping("/data")
	public Result data(String name) {
		Map<String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put("time", new Date().toLocaleString());
		map.put("from", "consumer");
		logger.info("map:{}", map.toString());
		return Result.s(map);
	}
}
