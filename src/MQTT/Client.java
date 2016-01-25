package MQTT;

import java.util.List;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import Parser.Converter;
import Parser.Estrazione;

public class Client 
{
	   final int MAX_DIM=24;
	   Converter conv = new Converter();
	   List <Estrazione> est = conv.information_data();
	   byte[] payload = new byte[MAX_DIM];
	   MqttClient client;
	   
	   public Client(){}
	   
	   public static void main(String args[])
	   {
		   new Client().doDemo();
	   }
	   
	   public void doDemo()
	   {
		   try {
			      client = new MqttClient("tcp://localhost:1883", "pahomqttpublish1");
			      client.connect();
			      MqttMessage message = new MqttMessage();
			      for(int i=0;i<est.size();i++)
				  {
					  payload [i] = Byte.valueOf((byte) est.get(i).id_centralina());
					  payload[i+1] = Byte.valueOf(est.get(i).getInformazione());
					  payload[i+2] = est.get(i).getDato(); 
				  }
			      message.setPayload(payload);
			      System.out.println("messaggio inviato");
			      client.publish("pahodemo/test", message);
			      client.disconnect();
			    } catch (MqttException e) {
			      e.printStackTrace();
			    }
			  }
}

