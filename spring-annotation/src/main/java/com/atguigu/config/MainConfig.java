package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.atguigu.bean.Person;

//ÅäÖÃÀà==ÅäÖÃÎÄ¼þ
@Configuration  //¸æËßSpringÕâÊÇÒ»¸öÅäÖÃÀà

@ComponentScans(
		value = {
				@ComponentScan(value="com.atguigu",includeFilters = {
/*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)	
		}
		)
//@ComponentScan  value:Ö¸¶¨ÒªÉ¨ÃèµÄ°ü
//excludeFilters = Filter[] £ºÖ¸¶¨É¨ÃèµÄÊ±ºò°´ÕÕÊ²Ã´¹æÔòÅÅ³ýÄÇÐ©×é¼þ
//includeFilters = Filter[] £ºÖ¸¶¨É¨ÃèµÄÊ±ºòÖ»ÐèÒª°üº¬ÄÄÐ©×é¼þ
//FilterType.ANNOTATION£º°´ÕÕ×¢½â
//FilterType.ASSIGNABLE_TYPE£º°´ÕÕ¸ø¶¨µÄÀàÐÍ£»
//FilterType.ASPECTJ£ºÊ¹ÓÃASPECTJ±í´ïÊ½
//FilterType.REGEX£ºÊ¹ÓÃÕýÔòÖ¸¶¨
//FilterType.CUSTOM£ºÊ¹ÓÃ×Ô¶¨Òå¹æÔò
public class MainConfig {
	
	//¸øÈÝÆ÷ÖÐ×¢²áÒ»¸öBean;ÀàÐÍÎª·µ»ØÖµµÄÀàÐÍ£¬idÄ¬ÈÏÊÇÓÃ·½·¨Ãû×÷Îªid
	@Bean("person")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
