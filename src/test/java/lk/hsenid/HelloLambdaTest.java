package lk.hsenid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloLambdaTest {
    @Test
    public void shouldReturnHelloMessage(){
        var testing = new HelloLambda();
        Assertions.assertEquals("Hello, AWS Lambda!",testing.handleRequest());

    }

}