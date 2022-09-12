package testintegrado.app;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@TestPropertySource(properties = {"spring.datasource.url=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1","spring.datasource.driver-class-name=org.h2.Driver"})
public @interface TesteIntegrado {
}
