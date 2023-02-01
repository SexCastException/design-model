package com.huazai.gof.advanced.responsibility.web;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pyh
 * @date 2020/2/17 18:21
 */
public class FilterChain implements Filter {
    private int index = 0;
    private List<Filter> filters = new ArrayList<>();

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index++);
        filter.doFilter(request, response, filterChain);
    }

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }
}
