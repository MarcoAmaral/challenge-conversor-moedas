package br.com.marco.conversormoedas.service;

public record MoedaExchange(
				String result,
				String base_code,
				String target_code,
				String time_last_update_utc,
				double conversion_rate,
				double conversion_result) {
	}