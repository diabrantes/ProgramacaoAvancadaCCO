## Memento

### Classificação

- É um padrão de projeto comportamental que não viola o encapsulamento e permite capturar e externalizar um estado interno de um objeto, de maneira que o objeto possa ser restaurado para este estado posteriormente.

### Intenção

- Fornecer um mecanismo para permitir atender uma demanda de registrar um estado interno do objeto para a implementação de mecanismos de checkpoints e para desfazer operações em casos de erros, por exemplo. Neste cenário, o objetivo é atender a esta demanda sem violar o pricípio de encapsulamento da OO.

### Aplicação

- Cenários onde exista a necessidade de se criar pontos de reestruturação de estado de objetos, ou onde seja necessário permitir que o programa se recupere de erros.

### Estrutura

![Estrutura do Memento](https://refactoring.guru/images/patterns/diagrams/memento/structure1.png)

### Participantes

- Memento: classe que representa um snapshot contendo o estado de um objeto a ser estruturado em um Originador. Possui métodos para obter e definir o estado em que um Memento é encapsulado. 
- Originador: classe onde o estado do objeto é mantido. Também possui um método que define o seu estado atual com o estado de um determinado objeto Memento. 
- Caretaker: classe auxiliar responsável por armazenar e restaurar o estado do Originador por meio do objeto Memento. Embora mantenha os Mementos, nunca os modifica. 


### Implementação

Exemplo da [implementação](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Memento/exemplo).

