package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import br.inatel.labs.padrao_mom.MqttBuilder;

public class SmartCampusPublisher {
	public static void main(String[] args) throws Exception {
		
		IMqttClient publisher = MqttBuilder.buildClient();
		
		Sensor sensor = new Sensor();
		
		String TOPIC_POSTE1_TENSAO = "smartcampus/poste/1/tensao";
		String TOPIC_POSTE2_TENSAO = "smartcampus/poste/2/tensao";
		String TOPIC_POSTE3_TENSAO = "smartcampus/poste/3/tensao";
		String TOPIC_POSTE1_CORRENTE = "smartcampus/poste/1/corrente";
		String TOPIC_POSTE2_CORRENTE = "smartcampus/poste/2/corrente";
		String TOPIC_POSTE3_CORRENTE = "smartcampus/poste/3/corrente"; 
	
		for (int i=0; i<1000; i++) {
			double valorTensao = 0;
			MqttMessage msgTensao = null;
			//publicar mensagens com leitura de tensão para cada poste aguardando 1000ms
			double valorCorrente = 0.0;
			MqttMessage msgCorrente = null;
			//publicar mensagens com leitura de corrente para cada poste aguardando 1000ms
		}
	}	
}
