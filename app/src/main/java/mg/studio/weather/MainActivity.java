package mg.studio.weather;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView todayWeather;
    private TextView tvLocation;
    private TextView tvToday;
    private TextView tvTwoday;
    private TextView tvThreeday;
    private TextView tvFourday;
    private TextView tvFiveday;
    private TextView tvDate;
    private ImageView img_weather_condition;
    private ImageView iv_first;
    private ImageView iv_scond;
    private ImageView iv_three;
    private ImageView iv_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getWeather();
    }

    private void initView() {
        todayWeather = findViewById(R.id.temperature_of_the_day);
        img_weather_condition = findViewById(R.id.img_weather_condition);
        iv_first = findViewById(R.id.iv_first);
        iv_scond = findViewById(R.id.iv_scond);
        iv_three = findViewById(R.id.iv_three);
        iv_four = findViewById(R.id.iv_four);
        tvLocation = findViewById(R.id.tv_location);
        tvToday = findViewById(R.id.tv_today);
        tvTwoday = findViewById(R.id.tv_twoday);
        tvThreeday = findViewById(R.id.tv_threeday);
        tvFourday = findViewById(R.id.tv_fourday);
        tvFiveday = findViewById(R.id.tv_fiveday);
        tvDate = findViewById(R.id.tv_date);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWeather();
            }
        });
    }

    private void getWeather(){
        new DownloadUpdate().execute();
    }
    private class DownloadUpdate extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {
          //  String stringUrl = "https://samples.openweathermap.org/data/2.5/forecast?q=Chongqing,zh_cn&APPID=51cbe742e2fe5539b22e6cded19a7c45";
            String stringUrl = "https://api.openweathermap.org/data/2.5/forecast?q=Chongqing&APPID=51cbe742e2fe5539b22e6cded19a7c45&lang=zh_cn&units=metric";
            HttpURLConnection urlConnection = null;
            BufferedReader reader;

            try {
                URL url = new URL(stringUrl);

                // Create the request to get the information from the server, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    // Mainly needed for debugging
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                //The temperature
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String temperature) {
            if (!TextUtils.isEmpty(temperature)){
                Log.e("tag",temperature+"");
                Gson gson = new Gson();
                Weather result = gson.fromJson(temperature, Weather.class);
                tvLocation.setText(result.getCity().getName());

                Weather.ListEntity today = result.getList().get(4);
                todayWeather.setText(today.getMain().getTemp()+"");
                tvDate.setText(today.getDt_txt().substring(0,10));
                img_weather_condition.setImageResource(getWeather(today.getWeather().get(0).getDescription()));
                Weather.ListEntity tomorrow = result.getList().get(12);
                iv_first.setImageResource(getWeather(tomorrow.getWeather().get(0).getDescription()));
                Weather.ListEntity afterTomorrow = result.getList().get(20);
                iv_scond.setImageResource(getWeather(afterTomorrow.getWeather().get(0).getDescription()));
                Weather.ListEntity threeDays = result.getList().get(28);
                iv_three.setImageResource(getWeather(threeDays.getWeather().get(0).getDescription()));
                Weather.ListEntity fourDays = result.getList().get(36);
                iv_four.setImageResource(getWeather(fourDays.getWeather().get(0).getDescription()));
                tvToday.setText(getWeekByDateStr(today.getDt_txt()));
                tvTwoday.setText(getWeekByDateStr(tomorrow.getDt_txt()).substring(0,3));
                tvThreeday.setText(getWeekByDateStr(afterTomorrow.getDt_txt()).substring(0,3));
                tvFourday.setText(getWeekByDateStr(threeDays.getDt_txt()).substring(0,3));
                tvFiveday.setText(getWeekByDateStr(fourDays.getDt_txt()).substring(0,3));
            }


        }
    }

    public int getWeather(String main){
        if (main.contains("晴")){
            return R.drawable.sunny_small;
        }else if (main.contains("云")){
            return R.drawable.partly_sunny_small;
        }else if (main.contains("雨")){
            return R.drawable.rainy_small;
        }else if (main.contains("风")){
            return R.drawable.windy_small;
        }
        return  R.drawable.partly_sunny_small;
    }
    public static String getWeekByDateStr(String strDate) {
        int year = Integer.parseInt(strDate.substring(0, 4));
        int month = Integer.parseInt(strDate.substring(5, 7));
        int day = Integer.parseInt(strDate.substring(8, 10));

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DAY_OF_MONTH, day);

        String week = "";
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);

        switch (weekIndex)
        {
            case 1:
                week = "SUNDAY";
                break;
            case 2:
                week = "MONDAY";
                break;
            case 3:
                week = "TUESDAY";
                break;
            case 4:
                week = "WEDNESDAY";
                break;
            case 5:
                week = "THURSDAY";
                break;
            case 6:
                week = "FRIDAY";
                break;
            case 7:
                week = "SATURDAY";
                break;
        }
        return week;
    }

}
