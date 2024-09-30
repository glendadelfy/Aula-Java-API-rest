package br.com.fiap.Aula_300924;

import org.springframework.web.bind.annotation.*;

@RestController
public class Aula300924Controller {
    //Conexão tipo GET HTTP
    @RequestMapping("/hello")
    public String index() {return "<h1>Olá Mundo!</h1>";}

    //Conexão tipo GET HTTP
    @RequestMapping("/cadastro/{nome}")
    public String dizernome(@PathVariable String nome) { return "Olá, meu nome é " + nome; }

    //Conexão tipo GET HTTP
    @RequestMapping("/info")
    public String apresentar(@RequestParam("nome") String nome, @RequestParam("idade") int idade)
    { return "<h1>Olá pessoal, meu nome é " + nome + " eu tenho " + idade + " anos</h1>";}

    //Conexão tipo POST HTTP
    @PostMapping("/postar")
    public String postar() { return "Objeto postado com sucesso";}
}
