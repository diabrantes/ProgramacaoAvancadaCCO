## State

### Classificação

- É um padrão de projeto comportamental que permite que um objeto altere o seu comportamento quando o seu estado interno muda. 

### Intenção

- Permitir que o objeto possua diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com base no estado.  

### Aplicação

- Cenários onde é necessário gerenciar comportamentos diferentes dependendo de um número de estados diferentes.

### Estrutura

![Estrutura do State](https://refactoring.guru/images/patterns/diagrams/state/structure-pt-br.png)

### Participantes

- Context: define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do objeto.
- State: interface que possibilita emcapsular as responsabilidades associadas ao estado particular de cada contexto. 
- ConcreteState: um ou mais estados concretos que implementam a interface estado. 

### Implementação

Neste [exemplo](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/State/exemplo), o State permite que os mesmos controles do tocador de mídia se comportem de maneira diferente, dependendo do estado atual da reprodução.

