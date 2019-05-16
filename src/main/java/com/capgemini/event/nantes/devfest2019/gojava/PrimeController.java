package com.capgemini.event.nantes.devfest2019.gojava;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @Autowired
    private JavaPrimeService javaPrimeService;

    @Autowired
    private GoPrimeService goPrimeService;


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/javaPrime")
    public String javaPrime(@RequestParam(value="primeMax", defaultValue="100") String primeMaxAsString) {
        return javaPrimeService.prime(Integer.parseInt(primeMaxAsString));
    }

    @RequestMapping("/goPrime")
    public String goPrime(@RequestParam(value="primeMax", defaultValue="100") String primeMaxAsString) {
        return goPrimeService.prime(Integer.parseInt(primeMaxAsString));
    }


}
