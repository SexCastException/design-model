package com.huazai.gof.cor;

/**
 * 请假请求
 */
public class LeaveRequest {
    // 请假人姓名
    private String name;
    // 请假天数
    private int leaveDays;
    // 请假理由
    private String reason;

    public LeaveRequest() {
    }

    public LeaveRequest(String name, int leaveDays, String reason) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
