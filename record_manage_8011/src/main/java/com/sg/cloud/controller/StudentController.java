package com.sg.cloud.controller;


import com.sg.cloud.entity.CommonResult;
import com.sg.cloud.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hao
 * @since 2023-12-29
 */
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Resource
    private IStudentService studentService;
    @GetMapping("/getById/{stuId}")
//    根据学生id查询学生信息
    public CommonResult selectByStudentId(@PathVariable Integer stuId){
        log.info("查询学生信息根据学生id");
        return new CommonResult(200,"查询成功",studentService.getById(stuId));
    }
}
