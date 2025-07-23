package vmware.services.organization.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vmware.services.organization.model.Employee;

import java.util.List;

@FeignClient(name = "employee"/*, url = "${feign.client.config.employee.url}"*/)
public interface EmployeeClient {

	@GetMapping("/organization/{organizationId}")
	List<Employee> findByOrganization(@PathVariable("organizationId") String organizationId);
	
}
