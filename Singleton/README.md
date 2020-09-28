## Singleton

### Classificação

- É um padrão criacional que define que uma, e somente uma instância concorrente de uma classe irá existir no ciclo de vida da aplicação. 

### Intenção

- Evitar que múltiplas instâncias de uma mesma classe sejam criadas dentro do mesmo ciclo de vida da aplicação. 

### Aplicação

- Pode ser utilizado em casos onde é necessário controlar a forma com que a classe será instanciada, e em casos onde há uso em larga escala de um recurso em que se pode ter somente uma única instância, reduzindo problemas de referência. 

### Estrutura


### Participantes

- Singleton: é a única classe deste padrão, tendo o construtor privado (não é acessível externamente).
- Client: é o participante que usará o Singleton. Está ingressado na instância.

### Implementação

- [Implementação](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Singleton/exemplohttps://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Singleton/exemplohttps://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Singleton/exemplo) com base em um exemplo do artigo do site [refactoring.guru](https://refactoring.guru/pt-br/design-patterns/template-method/java/example)
