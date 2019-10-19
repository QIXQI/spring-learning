package club.qixqi.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import club.qixqi.spring.entity.Person;

public class SpringTest{
    @Test
    public void test1(){
        // Spring 通过 ApplicationContext 创建 Person 对象放在IoC容器中，创建的对象称作 bean
        // ApplicationContext 容器接口，
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 没有手动创建 Person 的对象，从IoC容器中获取对象
        Person person = context.getBean("person", Person.class);
        System.out.println(person.toString());
    }
}