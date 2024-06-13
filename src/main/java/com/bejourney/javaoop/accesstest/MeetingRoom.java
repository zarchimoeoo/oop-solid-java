package com.bejourney.javaoop.accesstest;

public class MeetingRoom implements CreateMeetingRoom, BookMeetingRoom, Snacks, Participants{
    private String roomName;
    private int participants;

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }


    public MeetingRoom(String roomName, int participants){
        this.roomName = roomName;
        this.participants = participants;
    }


    @Override
    public void bookMeetingRoom(String roomName) {
        System.out.println(roomName + " is already booked!");
    }

    @Override
    public void bookCoffeeAndSnack() {
        System.out.println("Coffee and snacks are already booked for the meeting day!");
    }

    @Override
    public void showParticipants(int participants) {
        System.out.println("All participants is "+ participants+ " members.");
    }

    @Override
    public void createMeetingRoom(String roomName) {
        System.out.println("Creating..."+ roomName);
    }
}
