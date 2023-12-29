package com.sg.cloud.controller;


import com.sg.cloud.cr.QueryCase;
import com.sg.cloud.entity.CommonResult;
import com.sg.cloud.entity.Safe;
import com.sg.cloud.service.ISafeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hao
 * @since 2023-12-28
 */
@RestController
@RequestMapping("/safe")
@Slf4j
public class SafeController {
    @Resource
    private ISafeService safeService;

    @GetMapping("/hello")
    public String hello(){
        return "hello , this is successful";
    }

//    获取所有安全教育信息
    @GetMapping("/getById/{safeId}")
    public CommonResult getAll(@PathVariable("safeId") Integer safeId){
        log.info("根据id获取安全教育信息");
        return new CommonResult(200,"获取所有安全教育信息成功",safeService.selectBySafeId(safeId));
    }

//    获取所有安全教育信息(分页)
    @GetMapping("/getAll")
    public CommonResult getAll(@RequestParam(value = "pageNum", defaultValue = "0",required = false) Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "3",required = false) Integer pageSize){
        log.info("获取所有安全教育信息");
        log.info("pageNum:"+pageNum);
        return new CommonResult(200,"获取所有安全教育信息成功",safeService.getAll(pageNum,pageSize));
    }

//    添加安全教育信息
    @PostMapping("/add")
    public CommonResult add(@RequestBody Safe safe){
        safe.setSafeCreatetime(new Date());
        log.info("添加安全教育信息");
        return new CommonResult(200,"添加安全教育信息成功",safeService.save(safe));
    }

//    删除安全教育信息根据id
    @DeleteMapping("/delete/{safeId}")
    public CommonResult delete(@PathVariable("safeId") Integer safeId){
        log.info("根据id删除安全教育信息");
        return new CommonResult(200,"删除安全教育信息成功",safeService.removeById(safeId));
    }

    @PatchMapping("/update")
    public CommonResult update(@RequestBody Safe safe){
        safe.setSafeCreatetime(new Date());
        log.info("根据id更新安全教育信息");
        return new CommonResult(200,"更新安全教育信息成功",safeService.updateById(safe));
    }
//   根据条件进行查询
    @GetMapping("/getByCase")
    public CommonResult getByCase(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize",required = false,defaultValue = "3") Integer pageSize,
                                  @RequestBody QueryCase queryCase){
        return new CommonResult(200,"根据条件查询成功",safeService.getByCase(pageNum,pageSize,queryCase));
    }
}
