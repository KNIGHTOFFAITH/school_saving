package com.sg.cloud.service.impl;

import com.sg.cloud.entity.Student;
import com.sg.cloud.mapper.StudentMapper;
import com.sg.cloud.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hao
 * @since 2023-12-29
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
