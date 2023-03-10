import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<Notebooks> set = new HashSet<>();
        set.add(new Notebooks("Ноутбук1:", 8, "Windows11", 80000, "HP"));
        set.add(new Notebooks("Ноутбук2:", 16, "Windows11", 85000, "Asus"));
        set.add(new Notebooks("Ноутбук3:", 32, "Sirena", 85000, "Apple"));
        set.add(new Notebooks("Ноутбук4:", 64, "Sirena", 190000, "Apple"));
        set.add(new Notebooks("Ноутбук5:", 32, "linux", 100000, "Lenovo"));
        set.add(new Notebooks("Ноутбук6:", 16, "linux", 80000, "Huawei"));
        set.add(new Notebooks("Ноутбук7:", 128, "Windows10", 250000, "Xiomi"));
        set.add(new Notebooks("Ноутбук8:", 64, "Windows11", 200000, "Alienware"));


        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}