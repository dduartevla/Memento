import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CaretakerJogo {

    private List<MementoJogo> historico = new ArrayList<>();

    public void addMemento(MementoJogo memento){
        historico.add(memento);
    }

    public MementoJogo getMemento(int indice){
        if (indice < 0 || indice > historico.size()){
            throw new IllegalArgumentException("Índice inválido");
        }
        return historico.get(indice);
    }
}
