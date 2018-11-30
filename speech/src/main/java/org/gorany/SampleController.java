package org.gorany;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
 
	@GetMapping("/speech")
	public void speech() {
		log.info("speech.......");
	}
	
	@GetMapping("/home")
	public void home() {
		log.info("home.......");
	}
	
	@PostMapping("/home")
	@ResponseBody
	public String homePost(RedirectAttributes redirect, @RequestBody Map<String,String> data) {
		log.info("homePost.......");
		 
		System.out.println(data.get("data"));
		System.out.println(data.get("data").equals("1"));
		
		
		if(data.get("data").equals("1")) {
			log.info("---------");
			return "redirect:/speech";
		}
		
		return null;
		
	}
}
