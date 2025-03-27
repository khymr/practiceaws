package practiceserv.ec2rds.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greet(String name) {
        return "Hello " + name;
    }
}
