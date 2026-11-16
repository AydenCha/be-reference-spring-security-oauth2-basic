package com.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// JWT 비밀 키와 구글 클라이언트 정보는 실행할 때 환경 변수로 넣습니다. 테스트에서는 외부에 접속하지 않으므로 임시 값을 넣어 컨텍스트만 확인합니다.
@SpringBootTest(properties = {"JWT_SECRET_KEY=test-secret-key-for-context-loads-only-0123456789", "G_CLIENT_ID=test-client-id", "G_CLIENT_SECRET=test-client-secret"})
class Section4Week1SpringSecurityOauth2BasicApplicationTests {

	@Test
	void contextLoads() {
	}

}
