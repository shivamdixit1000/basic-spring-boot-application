package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dixits on 05-11-2017.
 */
@Controller
public class HomeController {

   @RequestMapping("/books")
   @ResponseBody
   public String myController(Model model) {
      return "shivam";
   }
}

