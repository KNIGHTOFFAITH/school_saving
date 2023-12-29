package com.sg.cloud.controller;


import com.sg.cloud.entity.CommonResult;
import com.sg.cloud.service.ITbScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/score")
@Slf4j
public class TbScoreController {
    @Resource
    private ITbScoreService scoreService;
    //    根据id拿到学生成绩
    @GetMapping("/getScore/{stuId}")
    public CommonResult selectByStudentIdScore(@PathVariable Integer stuId){
        log.info("查询学生信息根据学生id");
        return new CommonResult(200,"查询成功",scoreService.getScoreByStudentId(stuId));
    }
}
