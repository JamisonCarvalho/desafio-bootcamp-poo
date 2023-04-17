import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso básico de Java.");
        curso1.setCargaHoraria(8);
//        System.out.println("\n" + curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso básico de JavaScript.");
        curso2.setCargaHoraria(8);
//        System.out.println("\n" + curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Aprenda mais sobre a linguagem Java, com nossa mentoria.");
        mentoria1.setData(LocalDate.now());
//        System.out.println("\n" + mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Aprenda mais sobre a linguagem JavaScript, com nossa mentoria.");
        mentoria2.setData(LocalDate.now());
//        System.out.println("\n" + mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco Pan e Dio Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Banco pan e DIO.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devJamison = new Dev();
        devJamison.setNome("Jamison");
        devJamison.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Jamison: " + devJamison.getConteudoInscritos());
        devJamison.progredir();
        devJamison.progredir();
        System.out.println("---");
        System.out.println("Conteudo Inscritos Jamison: " + devJamison.getConteudoConcluido());
        System.out.println("Conteudo Inscritos Jamison: " + devJamison.getConteudoInscritos());
        System.out.println("XP: " + devJamison.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devTiana = new Dev();
        devTiana.setNome("Tiana");
        devTiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Tiana: " + devTiana.getConteudoInscritos());
        devTiana.progredir();
        devTiana.progredir();
        devTiana.progredir();
        devTiana.progredir();
        System.out.println("---");
        System.out.println("Conteudo Inscritos Tiana: " + devTiana.getConteudoConcluido());
        System.out.println("Conteudo Inscritos Tiana: " + devTiana.getConteudoInscritos());
        System.out.println("XP: " + devTiana.calcularTotalXp());





















    }
}