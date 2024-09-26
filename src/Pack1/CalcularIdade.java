package Pack1;

import java.time.LocalDate;
import java.time.Period;

public class CalcularIdade {
    public int calcularIdade(LocalDate dataNascimento){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento,dataAtual).getYears();
    }

}
