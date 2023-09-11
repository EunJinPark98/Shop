package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;

import java.util.List;

public interface CartService {
    //장바구니 상품 등록
    public int insertCart(CartVO cartVO);

    //장바구니 목록 조회
    public List<CartVO> selectCartList(String memeberId);
}
