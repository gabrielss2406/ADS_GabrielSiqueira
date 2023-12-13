import { Component, OnDestroy, OnInit } from '@angular/core';
import { MqttService, IMqttMessage } from 'ngx-mqtt';
import { IMsg } from '../../models/i-msg';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.scss'
})
export class DashboardComponent implements OnInit, OnDestroy {
  TOPIC_SMARTCAMPUS = 'smartcampus/poste/#';
  msgList : IMsg[] = [];
  constructor(private mqttService : MqttService) {
  }

  ngOnDestroy(): void {
    this.mqttService.disconnect();
  }
  ngOnInit(): void {
    try {
      this.mqttService.observe( this.TOPIC_SMARTCAMPUS ).subscribe( (mqttMessage : IMqttMessage ) => {
        const msg : IMsg = {
          id: mqttMessage.messageId,
          topic: mqttMessage.topic,
          content: mqttMessage.payload.toString()
        };
      this.msgList.push( msg );
      });
    } catch( err ) {
      console.error( 'Error ao assinar topico: ' + err );
    }
  }

}
