package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-14T08:47:46.060+08:00")

@Controller
public class CalcApiController implements CalcApi {

    private static final Logger log = LoggerFactory.getLogger(CalcApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CalcApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> calcGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "a", required = true) String a, @NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "b", required = true) String b, @NotNull @ApiParam(value = "entity type", required = true) @Valid @RequestParam(value = "mathCalc", required = true) String mathCalc) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                Double numA = Double.parseDouble(a);
                Double numb = Double.parseDouble(b);

                String result = "Invalid number or calculation";

                if ("add".equalsIgnoreCase(mathCalc)) {
                    result = String.valueOf(numA + numb);
                } else if ("sub".equalsIgnoreCase(mathCalc)) {
                    result = String.valueOf(numA + numb);
                } else if ("mul".equalsIgnoreCase(mathCalc)) {
                    result = String.valueOf(numA + numb);
                } else if ("div".equalsIgnoreCase(mathCalc)) {
                    result = String.valueOf(numA + numb);
                } else if ("mod".equalsIgnoreCase(mathCalc)) {
                    result = String.valueOf(numA.longValue() % numb.longValue());
                }

                return new ResponseEntity<String>(result, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
