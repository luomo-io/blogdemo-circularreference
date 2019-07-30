package io.luomo.blogdemo.circularreference.bean;

import org.springframework.stereotype.Component;

/**
 * Created on Jun 26, 2019.
 *
 * @author hatakawas
 */
@Component
public class BeanOne {
    private final BeanTwo beanTwo;

    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void sayHi() {
        String message = String.format("Hi, this is %s.", this);
        System.out.println(message);
    }

    public void talk() {
        beanTwo.sayHi();
        String reply = String.format("Hello, %s, glad to see you.", beanTwo);
        System.out.println(reply);
    }

    @Override
    public String toString() {
        return "beanOne";
    }
}