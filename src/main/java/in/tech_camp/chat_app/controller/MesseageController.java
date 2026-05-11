package in.tech_camp.chat_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MesseageController {
  @GetMapping("/")
  public String getMethodName() {
      return "messages/index";
  }
  
}
