package people;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kevinallen on 3/30/17.
 */


    @SpringBootApplication
    public class Application {
        private static  final Logger log = LoggerFactory.getLogger(Application.class);

        public static void main(String[] args) {
            SpringApplication.run(Application.class);
        }

        @Bean
        public RestTemplate restTemplate (RestTemplateBuilder builder) {
            return builder.build();
        }

        @Bean
        public CommandLineRunner run (RestTemplate restTemplate) throws Exception {
            return args -> {
                User user = restTemplate.getForObject("https://lit-beach-24368.herokuapp.com/person/1", User.class);

                User user1 = new User("Mary Johnson","345 HillRoad","708-225-6372","12/27/1925","mary@hotmail.com");
                User user2 = restTemplate.postForObject("https://lit-beach-24368.herokuapp.com/person", user1, User.class);








                log.info(user.toString());
            };
        }
    }


