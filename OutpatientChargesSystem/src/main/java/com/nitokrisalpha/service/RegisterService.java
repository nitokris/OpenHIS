package com.nitokrisalpha.service;

import com.nitokrisalpha.entity.DeptInfo;
import com.nitokrisalpha.entity.DoctorInfo;
import com.nitokrisalpha.entity.PatientInfo;
import com.nitokrisalpha.entity.RegisterInfo;

public interface RegisterService {

    RegisterInfo addRegister(PatientInfo patient, DoctorInfo doctor, DeptInfo dept);
}
