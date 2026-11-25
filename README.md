# Padrão Builder

Projeto de montagem de computadores. Uma máquina tem vários componentes
(processador, memória, armazenamento, placa de vídeo, fonte, gabinete e
sistema operacional), sendo que alguns são obrigatórios e outros opcionais.
O `ComputadorBuilder` permite montar o objeto passo a passo, de forma fluente,
e só entrega o computador no `build()` depois de validar que os itens
essenciais (processador e memória) foram informados.

## Conteúdo do repositório

- Código-fonte das classes `Computador`, `ComputadorBuilder` e a `Main` de demonstração
- Casos de teste JUnit cobrindo a construção válida, as validações e o encadeamento dos métodos
- Diagrama UML do padrão
