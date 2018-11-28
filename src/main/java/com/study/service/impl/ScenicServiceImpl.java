package com.study.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.Role;
import com.study.model.Scenic;
import com.study.service.ScenicService;
import com.study.service.impl.BaseService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service("scenicService")
public class ScenicServiceImpl extends BaseService<Scenic> implements ScenicService {
    @Override
    public PageInfo<Scenic> selectByPage(Scenic scenic, int start, int length) {
        int page = start/length+1;
        Example example = new Example(Role.class);
        //分页查询
        PageHelper.startPage(page, length);
        List<Scenic> scenicList = selectByExample(example);
        return new PageInfo<>(scenicList);
    }


}
