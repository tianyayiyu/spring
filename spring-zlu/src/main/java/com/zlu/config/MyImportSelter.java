package com.zlu.config;

import com.zlu.dao.UserDao1;
import com.zlu.dao.UserDao2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//MyImportSelter可以添加一个bd 开关闭某些功能 开启对userDao2的支持
public class MyImportSelter implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{UserDao2.class.getName()};
	}
}
