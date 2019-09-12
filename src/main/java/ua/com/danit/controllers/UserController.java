package ua.com.danit.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.danit.entity.User;

//@Controller Spring MVC - return templates
@RestController // Adds @ResponseBody to all methods
@RequestMapping("/api/users")
public class UserController {
//  @RequestMapping(value = "/current", method = RequestMethod.GET)
  @GetMapping("/current")
//  @CrossOrigin
  public ResponseEntity<User> getCurrentUser() {
    User user = new User("Valera", "Pupkin", "pupkin@gmail.com", "#Sexyandiknowit111");
    return new ResponseEntity(user, HttpStatus.ACCEPTED);
//    return ResponseEntity.ok(user);
  }
}
