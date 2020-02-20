package com.huazai.gof.advanced.cor.proxy.one;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author pyh
 * @date 2020/2/19 18:21
 */
public class Proxy {
    public static Object newProxyInstance() throws Exception {
        String s = "package com.huazai.gof.advanced.cor.proxy.one;\n" +
                "public class LogTank$Proxy implements Moveable {\n" +
                "    private Moveable proxy;\n" +
                "\n" +
                "    public LogTank$Proxy(Moveable proxy) {\n" +
                "        this.proxy = proxy;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void move() {\n" +
                "        System.out.println(\"proxy log：start\");\n" +
                "        proxy.move();\n" +
                "        System.out.println(\"proxy log：end\");\n" +
                "    }\n" +
                "}";
        String fileName = System.getProperty("user.dir") + "\\src\\com\\huazai\\gof\\advanced\\cor\\proxy\\one\\LogTank$Proxy.java";
        FileWriter fw = new FileWriter(fileName);
        fw.write(s);
        fw.flush();
        fw.close();

        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = systemJavaCompiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask task = systemJavaCompiler.getTask(null, fileManager, null, null, null, compilationUnits);
        task.call();
        fileManager.close();

        URL[] urls = {new URL("file:/" + "G:\\githubWorkspace\\design-pattern\\GOF-advanced\\src")};
        URLClassLoader urlClassLoader = URLClassLoader.newInstance(urls);
        Class<?> aClass = urlClassLoader.loadClass("com.huazai.gof.advanced.cor.proxy.one.LogTank$Proxy");
        System.out.println(aClass);

        System.out.println(Thread.currentThread().getContextClassLoader().loadClass("com.huazai.gof.advanced.cor.proxy.one.LogTank$Proxy"));
        System.out.println(Class.forName("com.huazai.gof.advanced.cor.proxy.one.LogTank$Proxy"));
        Constructor<?> constructor = aClass.getConstructor(Moveable.class);
        Moveable o = (Moveable) constructor.newInstance(new Tank());
//        o.move();
        return o;
    }
}
