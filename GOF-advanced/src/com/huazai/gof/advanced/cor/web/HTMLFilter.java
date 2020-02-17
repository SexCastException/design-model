package com.huazai.gof.advanced.cor.web;

/**
 * @author pyh
 * @date 2020/2/17 18:28
 */
public class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replaceAll("<", "【").replaceAll(">","】") + "----HTMLFilter";
        filterChain.doFilter(request, response, filterChain);
        response.responseStr += "----HTMLFilter";
    }
}
