package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	private String composer;
	private String[] performers = new String[5];
	private int performerCount;
	private String recordingLocation;
	private Date releaseDate;

	public ClassicalCD(String title, double price, int quantity, String composer, String[] performers, String location, Date releaseDate) {
		super(title, price, quantity);
		setComposer(composer);
		setRecordingLocation(location);
		setReleaseDate(releaseDate);
		for (String performer: performers)
			addPerformer(performer);
	}
	
	public void showPerformers() {
		if (performerCount > 0) {
			for (int i = 0; i < performerCount; i++)
				System.out.print(performers[i] + " ");
			System.out.println();
		}
	}
	public void addPerformer(String performer) {
		if (performerCount < performers.length) {
			performers[performerCount++] = performer;
		} else {
			System.out.println("Cannot add additional performers to " + getTitle());
		}
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
