package org.coungard.service;

import java.util.List;
import org.coungard.model.RepairRequestDto;

public interface RequestService {

  List<RepairRequestDto> getRequests();

  long createRequest();
}
