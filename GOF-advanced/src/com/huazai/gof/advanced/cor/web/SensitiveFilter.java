package com.huazai.gof.advanced.cor.web;

/**
 * @author pyh
 * @date 2020/2/17 18:30
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replaceAll("敏感", "**")
                .replaceAll("被就业", "就业") + "----SensitiveFilter";
        filterChain.doFilter(request, response, filterChain);
        response.responseStr += "----SensitiveFilter";
    }
}
