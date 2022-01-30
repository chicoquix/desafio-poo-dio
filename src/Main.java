import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Java Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Vitor"+devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("Conteúdos concluídos de Vitor"+devVitor.getConteudosConcluidos());

        Dev devChico = new Dev();
        devVitor.setNome("Chico");
        devChico.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Chico"+devChico.getConteudosInscritos());
        devChico.progredir();
        System.out.println("Conteúdos concluídos de Chico"+devChico.getConteudosConcluidos());
    }
}
