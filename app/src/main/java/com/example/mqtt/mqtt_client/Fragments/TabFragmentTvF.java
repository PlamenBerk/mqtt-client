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
                String message = Constants.FINLUX_POWER_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        volumeUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_VOLUME_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        volumeDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_VOLUME_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        channelUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_CHANNEL_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        channelDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_CHANNEL_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_MUTE_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_INPUT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_BACK_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_EXIT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_OK_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_LEFT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.FINLUX_RIGHT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC_FINLUX);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }


}