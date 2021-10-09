# desafio_01
O desafio consiste em criar um sistema que insere dados em um banco de dados.
O sistema pega os dados concedidos pelo usuário e os insere num bando Mysql além de também pegar os dados e criar 
um relatório para a visualização rápida do usuário.
É um sistema bem simples de ser utilizado, com apenas 3 interfaces gráficas, sendo 1 delas apenas para servir de "menu"
para se chegar nas outras duas.

# DEPENDENCIAS

Aqui são coisas que você precisa para utilizar o sistema (a tabela do banco de dados e o Mysql Connector já estão inclusos).
*Apache NetBeans;
*Java 16;
*XAMPP;
*Mysql Connector (já incluso na pasta do projeto);
*Criação do Banco de dados e importação da tabela.

# CONFIGURAÇÃO DO BANCO DE DADOS E INSTALAÇÃO DO MYSQL CONNECTOR

Pra começar, precisamos iniciar o nosso servidor local, ligue o Xampp e ative os servidores "Apache" e "Mysql".
*no meu caso, como eu uso Linux eu inicio o servidor através do terminal.
![tuto1](https://user-images.githubusercontent.com/58312218/129583808-2af1ffa9-55fb-4853-a8b2-26294963157d.png)

Após iniciar o servidor acesse o endereço: http://localhost/phpmyadmin e clique em "New" (ou "Novo") para criar um novo banco de dados chamado "pesquisa".
*O NOME DO BANCO DE DADOS TEM QUE SER "pesquisa" (sem aspas) caso o contrário o programa não conseguira fazer a conexão com o banco.
![tuto2](https://user-images.githubusercontent.com/58312218/129583824-5b22e029-c0d4-4ec5-a697-d81d1d1d5a65.png)

Depois de ter criar o banco de dados, vamos importar nossa tabela, clique me no banco de dados, vá em "import" (ou "importar"), clique em "browse" (aqui você irá procurar o arquivo pesquisa.sql que foi fornecido junto com o código do programa) e depois clique em "Go" para finalizar a importação da tabela.
![tuto3](https://user-images.githubusercontent.com/58312218/129583871-1c7b6105-1284-4d7a-908c-369654e01be2.png)

Pronto! O banco de dados chamado "pesquisa" foi criado e a tabela "cliente" foi importada com sucesso.
[tuto4](https://user-images.githubusercontent.com/58312218/129583875-377273cd-2ade-47f7-9acf-9db49903c14e.png)

Agora vamos colocar o Mysql Connector para fazer com que o programa consiga ler e escrever os dados na tabela.
Para começar, abra o NetBeans (ou eclipse) e abra o código do Desafio.
Clique em Libraries com o botão direito e selecione "Add JAR/folder"
![tuto5](https://user-images.githubusercontent.com/58312218/129584130-de8ac033-4550-444c-911b-9d137cd6d0fa.png)

Dentro do Prompt que apareceu vá até o mysql-connector-java (localizado junto ao pesquisa.sql) o selecione e clique em "Ok"
![tuto6](https://user-images.githubusercontent.com/58312218/129584133-50d41afb-c362-42aa-92da-fdfa8c257e75.png)

Pronto, depois desses passos o está corretamente conectado com o banco de dados.

# UTILIZAÇÃO

Ao rodar o programa no NetBeans você irá se deparar com uma página inicial clique em "Pesquisa de Cliente" para abrir o Registro de Clientes ou o Relatório de Clientes.

![tuto7](https://user-images.githubusercontent.com/58312218/129586631-b89af889-bb1e-429a-8415-324bc7e1c8ef.png)

No Registro de Clientes você pode registrar clientes que participaram da Pesquisa apenas adicione o CPF e selecione as opções e o cliente será inserido no banco de dados.
![tuto9](https://user-images.githubusercontent.com/58312218/129586659-e4c7ad23-f98f-42b9-b603-b53134983000.png)

![tuto10](https://user-images.githubusercontent.com/58312218/129586689-6b08bd3f-1bd3-4224-af57-51b743e1d342.png)


No relatório de Clientes é possível ver as informações de clientes que participaram da pesquisa (O código do Cliente é adicionado automaticamente sempre que um cliente novo é registrado)
![tuto11](https://user-images.githubusercontent.com/58312218/129586700-184db129-7a87-4c39-b5f2-dc2f816a97f2.png)


