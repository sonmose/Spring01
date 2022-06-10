package com.gura.spring01.fortune.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// @Controller -> extends , implements 느낌.
// controller 추가하면 서버를 껐다 켜야한다.
@Controller
public class FortuneController {
   
   @RequestMapping("/fortune/show")
   public String Show(HttpServletRequest request) {
      //오늘의 운세를 얻어오는 비즈니스 로직을 수행했다고 가정하자.
      String fortuneToday="내일부터 4일동안 git을 공부할 거에요";
      //view page 에서 필요한 모델(데이터)를 담는다.
      request.setAttribute("fortuneToday", fortuneToday);
      // /WEB_INF/views/fortune/show.jsp 페이지로 (view page) forward 이동해서 응답.
      return "fortune/show";
   }
   @RequestMapping("/fortune/show2")
   public ModelAndView Show2(ModelAndView mView) {
      //오늘의 운세를 얻어오는 비즈니스 로직을 수행했다고 가정하자.
      String fortuneToday="내일부터 4일동안 git을 공부할 거에요";
      mView.addObject("fortuneToday", fortuneToday);
      mView.setViewName("fortune/show");
      return mView;
      
   }
}