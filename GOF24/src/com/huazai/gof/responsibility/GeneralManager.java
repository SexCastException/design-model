package com.huazai.gof.responsibility;

/**
 * 总经理
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleReq(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println(request.getName() + "请假" + request.getLeaveDays() + "天");
            System.out.println(this.name + "总经理审批");
        } else {
            System.out.println(request.getName() + "请假" + request.getLeaveDays() + ",时间太久，请求驳回");
        }
    }
}
