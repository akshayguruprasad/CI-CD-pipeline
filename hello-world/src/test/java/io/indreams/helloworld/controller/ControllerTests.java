package io.indreams.helloworld.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ControllerTests {

    @InjectMocks
    private Controller controller;

    @Test
    public void greetingMessagetest(){
        String message = controller.message();
        Assert.notNull(message,"Message must not be null");
        Assert.isTrue(message.equals("Hello World!!"),"Message not matched");
    }
}
