package com.green.Shop.buy.vo;

import lombok.Data;

import java.util.List;

@Data
public class BuyDetailVO {
    private String buyDetailCode;
    private String itemCode;
    private int buyCnt;
    private int buyPrice;
    private String buyCode;
}
