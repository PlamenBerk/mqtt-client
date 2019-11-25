package com.example.mqtt.mqtt_client.Fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
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

public class TabFragmentA1 extends Fragment {

    private ImageButton powerButton, volumeUpButton, volumeDownButton, channelUpButton, channelDownButton, muteButton, homeButton, backwardButton, forwardButton, playPauseButton, stopButton, speakButton, backButton, appButton, okButton,
    upButton, downButton, leftButton, rightButton;
    private MainActivity mainActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_a1, container, false);
        mainActivity = (MainActivity) getActivity();

        powerButton = (ImageButton) view.findViewById(R.id.a1_button_power);
        volumeUpButton = (ImageButton) view.findViewById(R.id.a1_button_volume_up);
        volumeDownButton = (ImageButton) view.findViewById(R.id.a1_button_volume_down);
        channelUpButton = (ImageButton) view.findViewById(R.id.a1_button_channel_up);
        channelDownButton = (ImageButton) view.findViewById(R.id.a1_button_channel_down);
        muteButton = (ImageButton) view.findViewById(R.id.a1_button_mute);
        homeButton = (ImageButton) view.findViewById(R.id.a1_button_home);
        backwardButton = (ImageButton) view.findViewById(R.id.a1_button_backward);
        forwardButton = (ImageButton) view.findViewById(R.id.a1_button_forward);
        playPauseButton = (ImageButton) view.findViewById(R.id.a1_button_play_pause);
        stopButton = (ImageButton) view.findViewById(R.id.a1_button_stop);
        speakButton = (ImageButton) view.findViewById(R.id.a1_button_speak);
        backButton = (ImageButton) view.findViewById(R.id.a1_button_back);
        appButton = (ImageButton) view.findViewById(R.id.a1_button_app);
        okButton = (ImageButton) view.findViewById(R.id.a1_button_ok);
        upButton = (ImageButton) view.findViewById(R.id.a1_button_up);
        downButton = (ImageButton) view.findViewById(R.id.a1_button_down);
        leftButton = (ImageButton) view.findViewById(R.id.a1_button_left);
        rightButton = (ImageButton) view.findViewById(R.id.a1_button_right);

        setupClickListeners();
        return view;
    }

    private void setupClickListeners() {
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_POWER_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_VOLUME_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_VOLUME_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_CHANNEL_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_CHANNEL_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_MUTE_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_HOME_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        backwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_BACKWARD_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_FORWARD_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_PLAY_PAUSE_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_STOP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Need to speak");
                try {
                    startActivityForResult(intent, Constants.REQ_CODE);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getActivity().getApplicationContext(),
                            "Sorry your device not supported",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_BACK_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setSelected(true);
                String message = Constants.A1_APP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_OK_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_UP_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_DOWN_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_LEFT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
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
                String message = Constants.A1_RIGHT_BUTTON;
                if (!message.isEmpty()) {
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, message, 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case Constants.REQ_CODE: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    try {
                        mainActivity.pahoMqttClient.publishMessage(mainActivity.client, String.valueOf(getNumberFromResult(result)), 1, Constants.PUBLISH_TOPIC);
                    } catch (MqttException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }
        }
    }

    // method to loop through results trying to find a number
    private int getNumberFromResult(ArrayList<String> results) {
        for (String str : results) {
            if (getIntNumberFromText(str) != -1) {
                return getIntNumberFromText(str);
            }
        }
        return -1;
    }

    // method to convert string number to integer
    private int getIntNumberFromText(String strNum) {
        switch (strNum) {
            case "нула":
                return 0;
            case "едно":
                return 1;
            case "две":
                return 2;
            case "три":
                return 3;
            case "четири":
                return 4;
            case "пет":
                return 5;
            case "шест":
                return 6;
            case "седем":
                return 7;
            case "осем":
                return 8;
            case "девет":
                return 9;
        }
        return Integer.parseInt(strNum);
    }
}