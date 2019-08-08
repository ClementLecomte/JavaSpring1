package com.spring1.DocteurWho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DocteurWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocteurWhoApplication.class, args);
	}


	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index() {
		return "William Hartnell";
	}
    @RequestMapping("/doctor/2")
    @ResponseBody
    public String index2() {
        return "Patrick Troughton";
    }
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String index3() {
        return "Tom Baker";
    }
    @RequestMapping("/doctor/4")
    @ResponseBody
    public String index4() {
        return "Matt Smith";
    }
    @RequestMapping("/")
    @ResponseBody
    public String racine() {
        return "<ul>" +
                "<li> William Hartnell</li>" +
                "<li> Patrick Troughton</li>" +
                "<li> Tom Baker</li>" +
                "<li> Matt Smith</li>" +
                "</ul>";
    }

}
