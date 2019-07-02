package com.huazai.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    //
    List<AbstractFile> fileList = new ArrayList<>();

    @Override
    public void killVirus() {
        System.out.println("文件夹：" + name + "查杀");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile get(int index) {
        return fileList.get(index);
    }
}
