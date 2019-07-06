package com.huazai.gof.iterator;

public class NameContainer implements Container {
    public String[] names = {"JAVA", "MYSQL", "ORACLE", "C++", "PYTHON", "PHP", "HTML"};

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator<String> {

        // 游标
        int cursor = -1;

        @Override
        public String first() {
            return names[0];
        }

        @Override
        public String last() {
            return names[names.length - 1];
        }

        @Override
        public boolean hasNext() {
            return cursor < names.length - 1;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return names[++cursor];
            }
            return null;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == (names.length - 1);
        }
    }
}
