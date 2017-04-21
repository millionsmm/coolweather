package activitytest.example.com.coolweather.util;

/**
 * Created by Administrator on 2017/4/5 0005.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
