package pe.edu.cibertec.appgrupo1productor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.appgrupo1productor.service.FibonacciService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    private final FibonacciService fibonacciService;

    @GetMapping("/send")
    public String enviarNumeros(
            @RequestParam String numbers){
        fibonacciService.enviarNumeros(numbers);
        return "Lista enviada a RabbitMQ correctamente";
    }
}
