/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mqtt;

import java.sql.Timestamp;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 *
 * @author uayusuf
 */
public class SimpleMqttCallBack implements MqttCallback {

    public SimpleMqttCallBack() {
    }
    
    @Override
    public void connectionLost(Throwable thrwbl) {
        System.out.println("Connection to MQTT broker lost!");
    }
    
    @Override
    public void messageArrived(String string, MqttMessage mm) throws Exception {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Message receiced: (at) "+timestamp.toString()+" message = "+new String(mm.getPayload()));
    }
    
    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt){}
}
