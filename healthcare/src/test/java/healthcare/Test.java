package healthcare;

import static org.junit.Assert.*;

import com.capgemini.healthcare.dao.HealthCareDAO;
import com.capgemini.healthcare.dto.HealthCareDiagnosticCenter;

public class Test {
HealthCareDAO dao = new HealthCareDAO();
	@org.junit.Test
	public void test() {
		HealthCareDiagnosticCenter d = null;
		dao.removecenter(d);
	assertEquals(false,dao.removecenter(d));	
	}
}