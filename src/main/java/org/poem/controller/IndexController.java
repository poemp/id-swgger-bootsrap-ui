package org.poem.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value =  "/v1/index")
@Api(value = "/v1/index", tags =  "001-测试" )
public class IndexController {



    @ResponseBody
    @RequestMapping(value = "/test")
    @ApiOperation(value = "分页查询数据源信息", notes = "")
    public String test(String path){
        return "IndexController_" + path;
    }
}
