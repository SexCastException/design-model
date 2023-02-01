package com.huazai.gof.advanced.proxy.two;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author pyh
 * @date 2020/2/20 18:33
 */
public class Proxy {
    private static final String proxyName = "Generate$Proxy";

    public static Object newProxyInstance(Class interfaceClass, InvocationHandler invocationHandler) throws Exception {
//        Objects.requireNonNull(invocationHandler, "invocationHandler requires not null.");

        String methodStr = "";
        Method[] methods = interfaceClass.getMethods();
        for (Method method : methods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            methodStr += "    @Override\n" +
                    "    public " + method.getReturnType() + " " + method.getName() + "()  throws Exception {\n" +
                    "        Method method = " + interfaceClass.getName() + ".class.getMethod(\"" + method.getName() + "\");\n" +
                    "        proxy.invoke(this, method, null);\n" +
                    "    }\n\n";
            System.out.println(methodStr);
        }
        String interfaceQualifiedName = interfaceClass.getName().replace("interface", "");
        String invokeQualifiedName = InvocationHandler.class.getName().replace("interface", "");
        String s = "package com.huazai.gof.advanced.cor.proxy.two;\n" +
                "import java.lang.reflect.Method;\n" +
                "public class " + proxyName + " implements " + interfaceQualifiedName + " {\n" +
                "    private " + invokeQualifiedName + " proxy;\n" +
                "\n" +
                "    public " + proxyName + "(" + invokeQualifiedName + " proxy) {\n" +
                "        this.proxy = proxy;\n" +
                "    }\n" +
                "\n" + methodStr +
                "}";

        String fileName = System.getProperty("user.dir") + "\\src\\com\\huazai\\gof\\advanced\\cor\\proxy\\two\\" + proxyName + ".java";
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
        Class<?> aClass = urlClassLoader.loadClass("com.huazai.gof.advanced.cor.proxy.two." + proxyName);
        Constructor<?> constructor = aClass.getConstructor(InvocationHandler.class);
        return constructor.newInstance(invocationHandler);
    }
}
