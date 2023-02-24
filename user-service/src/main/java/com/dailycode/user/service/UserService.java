package com.dailycode.user.service;

import com.dailycode.user.entity.Users;
import com.dailycode.user.repositary.UserRepositary;
import com.dailycode.user.vo.Department;
import com.dailycode.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepositary userRepositary;

    @Autowired
    private RestTemplate restTemplate;

    public Users saveUser(Users user) {
        return userRepositary.save(user);
    }

    public ResponseTemplateVO getUserWithDepartmentByUserId(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Users user = userRepositary.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
