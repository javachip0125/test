package com.ohgiraffers.section01.exception;

public class ExceptionTest {

  public void checkEnoughMoney(int price, int money) throws Exception { //예외처리 강제위임

    System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

    if (money >= price) {
      System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
    } else {
      throw new Exception();
    }

    System.out.println("즐거운 쇼핑 하세요🛒");
  }
}
