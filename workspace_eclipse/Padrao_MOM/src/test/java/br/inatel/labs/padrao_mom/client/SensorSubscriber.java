package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class SensorSubscriber {

	public static void main(String[] args) throws MqttException {
		String subscriberId = "Subscriber_154";
		MqttClient subscriber = new MqttClient( MyConstants.URI_BROKER, subscriberId );

		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		subscriber.connect(opts);
		
		subscriber.subscribe(MyConstants.TOPIC_SENSOR, (topic, msg) -> {
			System.out.println("Mensagem recebida: [" + msg + "] do tópico: " + topic);
		});
	}

}
