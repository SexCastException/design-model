package com.huazai.gof.advanced.responsibility;

/**
 * 敏感关键字过滤器
 *
 * @author pyh
 * @date 2020/2/15 17:21
 */
public class SensitiveFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replaceAll("被就业", "就业").replaceAll("敏感", "**");
    }
}
