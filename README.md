# ongs-repository

Passos para rodar e testar essa aplicação:
1. Suba a aplicação localmente clicando no botão play do arquivo principal do projeto.
2. A aplicação irá subir na porta default do Spring: 8080.
3. abra o console do h2 (banco em memória para poder visualizar as modificações feitas na API.
4. Abra o postman e utilize a rota default http://localhost:8080 + os paths para efetuar as operações de CRUD no serviço. A aplicação usa o protocolo HTTP,
então, tenha certeza de estar utilizando os métodos corretos bem como os paths.
5. Envie as requisições.
6. Para requisição de Post siga o esquema abaixo, como exemplo:
{
    "name": "Ong1234",
    "email": "ong1234@gmail.com"
}
