package com.example.mqtt.mqtt_client.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.mqtt.mqtt_client.Constants;
import com.example.mqtt.mqtt_client.MainActivity;
import com.example.mqtt.mqtt_client.R;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.io.UnsupportedEncodingException;

public class TabFragmentTvS extends Fragment {

    private ImageButton powerButton, inputButton, settingsButton, muteButton, volumeUpButton, volumeDownButton,
            channelUpButton, channelDownButton, homeButton, backButton, exitButton, okButton, upButton,
            downButton, leftButton, rightButton;

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_tv_s, container, false);
        mainActivity = (MainActivity) getActivity();

        powerButton = (ImageButton) view.findViewById(R.id.samsung_button_power);
        inputButton = (ImageButton) view.findViewById(R.id.samsung_button_input);
        settingsButton = (ImageButton) view.findViewById(R.id.samsung_button_settings);
        muteButton = (ImageButton) view.findViewById(R.id.samsung_button_mute);
        volumeUpButton = (ImageButton) view.findViewById(R.id.samsung_button_volume_up);
        volumeDownButton = (ImageButton) view.findViewById(R.id.samsung_button_volume_down);
        channelUpButton = (ImageButton) view.findViewById(R.id.samsung_button_channel_up);
        channelDownButton = (ImageButton) view.findViewById(R.id.samsung_button_channel_down);
        homeButton = (ImageButton) view.findViewById(R.id.samsung_button_home);
        backButton = (ImageButton) view.findViewById(R.id.samsung_button_back);
        exitButton = (ImageButton) view.findViewById(R.id.samsung_button_exit);
        okButton = (ImageButton) view.findViewById(R.id.samsung_button_ok);
        upButton = (ImageButton) view.findViewById(R.id.samsung_button_up);
        downButton = (ImageButton) view.findViewById(R.id.samsung_button_down);
        leftButton = (ImageButton) view.findViewById(R.id.samsung_button_left);
        rightButton = (ImageButton) view.findViewById(R.id.samsung_button_right);

        setupClickListeners();

        return view;
    }

    private void setupClickListeners() {
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_POWER_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_INPUT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_SETTINGS_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_MUTE_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        volumeUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_VOLUME_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        volumeDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_VOLUME_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        channelUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_CHANNEL_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        channelDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_CHANNEL_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_HOME_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_BACK_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_EXIT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_OK_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_UP_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_DOWN_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_LEFT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                MqttMessage message = new MqttMessage(Constants.SAMSUNG_RIGHT_BUTTON.getBytes());
                try {
                    mainActivity.client.publish(Constants.PUBLISH_TOPIC_SAMSUNG, message);
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}