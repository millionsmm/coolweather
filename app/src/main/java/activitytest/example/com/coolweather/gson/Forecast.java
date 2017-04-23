package activitytest.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Administrator on 2017/4/22 0022.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temerature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;

    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }


}






























