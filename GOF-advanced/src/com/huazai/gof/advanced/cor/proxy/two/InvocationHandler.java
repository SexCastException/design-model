package com.huazai.gof.advanced.cor.proxy.two;

import java.lang.reflect.Method;

/**
 * @author pyh
 * @date 2020/2/20 18:34
 */
public interface InvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Exception;
}
