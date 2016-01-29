package co.transport.systems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@CrossOrigin
@RestController
public class CarStoreQueryController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	public List<CarSalesStore> query(@RequestParam(value = "q", required = true) int query) {

		return createQueryResult(query);
	}

	private List<CarSalesStore> createQueryResult(int number) {

		List<CarSalesStore> result = new ArrayList<CarSalesStore>();
		for (int i = 0; i < number; i++) {
			CarSalesStore css = new CarSalesStore("Concesionario de autos " + i, "Bogota", "Calle Falsa 123 # 93-" + i, 23.25 * i,
					4.680454 + ((float) i / 1000), -74.059321 + ((float) i / 1000));
			result.add(css);
		}
		return result;
	}

}
