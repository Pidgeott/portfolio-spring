package com.senac.adoportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CurriculoController {

    @GetMapping("/curriculo")
    public String getCurriculo(Model model) {
        model.addAttribute("nome", "Matheus Lima");
        model.addAttribute("cargo", "Data Analytics Intern");
        model.addAttribute("telefone", "+55 11 99528-7278");
        model.addAttribute("email", "matheusslima676@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/matheus-lima-b63173168/");
        model.addAttribute("github", "https://github.com/Pidgeott");


        model.addAttribute("curso1", "Análise e Desenvolvimento de Sistemas");
        model.addAttribute("instituicao1", "SENAC – São Paulo");
        model.addAttribute("curso2", "Técnico em Informática");
        model.addAttribute("instituicao2", "SENAC – São Paulo");


        model.addAttribute("idiomaNome", "Inglês");
        model.addAttribute("idiomaNivel", "Intermediário");





        // Sobre mim
        model.addAttribute("sobreMim", "" +
                " Prazer, meu nome é Matheus e sou apaixonado por tecnologia. Na interseção entre tecnologia e comunicação, encontro minha motivação. Tenho uma mente analítica e sou habilidoso\n" +
                "                na arte de comunicar, o que me permite navegar com eficiência no mundo da programação e ciência de dados.\n" +
                "                Além de compreender as nuances técnicas, posso converter esses detalhes em conceitos claros para\n" +
                "                diferentes públicos. Esta habilidade me capacita a extrair e comunicar insights de dados brutos,\n" +
                "                facilitando a colaboração e o entendimento em equipes variadas.");

        // Experiências profissionais
        model.addAttribute("empresa1", "Cielo");
        model.addAttribute("cargo1", "Estagiário");
        model.addAttribute("periodo1", "Período 08/2022 - Presente");
        model.addAttribute("descricao1", "" +
                "Atuo sob a Gerência da DDN no cargo de estagiário na Cielo, no qual sou responsável por\n" +
                "                    realizar análises detalhadas e extrair dados relevantes por meio dos sistemas internos da\n" +
                "                    empresa. Meu foco principal é fornecer suporte ao time comercial, auxiliando-os na\n" +
                "                    melhoria de indicadores e no alcance de metas estratégicas da organização.");

        model.addAttribute("empresa2", "Grupo Fleury");
        model.addAttribute("cargo2", "Operações");
        model.addAttribute("periodo2", "Período 04/2021 - 08/2022");
        model.addAttribute("descricao2", "" +
                "Atuei como Operador de Canais Digitais no Grupo Fleury, no qual desempenhei um papel\n" +
                "                    no atendimento a clientes internos e externos por meio dos canais digitais da empresa.\n" +
                "                    Durante esse período, trabalhei diretamente com as principais marcas pertencentes ao\n" +
                "                    Grupo Fleury, incluindo Amais SP, Amais PE, Instituto de Radiologia e CPC.");

        model.addAttribute("empresa3", "GOL - Linhas Aéreas Inteligentes");
        model.addAttribute("cargo3", "Jovem Aprendiz");
        model.addAttribute("periodo3", "Período 12/2018 - 05/2020");
        model.addAttribute("descricao3", "" +
                "Atuei na GOL Linhas Aéreas Inteligentes como Jovem Aprendiz. Minhas\n" +
                "                    responsabilidades incluíam a realização de testes manuais minuciosos nos sistemas\n" +
                "                    internos da companhia, bem como o auxílio no desenvolvimento de projetos de\n" +
                "                    automação.");

        // Competências
        model.addAttribute("competencias", " PL/SQL · C# · WordPress · GitHub · Programação orientada a objetos (POO) · Arquitetura MVC · Kanban · Trabalho em equipe · Banco de dados Oracle · MySQL · Java · Banco de dados · JavaScript · Microsoft Office · Microsoft Excel · Desenvolvimento de software · React Native · Power BI · Python · .NET · Xamarim");



        return "index1";
    }
}
