package com.simon.pattern.proxy.dynamic;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author simon
 * @date 2020/11/19 22:48
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始");
                Object invoke = method.invoke(target, args);
                System.out.println("动态代理结束");
                return invoke;
            }
        });
    }

}
