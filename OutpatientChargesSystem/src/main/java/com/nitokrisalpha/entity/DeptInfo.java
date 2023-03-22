package com.nitokrisalpha.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("dept_info")
@Data
public class DeptInfo {
    private Long deptId;
    private String deptName;

}
