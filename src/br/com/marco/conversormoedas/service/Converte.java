package br.com.marco.conversormoedas.service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converte {
		private String apikey = "69359ef6c55cf06c7a72fa2a";
		private String url = "https://v6.exchangerate-api.com/v6/" + apikey + "/pair/";
		private Historico historico;

		public Converte(Historico historico){
				this.historico = historico;
		}

		Gson gson =  new GsonBuilder()
						.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
						.setPrettyPrinting()
						.create();

}
