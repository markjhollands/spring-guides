package payroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(OrderRepository repository) {
    return args -> {
		repository.save(new Order("MacBook Pro", Status.COMPLETED));
		repository.save(new Order("iPhone", Status.IN_PROGRESS));
	
		repository.findAll().forEach(order -> {
		  log.info("Preloaded " + order);
		});
    };
  }
}