package com.peait.student.entity.vo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class WorkerInfoVO {
    @NotBlank(message = "修改id不能为空")
    private String id;


    private String workername;

    private String password;

    private String realname;

    private String workeraddress;

    private String workerphone;

    private String workerremarks;



}