package daggerok.messaging.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface Channel {
    @Input
    MessageChannel vaadinInputChannel();
}
