package com.pojo;

public class PageBean {
    //1.分页四大参数
    private int currPage = 1;//当前页
    private int size = 3;//每页记录数
    private int count;//总记录数
    private int totalPage;//总的页数

    //2.查询的条件参数--所有参数都是String类型
    private Integer status1;

    public Integer getStatus1() {
        return status1;
    }

    public void setStatus1(Integer status1) {
        this.status1 = status1;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
