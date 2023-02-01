package com.huazai.gof.advanced.responsibility.web;

/**
 * @author pyh
 * @date 2020/2/17 18:36
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好:)，<script></script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
        Request request = new Request();
        request.requestStr = msg;
        Response response = new Response();
        response.responseStr = "response：";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.requestStr);
        System.out.println(response.responseStr);
    }
}
