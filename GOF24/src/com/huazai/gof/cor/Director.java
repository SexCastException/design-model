package com.huazai.gof.cor;

/**
 * 主任
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleReq(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println(request.getName() + "请假" + request.getLeaveDays() + "天");
            System.out.println(this.name + "主任审批");
        } else {
            if (nextLeader != null) {
                nextLeader.handleReq(request);
            }
        }
    }
}
