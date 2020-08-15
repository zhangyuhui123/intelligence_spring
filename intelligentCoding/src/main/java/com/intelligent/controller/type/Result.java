package com.intelligent.controller.type;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
//@ApiModel("Result")
public class Result<T> {
//    @ApiModelProperty(value = "success")
    private boolean success;
//    @ApiModelProperty(value = "message")
    private String message;
//    @ApiModelProperty(value = "code")
    private Integer code;
//    @ApiModelProperty(value = "data")
    private List<T> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
