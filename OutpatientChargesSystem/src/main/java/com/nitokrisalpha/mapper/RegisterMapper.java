package com.nitokrisalpha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nitokrisalpha.entity.RegisterInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper extends BaseMapper<RegisterInfo> {

}
