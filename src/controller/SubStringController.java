package controller;

public class SubStringController {
    public SubStringController() {
        super();
    }

    public String FuncSubString(String input, int inicio, int fim) {
        /*
          Condição de parada:
          Quando o fim for = 1, por consequência o inicio será igual a 0.
          Dessa forma, a função recursiva alcança o primeiro caracter disponível, já que ela começa
          Lendo do último ao primeiro caracter. Assim, chegando na sua condição de parada.
        */
        if (fim == 1) {
            return input.substring(inicio, fim);
        }

        return input.substring(inicio, fim) + FuncSubString(input, inicio - 1, fim - 1);
        /*
           A função funciona da seguinte forma, primeiramente ela recebe como parâmetros, de 3 variáveis criadas
           no main(). Uma String informada pelo usuário, uma varíavel que recebe o tamanho (posição do último
           caractere) e uma chamada inicio que recebe o valor do tamaho - 1.
           Assim, tendo a posição exata de cada caracter da palavra informada do usuário.

           Como se já obtem os dados da posição de cada string do último ao primeiro, a função recursiva somente
           concatena os caracteres do último ao primeiro, até que o fim seja igual a 1, e o inicio igual a 0, assim
           chegando na sua condição de parada e retornando a String de trás pra frente.
         */
    }
}
