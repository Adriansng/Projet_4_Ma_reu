package mareu.adriansng.maru.service_api;

import java.util.List;

import mareu.adriansng.maru.model.MeetingRoom;
import mareu.adriansng.maru.model.Person;
import mareu.adriansng.maru.model.Reunion;

public interface ReunionApiService {


    //Reunion List

    /**
     * Get all reunion
     * @return {@link List}
     */
    List<Reunion> getReunions();

    //Id Reunion

    int getReunionSize();

    /**
     * get a single reunion by id
     *@param id
     */
    Reunion getReunion(int id);

    //Meeting Room

    /**
     * get a name meeting room by id
     *@param idMeetingRoom
     */
    String getNameMeetingRome(int idMeetingRoom);




    List<MeetingRoom> getMeetingRoom();

    //Address Mail

    //Filter
    List<Reunion> getFilterMeetingRoom(int idMeetingRoomFilter);
    List<Reunion> getFilterDate(String dateReunion);
    List<Reunion> getFilterMeetingAndDate(int idMeetingRoomFilter, String dateReunion);

    //Action

    /**
     * Deletes a reunion
     * @param reunion
     */
    void deleteReunion(Reunion reunion);

    //List Person
    List<Person> getPersonParticipant();



    /**
     * Add a reunion
     * @param newReunion
     */
    void addReunion(Reunion newReunion);

}
