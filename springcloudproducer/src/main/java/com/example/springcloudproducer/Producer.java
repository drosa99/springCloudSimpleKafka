package com.example.springcloudproducer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(Source.class)
public class Producer {

		private String defaultMessage = "Hellooo!";

		@InboundChannelAdapter(Source.OUTPUT)
		public String sendDefaultMessage(){
				System.out.println(defaultMessage);
				return defaultMessage;
		}
}
