package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	/*
	DAO 层实现方式及配置（三选一）

	一：	使用类实现 DAO 接口（二选一）：
			1、在启动类中添加对 mapper 包扫描 @MapperScan(" 接口实现类所在的包")（推荐），例：//@MapperScan("com.example.demo.mapper.mapperImpl")
			2、在每个实现类上面添加注解 @Mapper
	二、使用 mapper.xml 文件映射 DAO 接口 （xml 文件中的 id 和 接口中的方法名要一致）：
			在mapper接口上添加 @Mapper 和 @Repository 注解，防止注入失败
			或者在启动类中添加 @MapperScan 扫描mapper接口，并在接口上添加 @Repository
			在 application.properties 文件中添加 mybatis.mapper-locations = "mapper.xml 文件所在的包 + *.xml"，
				例：mybatis.mapper-locations = classpath:mapper/*.xml
			xml 文件中 mapper 的 namespace = "包名 + 接口名"
				例：<mapper namespace="com.example.demo.mapper.UserMapper">
	三、在接口中使用注解方式实现增删改查：
		需要在接口上添加注解 @Mapper
		或者启动类中添加 @MapperScan 对 mapper 接口扫描 例：//@MapperScan("com.example.demo.mapper")
 */


@SpringBootApplication
//@MapperScan("com.example.demo.mapper.mapperImpl")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	/*
        @Bean
        public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
            return (String... args) -> {

                System.out.println("Let's inspect the beans provided by Spring Boot:");

                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                    System.out.println(beanName);
                }

            };
        }
	*/
}
