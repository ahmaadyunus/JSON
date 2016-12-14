package com.example.ahmaadyunus.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_name = (TextView)findViewById(R.id.tv_name_nine);

        TextView tv_city = (TextView)findViewById(R.id.tv_city_nine);

        TextView tv_province = (TextView)findViewById(R.id.tv_province_nine);

        JSONObject student_json = new JSONObject();

        JSONObject address_json = new JSONObject();

        try {

            student_json.put("name", "mdwikuntobayu");

            address_json.put("city", "bandung");

            address_json.put("province", "west java");

            student_json.put("address", address_json);

            //this for handle set value to text view

            tv_name.setText("Name : "+ student_json.getString("name"));

            JSONObject jo_address = (JSONObject) student_json.get("address");

            tv_city.setText("City : " + jo_address.getString("city"));

            tv_province.setText("Province : " + jo_address.getString("province"));

        } catch (JSONException e) {

            Log.i("info", String.valueOf(e));

        }
    }
}
