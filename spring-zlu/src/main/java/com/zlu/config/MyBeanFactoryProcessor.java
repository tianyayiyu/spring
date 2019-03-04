package com.zlu.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 插手spring的实例化 spring的扩展点之一
 * 也可以去实现BeanDefinitionRegistryPostProcessor（扩展点），因为他实现了BeanFactoryPostProcessor
 */
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition aa = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("userDao");
			aa.setScope("propotype");

	}
}
