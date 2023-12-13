package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.IMqttClient;

public class SensorPublisher {

	public static void main() throws MqttException {
		String publisherId = "Publicador_154";
		IMqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);
	
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		publisher.connect( opts );

		Sensor sensor = new Sensor();
		double temperatura = sensor.readTemp();
		MqttMessage message = createMessage(temperatura);
		
		publisher.publish(MyConstants.TOPIC_SENSOR, message);
	
		publisher.disconnect();
	}
	
	private static MqttMessage createMessage(double value) {
		byte[] payload = String.format("T:%04.2f", value).getBytes();
		return new MqttMessage( payload );
	}
}
