package com.service;

import com.pojo.PageBean;
import com.pojo.Projectdb;

import java.util.List;

public interface ProService {
    List<Projectdb> selectPageAndLike(PageBean page);

    int addPro(Projectdb pro);


    Projectdb selectOne(Integer id);


    int update(Projectdb projectdb);
}
