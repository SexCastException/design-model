package com.huazai.gof.composite;

/**
 * 组合模式：把部分和整体的用树形的关系来表示，从而使客户端可以使用统一的方式处理部分和整体对象
 * 抽象组件（Component）：定义叶子和容器构建的共同点
 * 叶子（Leaf）：叶子节点
 * 容器（Composite）：有容器特征，可以包含子节点
 * <p>
 * 使用场景：操作系统的资源管理器；GUI的容器层次图；XML文件解析；OA系统中组织结构的处理；Junit单元测试框架，TestCase（叶子），TestUnit（容器），Test接口（抽象）
 */
public interface AbstractFile {
    // 杀毒
    void killVirus();
}
