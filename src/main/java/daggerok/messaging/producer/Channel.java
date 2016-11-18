package daggerok.messaging.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Channel {

    @Output
    MessageChannel vaadinOutputChannel();
}

