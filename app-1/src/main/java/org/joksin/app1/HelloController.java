package org.joksin.app1;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.joksin.commons.ApiResponse;

@Controller
public class HelloController {

  @Get("/api/hello")
  public ApiResponse<String> sayHello() {
    return new ApiResponse<>("Hello world from app-1!");
  }
}
