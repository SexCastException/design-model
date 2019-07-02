package com.huazai.gof.composite;

public class Test {
    @org.junit.Test
    public void test() {
        Folder folder = new Folder("回收站");
        AbstractFile f1, f2, f3, f4, f5, f6;
        f1 = new ImageFile("face.jpg");
        f2 = new VideoFile("雄霸天下.mp4");
        f3 = new TextFile("new File.txt");
        f1.killVirus();

        folder.add(f1);
        folder.add(f2);
        folder.add(f3);
        folder.killVirus();

        System.out.println("-------------------------------------");

        f4 = new VideoFile("神雕侠侣.mp4");
        f5 = new ImageFile("view.png");
        f6 = new TextFile("info.txt");
        Folder folder1 = new Folder("我的收藏");
        folder1.add(f4);
        folder1.add(f5);
        folder1.add(f6);
        folder.add(folder1);
        folder.killVirus();
    }
}
