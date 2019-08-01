package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@EnableEurekaClient
@Controller
@SpringBootApplication
public class MyService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyService2Application.class, args);
	}
	
	 @Autowired
		private UserDao userDao;


		
		@RequestMapping("/callService/{name}&{pwd}")
		public String verify(@PathVariable(value="name") String name,@PathVariable(value="password") String password) 
		{  
			
			User u=new User();
			u.setName("Surya");
			u.setPassword("123");
			userDao.save(u);
			User u1=new User();
			u1.setName("Bhargavi");
			u1.setPassword("abc");
			userDao.save(u1);
			
			User user=userDao.findUser(name,password);
			
		   if(user==null)
		   {
			return "demo";
		   }
		   else 
		   {
		     return "loggedIn";
			  
		   }
		   }
	

}
