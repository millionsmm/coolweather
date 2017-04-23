package activitytest.example.com.coolweather.gson;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
