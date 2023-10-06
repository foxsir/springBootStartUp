package com.nothing.booking.controllers;


import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

  @GetMapping()
  public String test() {
    return "index";
  }
}
