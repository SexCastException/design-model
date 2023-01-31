package com.huazai.gof.memo.advanced;

/**
 * 游戏角色类
 */
public class PlayRole {
    /**
     * 生命力
     */
    private int vitality;
    /**
     * 攻击力
     */
    private int aggressivity;
    /**
     * 防御力
     */
    private int defencivity;

    public PlayRole(int vitality, int aggressivity, int defencivity) {
        super();
        this.vitality = vitality;
        this.aggressivity = aggressivity;
        this.defencivity = defencivity;
    }

    public PlayRole() {
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

    public int getDefencivity() {
        return defencivity;
    }

    public void setDefencivity(int defencivity) {
        this.defencivity = defencivity;
    }

    /**
     * 调用此方法可以保存自身当前状态数据
     *
     * @return
     */
    public RoleMemento createMemento() {
        RoleMemento memento = new RoleMemento();
        memento.setAggressivity(aggressivity);
        memento.setDefencivity(defencivity);
        memento.setVitality(vitality);
        return memento;
    }

    /**
     * 通过备忘录对象可以让自身恢复到指定状态
     *
     * @param memento
     */
    public void setMemento(RoleMemento memento) {
        this.aggressivity = memento.getAggressivity();
        this.defencivity = memento.getDefencivity();
        this.vitality = memento.getVitality();
    }

    public void showState() {
        System.out.println("攻击力：" + this.aggressivity + "|防御力：" + this.defencivity + "|生命力：" + this.vitality);
    }
}
