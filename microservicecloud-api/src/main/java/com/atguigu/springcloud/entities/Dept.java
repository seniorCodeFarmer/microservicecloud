package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhangchengwei
 * @create 2022-09-11 15:39
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptNo;

    private String dName;

    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
