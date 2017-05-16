package jpyl.com.area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CityPicker city_paker;
    private TextView tv_city_name;
    private String city_string = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city_paker = (CityPicker) findViewById(R.id.city_paker);
        tv_city_name = (TextView) findViewById(R.id.tv_city_name);

        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                city_string = city_paker.getCity_string();
                tv_city_name.setText(city_string);
            }
        });

    }
}
