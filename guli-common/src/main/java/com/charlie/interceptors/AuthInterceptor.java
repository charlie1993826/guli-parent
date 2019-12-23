package com.charlie.interceptors;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.charlie.annotation.CheckoutLogin;

@Component
public class AuthInterceptor implements HandlerInterceptor {

	private final Logger log = LoggerFactory.getLogger(AuthInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		log.info("----------------拦截器生效----------------");
		if(handler instanceof HandlerMethod) {
			/**
			 * 获取拦截的方法
			 */
			Method method = ((HandlerMethod) handler).getMethod();
			/**
			 * 判断该方法	/类是否被@CheckoutLogin注解修饰
			 */
			if(AnnotatedElementUtils.isAnnotated(method, CheckoutLogin.class)) {
				
				CheckoutLogin checkoutLogin = method.getAnnotation(CheckoutLogin.class);
				/**
				 * 如果一个方法里面没有这个注解的话，那么就不用拦截
				 */
				if(checkoutLogin == null) return true;
				/**
				 * 如果这个方法里面有这个注解的话，那么进行拦截，如果里面这个属性方法的值是true的话，那么就要做相应的处理
				 */
				if(checkoutLogin.loginfiter() == true) {
					log.info(((HandlerMethod) handler).getBeanType() 
							+ "这个类中的这个：" + method.getName() + "方法已经被拦截，准备跳转到失败页面");
				}
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}
}
