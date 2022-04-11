package com.eomcs.app3;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/hello3")
public class Hello2Filter implements Filter{

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("Filter2.init() 호출");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    System.out.println("Filter2.doFilter() 호출");

    HttpServletRequest httpRequest = (HttpServletRequest) request;
    System.out.println(httpRequest.getServletPath());

    // 다음 필터 실행. 없으면 서블릿 실행.
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
    System.out.println("Filter2.destroy() 호출");
  }


}
