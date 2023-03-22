package com.nitokrisalpha.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("patient_info")
@Data
public class PatientInfo {

    @TableId(type = IdType.AUTO)
    private Long patientId;

    private String patientName;
    private String patientSex;
    private String patientBirthday;

}

