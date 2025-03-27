package practiceserv.ec2rds.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    void greetReturnsCorrectMessage() {
        HelloService service = new HelloService();
        String result = service.greet("Kyungho");
        assertEquals("Hello Kyungho", result);
    }
}