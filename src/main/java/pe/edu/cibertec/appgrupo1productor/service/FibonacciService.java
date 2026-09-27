package pe.edu.cibertec.appgrupo1productor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appgrupo1productor.rabbitmq.FibonacciProductor;

@RequiredArgsConstructor
@Service
public class FibonacciService {
    private final FibonacciProductor productor;

    public void enviarNumeros(String numbers){
        productor.enviarNumerosARabbitMQ(numbers);
    }
}
