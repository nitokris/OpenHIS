package com.nitokrisalpha.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("register_info")
@Data
public class RegisterInfo {

    @TableId(type = IdType.AUTO)
    private Long registerId; // 挂号唯一标识，门诊号
    private Long patientId;// 患者在系统中的唯一标识
    private String patientName;//患者姓名
    private String registerDateTime;// 挂号时间
    private Long doctorId;// 挂号医生的唯一标识
    private String doctorName;// 挂号的医生名称
    private Long deptId;// 患者挂号科室唯一标识
    private String deptName;// 挂号科室名称

}
