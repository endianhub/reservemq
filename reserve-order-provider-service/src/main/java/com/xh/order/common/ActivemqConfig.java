package com.xh.order.common;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.ConnectionFactory;

/**
 * Title: MQ配置 - 生产者
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/9
 */
@Configuration
public class ActivemqConfig {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Value("${spring.activemq.user}")
    private String username;

    @Value("${spring.activemq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(username, password, brokerUrl);
    }

    @Bean
    public JmsMessagingTemplate jmsMessageTemplate() {
        return new JmsMessagingTemplate(connectionFactory());
    }

}
