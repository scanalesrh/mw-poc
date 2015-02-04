package com.redhat.workshop.util;

import com.google.gson.Gson;

public class javaToJSON {

	public static void main(String[] args) {
		MyFormVO form = new MyFormVO();
		form.setTipo("TIPOA");
		Gson gson = new Gson();

		String jsonRepresentation = gson.toJson(form);

		System.out.println(jsonRepresentation);
	}

}
