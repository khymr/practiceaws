package practiceserv.ec2rds;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Ec2rdsApplicationTests {

	@Test
	void contextLoads() {
		assertThat(1 + 1).isEqualTo(2); // ✅ 항상 성공하는 테스트
	}

}
