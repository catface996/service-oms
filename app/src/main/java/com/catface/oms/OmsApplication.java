package com.catface.oms;

import com.catface.common.util.EnvUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2020/12/13
 */
@Slf4j
@SpringBootApplication(
				scanBasePackages = {"com.catface"}
)
public class OmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmsApplication.class, args);
		log.info("OmsApplication start success!");
		System.out.println("OmsApplication start success!");
		System.out.println(EnvUtil.getSwaggerUrl());
		System.out.println(EnvUtil.getDocUrl());
	}
}
