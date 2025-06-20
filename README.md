# Projeto de Programação Avançada - Java

## Descrição
Este repositório contém exemplos de código Java desenvolvidos para a disciplina de Programação Avançada da Unicesumar. O projeto demonstra conceitos fundamentais de programação orientada a objetos em Java, incluindo herança, polimorfismo e desenvolvimento web com Servlets.

## Estrutura do Projeto

### Classes de Herança e Polimorfismo
- **Animal.java**: Classe base que define comportamentos comuns para animais
- **Cachorro.java**: Subclasse que estende a classe Animal e implementa comportamentos específicos
- **ProgramaPrincipal.java**: Classe principal que demonstra o uso das classes Animal e Cachorro

### Desenvolvimento Web
- **BemVindoServlet.java**: Exemplo de um Servlet Java que gera uma página HTML dinâmica

## Conceitos Demonstrados

1. **Herança**: Extensão da classe Animal pela classe Cachorro
2. **Polimorfismo**: Sobrescrita do método `fazerSom()` na subclasse
3. **Encapsulamento**: Uso de modificadores de acesso apropriados
4. **Servlets**: Criação de conteúdo web dinâmico usando Java

## Como Executar

### Para as Classes de Herança
```bash
# Compilar as classes
javac Animal.java Cachorro.java ProgramaPrincipal.java

# Executar o programa principal
java ProgramaPrincipal
```

### Para o Servlet
O servlet precisa ser implantado em um servidor de aplicações Java como Tomcat, Jetty ou GlassFish.

1. Compile o servlet
2. Empacote em um arquivo WAR
3. Implante no servidor de aplicações
4. Acesse via navegador em: http://localhost:8080/sua-aplicacao/bemvindo

## Requisitos
- Java JDK 8 ou superior
- Para o servlet: Servidor de aplicações Java (Tomcat, Jetty, etc.)

## Autor
[Seu Nome]

## Licença
Este projeto é disponibilizado sob a licença [escolha sua licença].