package com.huazai.gof.advanced.cor;

/**
 * HTML tags Filter
 *
 * @author pyh
 * @date 2020/2/15 17:18
 */
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replaceAll("<", "【").replaceAll(">", "】");
    }
}
