package com.huazai.gof.advanced.responsibility;

/**
 * @author pyh
 * @date 2020/2/15 17:16
 */
public class Main {
    public static void main(String[] args) {
        MsgProcessor msgProcessor = new MsgProcessor();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new FaceFilter());
        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new SensitiveFilter());
        filterChain.addFilter(filterChain1);
        msgProcessor.setFc(filterChain);

        String s = msgProcessor.doFilter();
        System.out.println(s);
    }
}
