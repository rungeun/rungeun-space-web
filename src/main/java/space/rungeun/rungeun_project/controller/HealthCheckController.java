package space.rungeun.rungeun_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController로 간단한 엔드포인트 정의
@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public ResponseEntity<String> healthCheck() {
        // 서버가 정상일 때 200 OK와 메시지 반환
        return ResponseEntity.ok("OK");
    }

    // 서버가 문제가 있다고 가정하는 상황이라면
    // return ResponseEntity.status(500).body("ERROR");
    // 이런 식으로 에러 응답을 보낼 수도 있음
}