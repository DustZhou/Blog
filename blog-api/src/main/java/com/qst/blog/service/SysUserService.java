package com.qst.blog.service;

import com.qst.blog.dao.pojo.SysUser;

public interface SysUserService {

    SysUser findUserById(Long id);
}
