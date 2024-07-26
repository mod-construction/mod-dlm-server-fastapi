package construction.mod.dlm.api;

import org.springframework.cloud.openfeign.FeignClient;
import construction.mod.dlm.configuration.ClientConfiguration;

@FeignClient(name="${element.name:element}", url="${element.url:http://localhost:8080}", configuration = ClientConfiguration.class)
public interface ElementApiClient extends ElementApi {
}
