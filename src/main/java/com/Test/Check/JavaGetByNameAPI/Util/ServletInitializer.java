package com.Test.Check.JavaGetByNameAPI.Util;

import com.Test.Check.JavaGetByNameAPI.JavaGetByIdApi;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JavaGetByIdApi.class);
	}

}
