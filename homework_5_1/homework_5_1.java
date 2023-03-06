import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class homework_5_1 {
    public static void main(String[] args) {
        functions func = new functions();
        func.add ("Крылов" , "+7-913-555-22-33");
        func.add ("Сыров" , "+7-913-333-22-33");
        func.add ("Акимов" , "+7-913-222-22-33");
        func.add ("Касаткин" , "+7-913-111-22-33");
        func.add ("Арестотель" , "+7-913-999-22-33");

        func.print("Крылов");

        func.addPhone("Крылов","+7-999-133-22-41");

        func.print("Крылов");

    }

}
