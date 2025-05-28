package org.coungard.service;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.coungard.model.RepairRequestDto;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultRequestService implements RequestService {

  @Override
  public long createRequest() {
    return 0;
  }

  @Override
  public List<RepairRequestDto> getRequests() {
    return null;
  }
}
