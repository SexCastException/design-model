package com.huazai.gof.filter;

import java.util.List;

/**
 * 过滤条件接口
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
