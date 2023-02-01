package com.huazai.gof.advanced.responsibility;

/**
 * @author pyh
 * @date 2020/2/15 17:27
 */
public class MsgProcessor {
    private FilterChain fc = new FilterChain();

    private String msg = Msg.msg;

    public String doFilter() {
        return fc.doFilter(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setFc(FilterChain fc) {
        this.fc = fc;
    }

    public FilterChain getFc() {
        return fc;
    }

    public void clear() {
        fc.clear();
    }
}
