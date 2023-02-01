package com.huazai.gof.advanced.responsibility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pyh
 * @date 2020/2/15 17:22
 */
public class FilterChain implements Filter {
    Set<Filter> filters = new HashSet<>();

    @Override
    public String doFilter(String msg) {
        for (Filter filter : filters) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean removeFilter(Filter filter) {
        return filters.remove(filter);
    }

    public void clear() {
        filters.clear();
    }
}
