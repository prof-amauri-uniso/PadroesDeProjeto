O padrão Observer.

Exemplo: Aplicativo Wheather monitoring.

Existem 3 partes principais para o aplictivo: o dispositivo físico que adquire os dados
reais, o objeto WheatherData, que monitora os dados vindos dos dispositivos e o visor,
que mostra aos usuários as condições meteorológicas.

A tarefa é criar um aplicativo que utilize o WeatherData para atualizar três exibições
de condições atuais, status meteorológico e uma previsão.

A classe WeatherData tem os métodos getTemperatura(), getHumidade() e getPressao() que 
sabem como obter esses dados dos equipamentos. É preciso implementar mudancaNasMedidas() 
para atualizar as visões.

Temos então:

 - A classe WheatherData tem métodos para obtenção dos valores de medição;
 - O método mudancaNasMedidas() é chamado sempre que dados de medição estão disponiveis.
 Não sabemos quem chama, mas ele é chamado.
 - Precisamos implementar três elementos de visualização com dados diferentes: estatisticas, 
 condições atuais e previsão;
 - O sistema deve ser expansivel, outros desenvolvedores podem criar novos elementos
 de exibição.
 
 **Definição do padrão Observer**
 O padrão observer define a dependência um-para-muitos entre objetos para que quando um 
 objeto mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente.
 
 
 _**Principio de projeto**_
 Busque desgigns levemente ligados entre objetos que interagem.
 
 Implementações:
  - branch v1.0-observer: primeira versão com o padrão sendo implementado sem suporte
  a recursos nativos no java.
  - branch v2.0-observer: implementação usando os recursos do java.
  
  O uso dos artefatos disponibilizados pelo java podem limitar as aplicações.
  Isso porque violamos o principio de programar para interfaces, já que Observable é 
  uma classe concreta que extendemos. 