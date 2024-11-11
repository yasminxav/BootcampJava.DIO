import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devYas = new Dev();
        devYas.setNome("Yasmin");
        devYas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devYas.getConteudosInscritos());
        devYas.progredir();
        System.out.println("Conteudos Concluidos" + devYas.getConteudosConcluidos());
        System.out.println("XP: " + devYas.calcularTotalXp());


        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + joao.getConteudosInscritos());
        joao.progredir();
        System.out.println("Conteudos Concluidos" + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularTotalXp());



    }
}
