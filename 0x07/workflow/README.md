## Detalhes do Projeto

#### Interface CanalNotificacao
- Nessa Interface, nós temos o método notificar(), que deverá ser implementado nas classes que utilizarem essa interface, cada uma com a sua particularidade.
- O método notificar() servirá para escrever a mensagem no console, mostrando o tipo da mensagem, e seu conteúdo. 
  - Ex: "[SLACK] {LOG} - TEXTO MENSAGEM"

#### Classes que irão implementar a Interface CanalNotificacao (Email, Slack, Sms e Teams)
- Nessas Classes, terão as particularidades do método notificar(), que irá escrever no console a mensagem recebida como parâmetro

#### Classe Mensagem
- Irá receber o conteúdo da mensagem (texto livre) e tipo da Mensagem (AVISO,ERRO ou LOG)
- Essas informações serão posteriormente exibidas no console pela função notificar() que foi implementada nas classes citadas anteriormente

#### Classe Video
- Nesta classe, teremos os dados do vídeo como o nome do arquivo, e o formato
- Essas informações serão passadas para a Classe Mensagem, e essa será passada para o método notificar() (responsável por exibir as informações no console).

#### Classe ProcessadorVideo
- Esta classe terá uma lista de objetos que irá armazenar os canais passados pelo programa Program.java
- O método registrarCanal() irá receber um novo canal como parâmetro, e este será adicionado a essa lista mencionada anteriormente
- O método processar() irá percorrer essa lista de canais, e a cada item dessa lista será criada uma nova notificação pelo método notificar() (e este irá escrever a mensagem no console)
  public void processar(Video video){
   for (CanalNotificacao canal : canais){
     canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormatoVideo(), TipoMensagem.LOG));
   }
  }
    - Podemos observar atentamente ao método processar, que ele recebe como parâmetro uma variável tipo Video.
      Com este parâmetro, iremos conseguir obter os dados do vídeo, como nome do arquivo, e formato.      
    
    - No for, é passado uma variável do tipo CanalNotificacao como parâmetro que vai receber o conteúdo da lista de canais (for (CanalNotificacao canal : canais){}). 
      Este tipo CanalNotificacao é relacionado à Interface CanalNotificacao, e o utilizamos porque qualquer uma das classes 
      que implementarem a Interface CanalNotificacao terão que implementar o método notificar também, aplicando suas devidas particularidades.
      Portanto, ao chamarmos o método canal.notificar dentro do for, será chamado o método notificar da Classe que estiver sendo referenciada em cada item da lista de canais.
    - Ex:
      - Supondo que na lista de canais temos vários registros com os seguintes objetos:
      - Lista[0] = Sms
      - Lista[1] = Slack
      - Lista[2] = Teams
      - Lista[3] = Teams
    - Ao executarmos o for nessa lista, quando chamamos o método notificar, ele irá executar o método de acordo com o objeto da Classe que estiver na lista
    - O trecho que executa o seguinte comando canal.notificar() é executado implicitamente da seguinte forma:
      - Sms.notificar()
      - Slack.notificar()
      - Teams.notificar()
      - Teams.notificar()

