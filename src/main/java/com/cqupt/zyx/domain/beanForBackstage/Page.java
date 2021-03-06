package com.cqupt.zyx.domain.beanForBackstage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
@JsonIgnoreProperties({"pageNumber","filter"})
public class Page<T> {
    // 总条数
    private int totalNumber;
    // 当前页数
    private int currentPage;
    // 总页数
    private int totalPage;
    // 每页显示条数
    private int pageNumber = 8;
    //数据存放
    List<T> data;
    //过滤条件
    Map<String,Object> filter;

    public Map<String, Object> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, Object> filter) {
        this.filter = filter;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {

        int totalPage = totalNumber % pageNumber != 0 ? totalNumber/pageNumber+1 : totalNumber/pageNumber;
        this.setTotalPage(totalPage);
        this.totalNumber = totalNumber;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
