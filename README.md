# PotterManíacos Games v2

**PotterManíacos Games v2** é uma coletânea de 14 jogos de manipulação de palavras, inspirados no universo mágico de Harry Potter. Desenvolvido em Java, o projeto transforma palavras escolhidas pelos jogadores de maneiras criativas e diversas, explorando lógicas textuais e padrões diferentes.

## Jogos Disponíveis

O projeto conta com os seguintes jogos:

1.  **Acróstico**: Gera um acróstico usando cada letra da palavra inicial como início de novas palavras.
    
- Entrada: "Teste"
- Saída:
        

> Transfiguração
> Episkey
> Sectumsempra
> Trasgo
> Expecto

        
2.  **Compor**: Constrói a palavra letra por letra.
    
- Entrada: "Teste"
- Saída:

> T
> Te
> Tes
> Test
> Teste

        
3.  **Compor Decompor**: Monta a palavra letra por letra e depois a desmonta.
    
- Entrada: "Teste"
- Saída:

> T  
> Te  
> Tes  
> Test  
> Teste  
> Test  
> Tes  
> Te  
> T

        
4.  **Decompor**: Desmonta a palavra, retirando uma letra por vez.
    
- Entrada: "Teste"
- Saída:

> Teste
> Test
> Tes 
> Te
> T

        
5.  **Decompor Compor**: Desmonta a palavra e depois a reconstrói.
    
- Entrada: "Teste"
- Saída:

> Teste
> Test
> Tes
> Te
> T
> Te
> Tes
> Test
> Teste

        
6.  **Desmembrando**: Exibe a palavra retirando uma letra inicial por vez.
    
- Entrada: "Teste"
- Saída:

> Teste
> este
> ste
> te
> e

        
7.  **Espelho**: Mostra a palavra invertida.
    
- Entrada: "Teste"
- Saída:

> etseT

        
8.  **Geminio**: Duplica cada letra da palavra.
    
- Entrada: "Teste"
- Saída:

> TTeessttee

        
9.  **Maldito Teto**: Exibe a palavra em letras maiúsculas e a desmonta.
    
- Entrada: "Teste"
- Saída:
       
> TESTE  
> TEST  
> TES  
> TE  
> T

        
10.  **Pontilhado**: Adiciona pontos entre as letras da palavra.
    
-   Entrada: "Teste"
-   Saída:

> T.e.s.t.e.

        
11.  **Separador**: Insere espaços entre as letras.
    
-   Entrada: "Teste"
-   Saída:

> T e s t e


12.  **T9**: Converte a palavra em números seguindo o padrão dos teclados de celulares antigos.
    
-   Entrada: "Teste"
-   Saída:

> 83783

13.  **Torre Dupla**: Repete cada letra duas vezes, uma em cada linha.
    
- Entrada: "Teste"
- Saída:

> TT
> EE
> SS
> TT
> EE

        
14.  **Zig Zag**: Organiza as letras em uma forma ziguezagueada.

- Entrada: "Teste"
- Saída:

>      T  
>        e  
>      s  
>        t  
>      e

 
        

## Requisitos

-   **Java JDK 8+**
-   **Terminal ou Prompt de Comando**

## Como Usar

1.  Clone o repositório:
        
    `git clone https://github.com/jnbdotdev/PotterManiacos-Games-v2.git` 
    
2.  Navegue até o diretório do projeto:
    
    `cd PotterManiacos-Games-v2` 
    
3.  Compile os arquivos Java:
    
    `javac *.java` 
    
4. Execute o programa criando uma instância da classe `GameModel` e chamando o método correspondente ao jogo desejado.
    
Por exemplo, no terminal ou dentro de uma IDE:

    public class Main {
    	public static void main(String[] args) {
    		GameModel game = new GameModel();
    
        // Exemplos de execução:
        System.out.println(game.acrostico("Teste"));
        System.out.println(game.espelho("Teste"));
    	}
    }

2.  Substitua `"Teste"` pela palavra desejada e o método pelo jogo que você quer executar!
    
Observação: Em breve criarei uma interface gráfica para uso mais simplificado.
## Licença

Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.
