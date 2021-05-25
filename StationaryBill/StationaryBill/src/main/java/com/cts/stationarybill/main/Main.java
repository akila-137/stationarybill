package com.cts.stationarybill.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.stationarybill.service.CartService;
import com.cts.stationarybill.skeletonvalidator.SkeletonValidator;
import com.cts.stationarybill.vo.MyCart;
import com.cts.stationarybill.co.Item;
import com.cts.stationarybill.exception.InvalidCostPerQuantityException;

public class Main 
{
    public static void main( String[] args )
    {
    	SkeletonValidator validator = new SkeletonValidator();
    	
    	@SuppressWarnings("resource")/    	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    		
   	CartService service=(CartService)ctx.getBean("cartService");
   	try {
   	
  	double totalBill=service.calculateOrderTotalBill();
    	System.out.println("Your total bill is = "+totalBill);
    }catch(InvalidCostPerQuantityException e)
    {
        System.out.println(e.getMessage());
    }
}
