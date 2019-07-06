package com.huazai.gof.iterator;

/**
 * 迭代器模式（iterator pattern）：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 优点： 1、它支持以不同的方式遍历一个聚合对象。 2、迭代器简化了聚合类。 3、在同一个聚合上可以有多个遍历。 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 *
 * 缺点：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。
 * @param <E>
 */
public interface Iterator<E> {
    E first();

    E last();

    boolean hasNext();

    E next();

    boolean isFirst();

    boolean isLast();
}
