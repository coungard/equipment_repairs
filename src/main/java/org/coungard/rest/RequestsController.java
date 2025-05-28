package org.coungard.rest;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.coungard.model.RepairRequestDto;
import org.coungard.model.Role;
import org.coungard.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/requests")
@Slf4j
@RequiredArgsConstructor
public class RequestsController {

  private final RequestService requestService;

  @PostMapping
  public ResponseEntity<Long> createRequest() {
    log.info("RequestsController::createRequest");
    long createdId = requestService.createRequest();
    return ResponseEntity.ok(createdId);
  }

  @GetMapping
  public List<RepairRequestDto> getRequests() {
    log.info("RequestsController::getRequests by {}, role={}", defineUser(), defineRole());

    return requestService.getRequests();
  }

  private String defineUser() {
    return "User";
  }

  private Role defineRole() {
    return Role.ADMIN;
  }
}
