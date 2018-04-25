package CucumberStepDifinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.Assert;

import java.io.IOException;
import java.math.BigDecimal;

public class WeatherTestStepDef {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response = new Response();

    @When("we are requesting weather")
    public void get_weather_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("LON should be (.*)")
    public void check_lon(BigDecimal lon) {
        Assert.assertEquals("Wrong lon", lon, response.getCoord().getLon());

    }

    @And("LAT should be (.*)")
    public void check_lat(BigDecimal lat) {
        Assert.assertEquals("Wrong lat", lat, response.getCoord().getLat());

    }


    @When("we are requesting main parameters")
    public void get_main_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("TEMP should be (.*)")
    public void check_temp(BigDecimal temp) {
        Assert.assertEquals("Wrong temp", temp, response.getMain().getTemp());
    }

    @And("PRESSURE should be (.*)")
    public void check_pressure(Integer pressure) {
        Assert.assertEquals("Wrong pressure", pressure, response.getMain().getPressure());
    }

    @And("HUMIDITY should be (.*)")
    public void check_humidity(Integer humidity) {
        Assert.assertEquals("Wrong humidity", humidity, response.getMain().getHumidity());
    }

    @And("TEMP_MIN should be (.*)")
    public void check_temp_min(BigDecimal temp_min) {
        Assert.assertEquals("Wrong temp_min", temp_min, response.getMain().getTemp_min());
    }

    @And("TEMP_MAX should be (.*)")
    public void check_temp_max(BigDecimal temp_max) {
        Assert.assertEquals("Wrong temp_max", temp_max, response.getMain().getTemp_max());
    }


    @When("we are requesting wind parameters")
    public void get_wind_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("SPEED should be (.*)")
    public void check_speed(BigDecimal speed) {
        Assert.assertEquals("Wrong speed", speed, response.getWind().getSpeed());
    }

    @And("DEG should be (.*)")
    public void check_deg(Integer deg) {
        Assert.assertEquals("Wrong deg", deg, response.getWind().getDeg());

    }


    @When("we are requesting cloud parameters")
    public void get_cloud_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("ALL should be (.*)")
    public void check_all(Integer all) {
        Assert.assertEquals("Wrong als", all, response.getCloud().getAll());
    }


    @When("we are requesting sys parameters")
    public void get_sys_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("TYPE should be (.*)")
    public void check_type(Integer type){
        Assert.assertEquals("Wrong sys", type, response.getSys().getType());
    }

    @And("ID should be (.*)")
    public void check_id(Integer id) {
        Assert.assertEquals("Wrong id", id, response.getSys().getId());
    }

    @And("MESSAGE should be (.*)")
    public void check_message(BigDecimal message){
        Assert.assertEquals("Wrong message", message, response.getSys().getMessage());
    }

    @And("COUNTRY should be (.*)")
    public void check_country (String country) {
        Assert.assertEquals("Wrong country", country, response.getSys().getCountry());
    }

    @And("SUNRISE should be (.*)")
    public void check_sunrise (Integer sunrise) {
        Assert.assertEquals("Wrong sunrise", sunrise, response.getSys().getSunrise());
    }

    @And("SUNSET should be (.*)")
    public void check_sunset (Integer sunset) {
        Assert.assertEquals("Wrong sunset", sunset, response.getSys().getSunset());
    }
}
