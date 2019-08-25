package com.service.impl;

import com.mapper.ProMapper;
import com.mapper.ProjectdbMapper;
import com.pojo.PageBean;
import com.pojo.Projectdb;
import com.pojo.ProjectdbExample;
import com.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProServiceImpl  implements ProService {
    @Autowired
    private ProjectdbMapper mapper;
    @Autowired
    private ProMapper proMapper;
    @Override
    public List<Projectdb> selectPageAndLike(PageBean page) {
        ProjectdbExample e = new ProjectdbExample();
        ProjectdbExample.Criteria c=e.createCriteria();
        if(page.getStatus1()!=null){
            c.andStatusEqualTo(page.getStatus1());
        }
        int size = page.getSize();
        //2.查询满足条件的总记录数
        int count = (int) mapper.countByExample(e);
        //根据总记录数算出总页数
        int totalPage=(count%size==0)?(count/size):(count/size+1);
        //总记录数和总页数存进page中
        page.setCount(count);
        page.setTotalPage(totalPage);
        //3.分页
        int startRow=(page.getCurrPage()-1)*size;
        e.limit(startRow,size);
        List<Projectdb> pro = mapper.selectByExample(e);
        for(Projectdb proj:pro){
            proj.setPro(proMapper.selectByPrimaryKey(proj.getStatus()));
        }
        return pro;
    }

    @Override
    public int addPro(Projectdb pro) {
        return mapper.insertSelective(pro);
    }

    @Override
    public Projectdb selectOne(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Projectdb projectdb) {
        return mapper.updateByPrimaryKeySelective(projectdb);
    }


}
