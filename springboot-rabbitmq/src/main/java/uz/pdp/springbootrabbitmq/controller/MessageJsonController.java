package uz.pdp.springbootrabbitmq.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springbootrabbitmq.dto.User;
import uz.pdp.springbootrabbitmq.publisher.RabbitMQJsonProducer;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageJsonController {

    private final RabbitMQJsonProducer jsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(
            @RequestBody User user
    ) {
        jsonProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");
    }
}