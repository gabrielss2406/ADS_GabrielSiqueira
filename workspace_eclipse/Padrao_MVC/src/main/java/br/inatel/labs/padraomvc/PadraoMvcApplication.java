package br.inatel.labs.padraomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The PadraoMvcApplication class is the entry point for the Spring Boot application.
 * It configures and launches the application.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
@SpringBootApplication
public class PadraoMvcApplication {

    /**
     * The main method to start the Spring Boot application.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(PadraoMvcApplication.class, args);
    }

}
