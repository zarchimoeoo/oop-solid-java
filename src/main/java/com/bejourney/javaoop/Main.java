package com.bejourney.javaoop;

import com.bejourney.javaoop.accesstest.*;

public class Main {
    public static void main(String[] args) {
        Center c1 = new Center ("Software Center");
        c1.showName();

        Department d1 = new Department("Business Analysis Department");
        d1.showName();

        System.out.println("********************************************");

        Employee employee1 = new Employee();
        employee1.setName("Zar Chi");

        OverTime overTime = new Employee();
        overTime.hours = 10;
        System.out.println("OT hour with abstract class variable testing: " + overTime.hours);

        if(employee1.hasOverTime()) {
            employee1.getOverTimeInfo();
        }else {
            System.out.println("This member cannot have OT money in this month.");
        }

        System.out.println("********************************************");

        Team mobileTeam = new MobileTeam();
        Team forntendTeam = new ForntendTeam();
        BackendTeam backendTeam = new BackendTeam();
        Team easyTeam = new EasyTeam();
        mobileTeam.createTeam();
        forntendTeam.createTeam();
        backendTeam.createTeam();
        easyTeam.createTeam();
        System.out.println();

        System.out.println("********************************************");

        MeetingRoom npwMeetingRoom = new MeetingRoom("NayPyiTaw Meeting Room", 15);
        MeetingRoom yangonMeetingRoom = new MeetingRoom("Yangon Meeting Room", 10);

        npwMeetingRoom.createMeetingRoom(npwMeetingRoom.getRoomName());
        npwMeetingRoom.bookMeetingRoom(npwMeetingRoom.getRoomName());
        npwMeetingRoom.showParticipants(npwMeetingRoom.getParticipants());
        npwMeetingRoom.bookCoffeeAndSnack();

        System.out.println("********************************************");

        yangonMeetingRoom.createMeetingRoom(yangonMeetingRoom.getRoomName());
        yangonMeetingRoom.bookMeetingRoom(yangonMeetingRoom.getRoomName());
        yangonMeetingRoom.showParticipants(yangonMeetingRoom.getParticipants());
        yangonMeetingRoom.bookCoffeeAndSnack();




    }
}