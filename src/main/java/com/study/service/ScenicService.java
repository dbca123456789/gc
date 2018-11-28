package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.Role;
import com.study.model.Scenic;

public interface ScenicService extends IService<Scenic> {

    PageInfo<Scenic> selectByPage(Scenic scenic, int start, int length);
}
