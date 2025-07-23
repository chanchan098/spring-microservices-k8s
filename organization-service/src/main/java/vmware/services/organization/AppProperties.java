package vmware.services.organization;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import vmware.services.organization.bean.Department;
import vmware.services.organization.bean.Employee;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "feign.client.config")
public class AppProperties {

    private Employee employee;
    private Department department;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Map<Object, Object> toJson(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("employee", employee);
        map.put("department", department);
        return map;
    }
}
