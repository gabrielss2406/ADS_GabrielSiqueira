package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The HelloController class handles requests for the "/hello" endpoint.
 * It returns a MyMessage with a greeting.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * Handles GET requests for the "/hello" endpoint.
     *
     * @return a MyMessage with a greeting
     */
    @GetMapping
    public MyMessage processarGetHello() {
        MyMessage msg = new MyMessage("Olá mundo SOA");
        return msg;
    }
}
