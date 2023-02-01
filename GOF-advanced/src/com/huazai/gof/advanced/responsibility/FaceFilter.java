package com.huazai.gof.advanced.responsibility;

/**
 * 表情过滤器
 * @author pyh
 * @date 2020/2/15 17:19
 */
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replaceAll(":\\)", "^V^");
    }
}
