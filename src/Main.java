import controller.LojaController;
import view.VisaoLoja;

public class Main {
    public static void main(String[] args) {
        VisaoLoja view = new VisaoLoja();
        LojaController controller = new LojaController(view);
    }
}