package in.project.gatekeeper.analytics_service.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class HealthResponse {
    private final String serviceName;
    private final String serviceDescription;
    private final String status;
}
