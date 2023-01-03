import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(("curso java"));
        curso1.setDescricao(("descrição curso java"));
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo(("curso js"));
        curso2.setDescricao(("descrição curso js"));
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição bootcamp java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscrito());
        devCamila.progredir();
        System.out.println();
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscrito());
        System.out.println();
        System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudosInscrito());

        System.out.println();
        System.out.println("------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscrito());
        devJoao.progredir();
        System.out.println();
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscrito());
        System.out.println();
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudosInscrito());
    }
}
