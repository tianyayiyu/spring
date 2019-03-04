package com.zlu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * ImportAware       https://blog.csdn.net/zgyjk/article/details/80780165
 */
//@Configuration
//@ComponentScan("com.zlu.dao")
public class DBConfig  implements ImportAware {
	/**
	 * 这个方法能够拿到某个类上的所有注解
	 * @param importMetadata
	 */

	//AnnotationMetadata importMetadata;
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		Set<String> list=importMetadata.getMetaAnnotationTypes("userDao");
	}
}
