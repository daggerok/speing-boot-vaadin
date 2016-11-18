package daggerok.messaging.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.time.Instant;

@Slf4j
@EnableBinding(Channel.class)
public class Consumer {

    @StreamListener("vaadinInputChannel")
    public void onMessageReceive(final Instant payload) {
        log.info("received: {}", payload);
    }
}
