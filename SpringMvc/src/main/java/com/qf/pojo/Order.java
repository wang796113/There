package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhaojian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private String id;
    private String name;
    private Integer uid;
    private Integer pid;
    private List<Product> productList;


}
