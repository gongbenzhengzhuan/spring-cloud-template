package com.wenge.tilake.template.controller;

import com.wenge.tilake.template.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "template-Api", tags = "template-Api",description="Hive的类型名称，库名称，以及表名称务必要存在且对应。")
@RequestMapping("/template/api/v1")
public class TemplateController {

    /**
     * 获取Hive指定类型指定库下的所有表的基本信息
     * @return
     */
    @GetMapping("/getTableBasicInfo")
    @ApiOperation("获取Hive指定类型指定库下的所有表的基本信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "typeName",value = "Hive的类型名称(非必填，默认为hive_db)",required = false,dataTypeClass = String.class,paramType = "query"),
            @ApiImplicitParam(name = "DbName",value = "数据库名称(非必填，默认为weather_data)",required = false,dataTypeClass = String.class,paramType = "query")
    })
    public Result getTableBasicInfo(@RequestParam(value = "typeName",required = false,defaultValue = "hive_db") String typeName,
                                    @RequestParam(value = "DbName",required = false,defaultValue = "weather_data")String DbName) {
        System.out.println("template");
        return Result.success("template");
    }

}

