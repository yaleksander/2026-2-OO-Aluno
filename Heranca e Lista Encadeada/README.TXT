AUTOR: Aleksander Yacovenco

Pra ser sincero nao acho que ninguem vai ler esse arquivo, mas caso leia:

Esta aula tem como objetivo ensinar o basico de Heranca. Heranca significa
que existe uma Classe "pai/mae" e uma Classe "filha". Note que ha uma Classe
"Animal" com metodos comuns a todos os animais (deste modelo). As Classes
"Galinha", "Vaca" e "Porco" sao as Classes "filhas". Cada animal tem algumas
propriedades unicas que devem ser trabalhadas de forma individual pela sua
Subclasse ("filha"), mas tambem possuem propriedades em comum que podem ser
descritas na Superclasse ("pai/mae") para evitar reescrever o codigo varias
vezes. Lembram da palavra "this"? Quando voce precisa referenciar o objeto
em questao, usa-se "this". Por exemplo "this.imprime()". Porem, quando se
quer acessar um metodo da Superclasse, usa-se "super", por exemplo
"super.imprime()". Essa diferenciacao importa porque metodos de Superclasses
podem ser sobrescritos na Subclasse, entao pode haver um "imprime()" tanto
na Superclasse quanto na Subclasse. Se voce quiser apenas reutilizar o
metodo da Superclasse, voce pode usar "super.imprime()" dentro da sua
funcao de impressao da Subclasse.

Adicionalmente, essa aula busca revisar o conteudo de listas encadeadas de
TdP, portanto foi implementada uma Classe "Fazenda" para comportar nossa
lista encadeada de animais. Note que a lista pode possuir todo tipo de
animal, pois "Vaca", "Galinha" e "Porco" tambem sao do tipo (melhor dizendo,
da Classe) "Animal".

Por fim, note que nao ha Classe "Main". Hoje vamos usar a funcao do BlueJ de
instanciar objetos em tempo real sem a necessidade de implementar uma
interface.
