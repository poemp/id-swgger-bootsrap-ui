package org.poem.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author poem
 */
@RestController
@RequestMapping(value = "/v1/index")
@Api(value = "/v1/index", tags = {"01-首页"})
public class IndexController {

    /**
     * 测试
     * @param path 路径
     * @return 路径
     */
    @ResponseBody
    @ApiOperation(value = "获取测试", notes = "获取", httpMethod = "GET")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(String path){
        return "IndexController_" + path;
    }
}
