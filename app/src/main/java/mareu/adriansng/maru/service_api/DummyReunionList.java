package mareu.adriansng.maru.service_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mareu.adriansng.maru.model.MeetingRoom;
import mareu.adriansng.maru.model.Person;
import mareu.adriansng.maru.model.Reunion;

public abstract class DummyReunionList {


    //Generate MeetingRoom
    public static List<MeetingRoom> DUMMY_MEETING_ROOM = Arrays.asList(
            new MeetingRoom(0,"Meeting Room A", true),
            new MeetingRoom(1, "Meeting Room B", true),
            new MeetingRoom(2, "Meeting Room C", true),
            new MeetingRoom(3, "Meeting Room D", true),
            new MeetingRoom(4, "Meeting Room E", true),
            new MeetingRoom(5, "Meeting Room F", true),
            new MeetingRoom(6, "Meeting Room G", true),
            new MeetingRoom(7, "Meeting Room H", true),
            new MeetingRoom(8, "Meeting Room I", true)
    );

    //Generate Person
    public static List<Person> DUMMY_PERSON= Arrays.asList(
            new Person(0,"Pierre","pierre@maReu.com"),
            new Person(1, "Manuel", "manuel@maReu.com"),
            new Person(2, "Bran", "bran@maReu.com")
    );

    public static List<Reunion> DUMMY_REUNION = Arrays.asList(
            new Reunion(0,2, "Henri", "10H00","05/12/20",Arrays.asList(DUMMY_PERSON.get(0),DUMMY_PERSON.get(1),DUMMY_PERSON.get(2))),
            new Reunion(1, 5, "Bernard", "10H30", "06/11/20",Arrays.asList(DUMMY_PERSON.get(0),DUMMY_PERSON.get(1),DUMMY_PERSON.get(2))),
            new Reunion(2,8, "Arnaud", "15H00", "05/25/20",Arrays.asList(DUMMY_PERSON.get(0),DUMMY_PERSON.get(1),DUMMY_PERSON.get(2)))
     );

    static List<Reunion> generateReunion() {
        return new ArrayList<>(DUMMY_REUNION);
    }
}

