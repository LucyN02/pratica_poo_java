package cursos;

public class TestaCurso {
    public static void main(String[] arg){
        Curso curso1 = new Curso("Design Gráfico",
                "tecnólogo",
                "6 semestres" ,
                "graduação",
                250);
        curso1.visualizar();

        CursoLivre curso2 = new CursoLivre(
                "Java",
                "Aulas Extras",
                "100hr",
                "Curso Livre",
                200,
                "Alura");
        curso2.visualizar();

        CursoEspecialização curso3 = new CursoEspecialização(
                "Ciência da Computação",
                "Bacharelado",
                "8 semestres",
                "graduação",
                600,
                true
        );
        curso3.visualizar();
    }

}
