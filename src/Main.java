import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Dev dev01 = new Dev("Juca");
        Dev dev02 = new Dev("Miriel");

        // System.out.println("\nListagem de cursos inscritos do Dev (" + dev01.getNome() + "): " + dev01.getConteudosInscritos() + "\n - Listagem de cursos concluidos: " + dev01.getConteudosConcluidos());
        
        // System.out.println("\nListagem de cursos inscritos do Dev (" + dev02.getNome() + "): " + dev02.getConteudosInscritos() + "\n - Listagem de cursos concluidos: " + dev02.getConteudosConcluidos());
        
        Curso curso01 = new Curso("Curso Java", "Descrição Curso Java", 8);
        Curso curso02 = new Curso("Curso Javascript", "Descrição Curso Javascript", 8);
        
        // System.out.println(curso01);
        // System.out.println(curso02);
        // System.out.println("XP_PONTUAÇÃO (CURSO): " + curso01.calcularXp());
        
        Mentoria mentoria01 = new Mentoria("Mentoria Java", "Descrição Mentoria Java", LocalDate.now());
        Mentoria mentoria02 = new Mentoria("Mentoria Javascript", "Descrição Mentoria Javascript", LocalDate.now());
        
        // System.out.println(mentoria01);
        // System.out.println(mentoria02);
        // System.out.println("XP_PONTUAÇÃO (MENTORIA): " + mentoria01.calcularXp());
        
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria01);
        bootcamp.getConteudos().add(mentoria02);
        
        System.out.println("\n-------- BOOTCAMP JAVA DEVELOPER -------- \n\nData de inicio: " + bootcamp.getDataInicio() + "\nData final: " + bootcamp.getDataFinal());
        
        // System.out.println("\nConteúdos do Bootcamp:\n" + bootcamp.getConteudos());
        
        dev01.inscreverBootcamp(bootcamp);
        dev02.inscreverBootcamp(bootcamp);
        
        // System.out.println("\nListagem de cursos inscritos do Dev (" + dev01.getNome() + "): " + dev01.getConteudosInscritos() + "\n - Listagem de cursos concluidos: " + dev01.getConteudosConcluidos());
        
        // System.out.println("\nListagem de cursos inscritos do Dev (" + dev02.getNome() + "): " + dev02.getConteudosInscritos() + "\n - Listagem de cursos concluidos: " + dev02.getConteudosConcluidos());
        
        // System.out.println("\nDevs inscritos no Bootcamp:\n" + bootcamp.getDevsInscritos() + "\n");
        
        dev01.progredir();
        dev01.progredir();
        dev01.progredir();
        dev01.progredir();

        System.out.println("");

        dev01.progredir();
        dev01.progredir();
        dev01.progredir();

        System.out.println("\nListagem de cursos inscritos do Dev (" + dev01.getNome() + "): " + dev01.getConteudosInscritos());
        
        System.out.println("\nDev (" + dev01.getNome() + "), total de XP: " + dev01.calcularTotalXp());

        System.out.println("\nListagem de cursos concluidos: " + dev01.getConteudosConcluidos());
    }
}
