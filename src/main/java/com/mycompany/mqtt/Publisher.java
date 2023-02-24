package com.mycompany.mqtt;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uayusuf
 */
public class Publisher {

    public static void main(String[] args) {
        try {
            MqttClient client = new MqttClient("tcp://test.mosquitto.org:1883", MqttClient.generateClientId());
            client.connect();
            MqttMessage message = new MqttMessage();
            message.setQos(1);
            message.setPayload("Hello from Umar!".getBytes());
            client.publish("umar_iot_data", message);
            System.out.println(message);
            client.disconnect();
        } catch (MqttException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
