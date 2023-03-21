import java.util.ArrayList;
import java.util.List;

public class NotesModel {
    private List<String> notes;

    public NotesModel(){
        notes = new ArrayList<>();
    }
    public void addNotes(String note){
        notes.add(note);
    }
    public List<String> getNotes(){
        return notes;
    }
    public boolean updateNotes(int index, String newNote){
        if(index < 0 || index >= notes.size()){
            return false;
        }
        notes.set(index,newNote);
        return true;
    }
    public boolean deleteNotes(int index){
        if(index< 0 || index>= notes.size()){
            return false;
        }
        notes.remove(index);
        return true;
    }
}

