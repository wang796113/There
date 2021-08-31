package com.qf.test;

import com.qf.service.FangDongService;
import com.qf.service.impl.FangDongServiceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgencyTest {
    @Test
    public void JDKTest() {
         final FangDongService fangDongService = new FangDongServiceImpl();

        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("fb");
                System.out.println("kf");
                fangDongService.zuFang();

                return null;
            }
        };
        FangDongService proxy = (FangDongService)Proxy.newProxyInstance(AgencyTest.class.getClassLoader(),
                fangDongService.getClass().getInterfaces(), invocationHandler);
        proxy.zuFang();
    }

    @Test
    public void CGlib() {
        final FangDongService fangDongService = new FangDongServiceImpl();
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(FangDongServiceImpl.class);
        enhancer.setCallback(new org.springframework.cglib.proxy.InvocationHandler(){
            public Object invoke(Object object,Method method,Object[] objects)throws Throwable {
                System.out.println("fb1");
                System.out.println("kf1");
                fangDongService.zuFang();
                return null;
            }
        });
        FangDongServiceImpl proxy =(FangDongServiceImpl)enhancer.create();
        proxy.zuFang();
    }
}
