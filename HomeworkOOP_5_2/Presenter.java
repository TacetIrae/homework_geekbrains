import java.util.List;
public class Presenter {
    private NotesModel model;
    private ViewNotes view;

    public Presenter(NotesModel model, ViewNotes view){
        this.model = model;
        this.view = view;
    }
    public void addNotes(){
        String notes = view.getNotes();
        model.addNotes(notes);
        view.clearNotes();
    }

    public void displayNotes(){
        List<String> notes = model.getNotes();
        view.showNotes(notes);
    }
    public void updateNote(){
        int index = view.getNotesIndex();
        String newNote = view.getNotes();
        boolean success = model.updateNotes(index,newNote);
        if(success){
            view.showSuccessOperation("Запись была обновлена");
        }else {
            view.showErrorOperation("Некорректрый индекс");
        }
    }
    public void deleteNotes(){
        int index = view.getNotesIndex();
        boolean success = model.deleteNotes(index);
        if(success){
            view.showSuccessOperation("Запись успешно удалена");
        }else{
            view.showErrorOperation("Некорекстный индекс для удаления записи");
        }
    }
}
