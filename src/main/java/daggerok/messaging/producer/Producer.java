package daggerok.messaging.producer;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

import java.time.Instant;

import static java.time.Instant.now;

@Slf4j
@EnableBinding(Channel.class)
public class Producer {

    @Bean
    @InboundChannelAdapter(
            value = "vaadinOutputChannel",
            // poller = @Poller(fixedDelay = "500000", maxMessagesPerPoll = "2"))
            poller = @Poller(fixedDelay = "${app.fixed-delay}", maxMessagesPerPoll = "${app.max-messages-per-poll}"))
    public MessageSource<Instant> onMessageSend() {

        log.info("poll payload - you will see that only once...");
        return () -> MessageBuilder.withPayload(now()).build();
    }
}
