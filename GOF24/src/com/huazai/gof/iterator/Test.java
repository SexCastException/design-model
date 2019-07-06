package com.huazai.gof.iterator;

public class Test {
    @org.junit.Test
    public void test() {
        Container nameContainer = new NameContainer();
        Iterator iterator = nameContainer.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "--是否第一个元素" + iterator.isFirst() + "--是否最后一个元素" +
                    iterator.isLast() + "--获取第一个元素" + iterator.first() + "--获取最后一个元素" + iterator.last());
        }
    }
}
