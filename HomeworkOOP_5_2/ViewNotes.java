import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ViewNotes {
    private Scanner scanner;

    private Presenter presenter;

    public ViewNotes(){
        scanner = new Scanner(System.in);
    }
    public void setPresenter(Presenter presenter){
        this.presenter =presenter;
    }
    public String getNotes(){
        System.out.println("Введите запись, которую вы хотите записать:" );
        return scanner.nextLine();
    }
    public int getNotesIndex(){
        System.out.println("Введите индекс записи:");
        return scanner.nextInt();
    }
    public void clearNotes(){
        System.out.println("Успешное добавление записи");
    }
    public void showNotes (List<String> notes){
        System.out.println("Записанные записи:" );
        for(int i = 0; i<notes.size();i++){
            System.out.println(i+":"+notes.get(i));
        }
    }
    public void Menu(){
        System.out.println("Меню доступных функций:");
        System.out.println("1) Добавление новой записи");
        System.out.println("2)Показать записанные записи");
        System.out.println("3)Обновление известной записи");
        System.out.println("4)Удаление известной записи");
        System.out.println("5)Завершение программы");

    }
    public int getMenuChoice(){
        System.out.println("Введите выбранную вами функцию:");
        return scanner.nextInt();
    }
    public void showSuccessOperation(String msg) {
        System.out.println(msg);
    }
    public void showErrorOperation(String msg){
        System.out.println("ОШИБКА");
    }

}
