package demo.configure;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * Created by swift on 15/9/13.
 */
@Configuration
@ConditionalOnClass(JmsTemplate.class)
public class JmsTemplateAutoConfiguration {

    @Configuration
    @ConditionalOnMissingBean(JmsTemplate.class)
    protected static class JmsTemplateCreator {

        @Autowired
        ConnectionFactory connectionFactory;

        @Bean
        public JmsTemplate jmsTemplate() {
            JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
            jmsTemplate.setPubSubDomain(true);
            return jmsTemplate;
        }

    }

    @Configuration
    @ConditionalOnClass(ActiveMQConnectionFactory.class)
    @ConditionalOnMissingBean(ConnectionFactory.class)
    protected static class ActiveMQConnectionFactoryCreator {
        @Bean
        ConnectionFactory connectionFactory() {
            return new ActiveMQConnectionFactory("vm://localhost");
        }
    }

}