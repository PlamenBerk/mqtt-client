package com.example.mqtt.mqtt_client.Fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mqtt.mqtt_client.Constants;
import com.example.mqtt.mqtt_client.MainActivity;
import com.example.mqtt.mqtt_client.R;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Locale;

import static android.app.Activity.RESULT_OK;

public class TabFragmentTvF extends Fragment {

    private ImageButton powerButton, muteButton, inputButton, volumeUpButton, volumeDownButton, channelUpButton, channelDownButton,
            backButton, exitButton, okButton, upButton, downButton, leftButton, rightButton;

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_tv_f, container, false);
        mainActivity = (MainActivity) getActivity();

        powerButton = (ImageButton) view.findViewById(R.id.finlux_button_power);
        muteButton = (ImageButton) view.findViewById(R.id.finlux_button_mute);
        inputButton = (ImageButton) view.findViewById(R.id.finlux_button_input);
        volumeUpButton = (ImageButton) view.findViewById(R.id.finlux_button_volume_up);
        volumeDownButton = (ImageButton) view.findViewById(R.id.finlux_button_volume_down);
        channelUpButton = (ImageButton) view.findViewById(R.id.finlux_button_channel_up);
        channelDownButton = (ImageButton) view.findViewById(R.id.finlux_button_channel_down);
        backButton = (ImageButton) view.findViewById(R.id.finlux_button_back);
        exitButton = (ImageButton) view.findViewById(R.id.finlux_button_exit);
        okButton = (ImageButton) view.findViewById(R.id.finlux_button_ok);
        upButton = (ImageButton) view.findViewById(R.id.finlux_button_up);
        downButton = (ImageButton) view.findViewById(R.id.finlux_button_down);
        leftButton = (ImageButton) view.findViewById(R.id.finlux_button_left);
        rightButton = (ImageButton) view.findViewById(R.id.finlux_button_right);

        setupClickListeners();

        return view;
    }

    private void setupClickListeners() {
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_POWER_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        volumeUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_VOLUME_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        volumeDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_VOLUME_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        channelUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_CHANNEL_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        channelDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_CHANNEL_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_MUTE_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_INPUT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_BACK_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_EXIT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_OK_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_LEFT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.FINLUX_RIGHT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_FINLUX, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });
    }


}