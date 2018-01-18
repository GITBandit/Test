package pl.javastart.mvcdemo.component;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomGenerator {

    public int getRandomInt(){
        return new Random().nextInt(1000);
    }
}
