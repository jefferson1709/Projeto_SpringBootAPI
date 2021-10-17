package com.springboot.api.services;

import org.springframework.mail.SimpleMailMessage;

import com.springboot.api.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}