## Template Method

### Classificação

- É um padrão comportamental que define a estrutura de um algoritmo na superclasse e permite que subclasses modifiquem esse algoritmo sem alterar a estrutura da superclasse.

### Intenção

- Permitir a reutilização de um esqueleto previamente já definido. 

### Aplicação

- Pode ser utilizado em cenários onde exista uma hierarquia de classes com um algoritmo que precisará ser divido em etapas, cenários com geradores automáticos de código, situações onde alterações no código possam ser realizadas de forma generica ou especifica em cada componente. 

### Estrutura

- A estrutura do Template Method consiste na criação de uma superclasse com parte dos métodos imutáveis e comuns a todas as subclasses variantes.

### Participantes

- Framework Class: define o templateMethod que é responsável por chamar os demais métodos, e especifica os métodos abstratos das etapas de execução. 
- ApplicationClassOne/ApplicationClassTwo: redefine quando necessário algumas etapas do algoritmo especificado em FrameworkClass. 


### Implementação

Nesta [implementação](https://github.com/diabrantes/ProgramacaoAvancadaCCO/tree/master/Composite/exemplo) o composite foi utilizado para que fosse desenvolvido um sistema de arquivos contendo pastas e arquivos, onde é possível navegar pela árvore para obter seus itens e tamanhos.

