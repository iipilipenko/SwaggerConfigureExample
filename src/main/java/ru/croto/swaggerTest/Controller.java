package ru.croto.swaggerTest;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @Operation(summary = "Addition two numbers")
    @ApiOperation(value = "summarize", notes = "return a+b result")
    @GetMapping("/SUM")
    String summarizeTwoNumbers(@Parameter(description = "first addend") @RequestParam(value = "param1") double param1,
                               @Parameter(description = "second addend") @RequestParam(value = "param2") double param2) {
        return String.valueOf(param1+param2);
    }
}
