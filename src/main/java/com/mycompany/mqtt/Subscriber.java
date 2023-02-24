/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mqtt;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 *
 * @author uayusuf
 */
public class Subscriber {
    public static void main(String[] args) {
        try {
            MqttClient client = new MqttClient("tcp://test.mosquitto.org:1883", MqttClient.generateClientId());
            client.connect();
            client.setCallback(new SimpleMqttCallBack());
            client.subscribe("umar_iot_data");
        } catch (MqttException ex) {
            Logger.getLogger(Subscriber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
