package com.nitokrisalpha.service;

import com.nitokrisalpha.entity.DeptInfo;
import com.nitokrisalpha.entity.DoctorInfo;
import com.nitokrisalpha.entity.PatientInfo;
import com.nitokrisalpha.entity.RegisterInfo;
import com.nitokrisalpha.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper mapper;

    /**
     * 问题1，挂号的领域模型如何构建？
     * 问题2，哪些信息应该包含在领域模型中？
     * 问题3，
     * @param patient
     * @param doctor
     * @param dept
     * @return
     */
    @Override
    public RegisterInfo addRegister(PatientInfo patient, DoctorInfo doctor, DeptInfo dept) {

        /*
         * 检查是否收费
         */
        /*
         * 校验患者是否存在
         */
        /*
         * 校验患者在今天是否重复挂号
         */

        RegisterInfo registerInfo = new RegisterInfo();
        /*
         * 设置挂号表中的相应信息
         */
        registerInfo.setPatientId(patient.getPatientId());

        /*
         * 写入数据到挂号信息表中
         */
        mapper.insert(registerInfo);

        /*
         * 返回挂号信息
         */
        return registerInfo;
    }
}
