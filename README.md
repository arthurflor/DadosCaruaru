## Desenvolvimento de um website de Dados Abertos Governamentais Utilizando Tecnologias Semânticas com Foco na cidade de Caruaru
### Universidade de Pernambuco - Campus Caruaru
#### Sistemas de Informação

#####Breve objetivo do projeto
Desenvolver um website que reúna dados abertos da Secretaria da Saúde de Caruaru e que tenha suporte à web semântica, visando à disponibilização de uma ferramenta que auxilie a participação da população na gestão pública.

###############

#####REQUISITOS

- Sistema operacional linux (para o servidor fuseki)

###############

#####INSTRUÇÕES

- Depois de extrair o projeto é necessário criar o diretório "/etc/fuseki" e dar permissões de escrita e leitura aos usuários para rodar o fuseki:
No terminal: $ sudo mkdir /etc/fuseki/ && sudo chmod 777 -R /etc/fuseki/

- Arquivos de configuração do fuseki (caso seja necessário uma autenticação no servidor fuseki)
Arquivo: /etc/fuseki/shiro.ini

###############

#####TECNOLOGIAS UTILIZADAS

- html, java web, javascript, glassfish

#####FORMATOS DE ARQUIVOS UTILIZADOS

- xls, trig, n3

#####BIBLIOTECAS UTILIZADAS

- jena, xlwrap, commons, fuseki-server

