package spring.core.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class PersonAOPService implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) {
		System.out.println("Before Method Call Advice");
	}

}
