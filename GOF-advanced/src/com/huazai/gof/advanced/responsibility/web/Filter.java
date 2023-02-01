package com.huazai.gof.advanced.responsibility.web;

/**
 * @author pyh
 * @date 2020/2/17 18:20
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
