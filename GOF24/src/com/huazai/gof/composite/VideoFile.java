package com.huazai.gof.composite;

/**
 * 叶子节点
 */
public class VideoFile implements AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频：" + name + "文件杀毒");
    }
}
