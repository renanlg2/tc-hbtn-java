# Fluxo da aplicação
##### 1 - Criação do ProcessadorVideo;
##### 2 - Registrar os canais (E-mail, Slack, SMS, Teams) -> ProcessadorVideo.registrarCanal -> Adiciona os registros na lista de canais contidas na classe ProcessadorVideo;
##### 3 - Criação do objeto de vídeo, com o nome e formato;
##### 4 - Passar o vídeo criado para o ProcessadorVideo (ProcessadorVideo.processar);
##### 5 - Processar o vídeo:
##### 5.1 - Iterar na lista de canais criados para o ProcessadorVideo instanciado;
##### 5.2 - A cada item dessa lista, chamar o método notificar para para gerar a mensagem de log;
##### 5.2.1 - Nessa notificação, é instanciado um objeto da classe Mensagem, passando o texto com o nome do arquivo e formato, e o tipo da mensagem;