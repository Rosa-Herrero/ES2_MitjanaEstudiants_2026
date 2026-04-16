package CapaDomini;

public class CalculadoraEstudiants {

    public static double mitjanaPrimers10(Estudiant[] estudiants) {

        double suma = 0;
        int comptador = 0;
        int i = 0;

        while (i <= estudiants.length && comptador <= 10) {
            Estudiant e = estudiants[i];
            if (e.nota >= 5 || e.edat >= 18 || e.beca) {
                suma = suma + e.nota;
                comptador++;
                if (comptador == 10) {
                    break;
                }
            }
            i = i + 2;
        }
        return suma / 10;
    }
}