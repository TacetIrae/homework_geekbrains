public class PackageStarter {
    public static void main(String[] args) {
        ViewNotes viewNotes = new ViewNotes();
        NotesModel notesModel = new NotesModel();
        Presenter presenter = new Presenter(notesModel, viewNotes);
        viewNotes.setPresenter(presenter);
        int choice;
        do {
            viewNotes.Menu();
            choice = viewNotes.getMenuChoice();
                switch (choice) {
                    case 1:
                        presenter.addNotes();
                        break;
                    case 2:
                        presenter.displayNotes();
                        break;
                    case 3:
                        presenter.updateNote();
                        break;
                    case 4:
                        presenter.deleteNotes();
                        break;
                    case 5:
                        System.out.println("Спасибо, что исполььзовали наш не сильно удобный блокнот," +
                                "\n Мы обязательно изменим интерфейс к тому времени как у нас пояаиться разработчики FrontEnd");
                    default:
                        System.out.println("Такого тут тютю");
                        break;
                }
            }while(choice !=5);

        }
    }

