package com.huazai.gof.cor;

public abstract class Leader {
    protected String name;
    // 责任链上的下一个处理请求的对象
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleReq(LeaveRequest request);
}
