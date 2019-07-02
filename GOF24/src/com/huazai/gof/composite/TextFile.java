package com.huazai.gof.composite;

/**
 * 叶子节点
 */
public class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本：" + name + "文件杀毒");
    }
}
