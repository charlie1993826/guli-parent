package com.charlie.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.charlie.config.AlipayConfig;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private AlipayClient alipayClient;
	
	@RequestMapping("/alipay/callback/return")
	public String alipayCallbackReturn(HttpServletRequest request, Model model) {
		
		return "finish";
	}

	@ResponseBody
	@PostMapping("/alipay")
	public String aliPay(String outTradeNo, BigDecimal totalAmount, HttpServletRequest request, Model model) {
		
		String form = null;
		//封装表单
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		/**
		 * 支付宝订单的回调路径,有同步回调和异步回调
		 */
		alipayRequest.setReturnUrl(AlipayConfig.return_payment_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_payment_url);
		/**
		 * 必要的参数
		 * 订单ID 
		 * 支付宝的产品ID(这个写死就行) 
		 * 订单金额  
		 * 商品订单标题(随意些，就是要购买的东西的名字，可以有多个)
		 */
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("out_trade_no", outTradeNo);
		map.put("product_code", "FAST_INSTANT_TRADE_PAY");
		map.put("total_amount", totalAmount);
		map.put("subject", "华为感光METE30 5G手机");
		
		
		String param = JSON.toJSONString(map);
		alipayRequest.setBizContent(param);
		try {
			/**
			 * 这一步是关键 获得一个支付宝的请求客户端，（他并不是一个连接，而是一个封装好了的http的表单请求）
			 */
			form = alipayClient.pageExecute(alipayRequest).getBody();// 调用SDK生成表单
			System.err.println(form);
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 请求提交到支付宝
		return form;
	}

	@GetMapping("/wxpay")
	public String wxPay() {
		System.out.println("wxpay");
		return null;
	}

	@GetMapping("/index")
	public String index() {

		return "index";
	}
}
