# 17/02/2023

# O que é engenharia de software?

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

### trade-offs example:
Negociação sobre os requisitos não funcionais
![image](https://user-images.githubusercontent.com/53665466/219641873-bfff00ec-ab38-4840-87fb-39fa1f1bd62c.png)


- Em um projeto de Engenharia de Software => Vida útil do software
  Com o desenvolvimento de novas tecnologias podemos encontrar novas soluções capazes de tornar a aplicação mais performática e consequentemente manter o software competitivo no mercado.

- Em relação a organização de um software => Escalabilidade e eficiência para o software que criamos bem como a organização de cria-lo em si.
  A utilização de métodos de organização e desenvolvimento como SCRUM são vitais para o sucesso de uma aplicação uma vez que quebra grandes tarefas(tasks) em tarefas menores, estipula um prazo mais realista e torna o desenvolvimento como um fluxo lógico a ser seguido. Focando os esforços em tarefas mais críticas até chegar em tarefas menos complexas.

- Como engenheiro de Software => A tomada de decisão é a habilidade mais crítica a ser desenvolvida uma vez que enfrentamos prazos imprecisos e uma escalabilidade difícil de ser mensurada.

- A fase de pesquisa e entendimento da aplicação é muitas vezes deixada de lado, ou não se dedica o devido tempo para realizá-la, o que acaba causando um grande impacto já em um estágio avançado do projeto.
É necessário adequar a tecnologia a o projeto e não o contrário.

## Engenharia de Software = Programação Envolvendo: Tempo, Escala e Trade-offs 
# 23/02/2023

# O que são Requisitos funcionais e não funcionais? 

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming  is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

 - A diferença entre programar e atuar como engenheiro de software:
  Podemos afirmar que as tarefas como engenharia de software são mais complexas e completas, sendo contemplados o ato de programar em si, modificar e manter um software. Enquanto a tarefa de programar(desenvolver ou escrever código) é uma tarefa única que contempla apenas uma parte do trabalho de um engenheiro de software. 
 - O que é programar:
  Programar está ligado a execução, obviamente é necessário analisar qual o tipo de entrada e os tipos de dados que iremos utilizar e qual será a saída após realizar alguma lógica. Contudo, nesse estágio já temos alguns detalhes definidos como: Linguagem a ser utilizada, framework, banco de dados, como será a saída.
  - Engenharia de software está ligado a planejamento, conhecer os requisitos de um projeto, escolher quais ferramentas melhor se adequa para resolução do problema proposto, DESENVOLVER a aplicação em si utilizando-se de algum padrão de design(ex: clean code), realizar modificações quando algum imprevisto surgir e essas modificações podem ser de ferramentas,frameworks etc. Por fim, realizar a manutenção nesse sistema que foi planejado e desenvolvido.
  ### Exemplo
  - API 1° Semestre:
   No semestre passado logo na primeira sprint 100% dos grupos entregaram a estrutura inicial dos projetos, essa estrutura continha o projeto funcional já com o framework flask, HTML e CSS;
   Acredito que nas sprints seguintes todos sentiram a falta de um bom planejamento em relação a definição das tecnologias a serem utilizadas e de  seguir um padrão de código( clean code ), no meu grupo por exemplo lembro que na última sprint o que se gastava mais tempo era entender o código de terceiros de modo a incluir alguma feature ou realização alguma manutenção.
   Tenho certeza que se eu mesmo olhar o código que escrevi a 3 meses atrás vou gastar um bom tempo tentando entender como está funcionando, e caso precise incluir alguma funcionalidade no sistema, seria bem complicado.

### Requisito == Necessidade do cliente(expressos como adjetivos: performance,usabilidade,segurança)
 - Requisito não funcional => Qualidade do software (Trade-offs: Performance, escalabilidade)
  Os requisitos não funcionais são aqueles que mostram a qualidade do sistema, é onde temos a diferenciação de empresas graças a uma aplicação ou sistema rápido, robusto, maintenível, seguro etc... Por exemplo: os requisitos funcionais de empresas como amazon e americanas são os mesmos! o que diferencia as empresas esta na qualidade do software desenvolvido. 
  
 - Requisito funcional => Tarefas do sistema(expressos como verbo funcionalidades do sistema) ex:(reservar quarto, fazer checkin)
 São os requisitos mais visuais, aqueles que a maioria dos clientes estão mais atentos por se tratar da interface visual, design etc.
 
# Desafio 24/02/2023
2 Exemplos de trade-offs envolvendo requisitos não funcionais:

Estágio => Escolha de ORM que fosse integrado ao NEXT.js e que pudesse ser utilizado diretamente no front-end, contudo esse ORM não suportava tipos 'geometry' e após uma semana atuando em uma feature é que percebemos esse problema. Este fato resultou em alguns dias perdidos para refatorar a aplicação, buscar outra alternativa e nos certificar que esse alternativa era válida para o que necessitavamos no momento.

API => Na escolha do banco de dados partimos para o MYSQL por ter mais recurso de aprendizado como: vídeos, documentação bem escrita, cursos etc.
Porém tivemos algumas dificuldades de inicio para conectar o banco a aplicação e lendo a documentação do framework flask( que era um requisito do projeto) percebemos que ele continha um integração com o banco sqlite3 onde a configuração era super simples, e o único ponto de atenção da própria ferramenta era em relação a escalabilidade, então migramos para o sqlite3 e conseguimos realizar toda a implementação do banco em 1 semana.
 
