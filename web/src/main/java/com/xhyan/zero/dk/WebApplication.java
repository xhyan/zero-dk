package com.xhyan.zero.dk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by yanliwei on 2016/12/23.
 */
@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WebApplication.class).web(true).run(args);
	}
}
