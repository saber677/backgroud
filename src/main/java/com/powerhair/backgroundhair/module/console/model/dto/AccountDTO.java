package com.powerhair.backgroundhair.module.console.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(value = "登陆、添加账号需要的参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    @ApiModelProperty(value = "注册账户")
    private String username;

    @ApiModelProperty(value = "注册密码")
    private String password;

    @ApiModelProperty(value = "账号权限")
    private Integer auth;

    @ApiModelProperty(value = "描述信息")
    private String description;
}
