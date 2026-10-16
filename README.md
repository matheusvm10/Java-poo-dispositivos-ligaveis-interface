# Projeto Dispositivos Ligáveis - Interfaces em Java
## Atividade da matéria de P.A.(Programação de Aplicativos)
## DS/SENAI-BA
Este projeto demonstra a utilização do conceito de **Interfaces** e **Abstração** em Java através de um contrato `Ligavel` implementado por diferentes dispositivos eletrónicos (`Lampada` e `Televisao`).

## Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Controlo de Versão:** Git & GitHub

## Conceitos de POO Aplicados
- **Interfaces (`interface`):** Definição de contratos genéricos que obrigam as classes que a implementam a fornecer código para os métodos abstratos `ligar()` e `desligar()`.
- **Implementação (`implements`):** Classes `Lampada` e `Televisao` fornecendo implementações concretas para os métodos estipulados pela interface.
- **Polimorfismo com Interfaces:** Manipulação de múltiplos objetos de tipos distintos através do tipo comum da interface (`Ligavel[]`).
- **Encapsulamento:** Controlo do estado interno do dispositivo através do atributo privado `ligada` e respetivo método getter.

## Como Executar
1. Clona este repositório: https://github.com/matheusvm10/Java-poo-dispositivos-ligaveis-interface.git
2. Abre o projeto no IntelliJ IDEA.
3. Executa a classe `Main.java`.
