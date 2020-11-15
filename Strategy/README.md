## Strategy

### Classificação

- É um padrão de projeto comportamental que delega responsabilidades, aumentando a coesão e aprimorando a comunicação entre objetos. Ele permite que o algoritmo varie independentemente dos clientes que irão utilizá-lo. 

### Intenção

- Permitir a definição de novos algoritmos sem alterar as classes dos elementos sobre os quais opera, facilitando a escolha dos algoritmos para determinada função.  

### Aplicação

- Cenários onde se tem muitas classes que se relacionam e que diferem no modo de atuação, ou quando existe a necessidade de variar o algoritmo de acordo com as condições da chamada. 

### Estrutura

![Estrutura do Strategy](https://refactoring.guru/images/patterns/diagrams/strategy/structure.png)

### Participantes

- Context: define e mantém a referência para uma classe strategy específica. 
- Strategy: interface (ou classe abstrata) comum a todos os algoritmos suportados. 
- ConcreteStrategy: um ou mais algoritmos fornecidos para a aplicação. 

### Implementação

Neste [exemplo](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Strategy/exemplo), o Strategy é usado para implementar os vários métodos de pagamento em uma aplicação de e-commerce. Depois de selecionar um produto para comprar, o cliente escolhe uma forma de pagamento: Paypal ou cartão de crédito.
