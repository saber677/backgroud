package com.powerhair.backgroundhair.module.console.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {

    @ApiModelProperty(value = "注册账户")
    private String username;

    @ApiModelProperty(value = "注册密码")
    private String password;
}