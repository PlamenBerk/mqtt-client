package com.example.mqtt.mqtt_client;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import com.example.mqtt.mqtt_client.Fragments.PagerAdapter;

import org.eclipse.paho.android.service.MqttAndroidClient;

public class MainActivity extends AppCompatActivity {

    public MqttAndroidClient client;
    private String TAG = "MainActivity";
    public PahoMqttClient pahoMqttClient;

    private EditText textMessage, subscribeTopic, unSubscribeTopic;
    private Button publishMessage, subscribe, unSubscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("A1"));
        tabLayout.addTab(tabLayout.newTab().setText("FinluxTV"));
        tabLayout.addTab(tabLayout.newTab().setText("SamsungTV"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        pahoMqttClient = new PahoMqttClient();
        client = pahoMqttClient.getMqttClient(getApplicationContext(), Constants.MQTT_BROKER_URL, Constants.CLIENT_ID);
    }






















//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textMessage = (EditText) findViewById(R.id.textMessage);
//        publishMessage = (Button) findViewById(R.id.publishMessage);
//
//        subscribe = (Button) findViewById(R.id.subscribe);
//        unSubscribe = (Button) findViewById(R.id.unSubscribe);
//
//        subscribeTopic = (EditText) findViewById(R.id.subscribeTopic);
//        unSubscribeTopic = (EditText) findViewById(R.id.unSubscribeTopic);
//        pahoMqttClient = new PahoMqttClient();
//        client = pahoMqttClient.getMqttClient(getApplicationContext(), Constants.MQTT_BROKER_URL, Constants.CLIENT_ID);
//
//        publishMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String msg = textMessage.getText().toString().trim();
//                if (!msg.isEmpty()) {
//                    try {
//                        pahoMqttClient.publishMessage(client, msg, 1, Constants.PUBLISH_TOPIC);
//                    } catch (MqttException e) {
//                        e.printStackTrace();
//                    } catch (UnsupportedEncodingException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        subscribe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String topic = subscribeTopic.getText().toString().trim();
//                if (!topic.isEmpty()) {
//                    try {
//                        pahoMqttClient.subscribe(client, topic, 1);
//                    } catch (MqttException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        unSubscribe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String topic = unSubscribeTopic.getText().toString().trim();
//                if (!topic.isEmpty()) {
//                    try {
//                        pahoMqttClient.unSubscribe(client, topic);
//                    } catch (MqttException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        Intent intent = new Intent(MainActivity.this, MqttMessageService.class);
//        startService(intent);
//    }
}

