package com.huazai.gof.cor;

/**
 * 经理
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleReq(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println(request.getName() + "请假" + request.getLeaveDays() + "天");
            System.out.println(this.name + "经理审批");
        } else {
            if (nextLeader != null) {
                nextLeader.handleReq(request);
            }
        }
    }
}
