package com.yt.john_marty.rest_api;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
	public static void main(String[] args) throws Exception {
		String audioUrl = "https://bit.ly/3yxKEIY";

		Transcript transcript = new Transcript();
		transcript.setAudioUrl(audioUrl);

		Gson gson = new Gson();
		String jsonReq = gson.toJson(transcript);

		System.out.println("jsonReq -> " + jsonReq);

		HttpRequest postReq = HttpRequest.newBuilder()
			.uri(new URI("https://api.assemblyai.com/v2/transcript"))
			.header("Authorization", Constants.API_KEY)
			.POST(HttpRequest.BodyPublishers.ofString(jsonReq))
			.build();

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> postRes = httpClient.send(postReq, HttpResponse.BodyHandlers.ofString());

		System.out.println("postRes.body() -> " + postRes.body());

		transcript = gson.fromJson(postRes.body(), Transcript.class);

		System.out.println("transcript.getId() -> " + transcript.getId());

		HttpRequest getReq = HttpRequest.newBuilder()
			.uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
			.header("Authorization", Constants.API_KEY)
			.GET()
			.build();

		while(true) {
			HttpResponse<String> getRes = httpClient.send(getReq, HttpResponse.BodyHandlers.ofString());

			transcript = gson.fromJson(getRes.body(), Transcript.class);

			System.out.println("transcript.getStatus() -> " + transcript.getStatus());

			if("completed".equalsIgnoreCase(transcript.getStatus()) || "error".equalsIgnoreCase(transcript.getStatus())) {
				break;
			}

			Thread.sleep(1000);
		}

		System.out.println("transcription completed -> " + transcript.getText());
	}
}