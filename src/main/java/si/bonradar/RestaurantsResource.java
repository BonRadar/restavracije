package si.bonradar;

import java.util.List;
import jakarta.ws.rs.core.Response;
import si.bonradar.restaurants.api.RestaurantsApi;
import si.bonradar.restaurants.model.Restaurant;


public class RestaurantsResource implements RestaurantsApi {

    @Override
    public Response getNearbyRestaurants(Double lat, Double lon, Integer radius, Integer limit) {
        Restaurant r = new Restaurant();
        r.setId("1");
        r.setName("Testna restavracija");
        r.setLat(46.0503);
        r.setLon(14.5046);
        r.setDistanceMeters(150.0);
        r.setCity("Ljubljana");
        r.setOpeningHours("11:00-15:00");
        r.setPrice(4.0);
        return Response.ok(List.of(r)).build();
    }
}