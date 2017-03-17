package br.com.incodee.components.manager;

import br.com.incodee.components.RestClient;
import br.com.incodee.components.exception.InvalidZenviaConfigsException;
import br.com.incodee.components.exception.RestClientException;
import br.com.incodee.components.exception.UnauthorizedException;
import br.com.incodee.components.exception.ZenviaPropertiesNotFoundException;
import br.com.incodee.components.request.MessageSmsElement;
import br.com.incodee.components.request.MultipleMessageSms;
import br.com.incodee.components.response.SendMultipleSmsResponse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/** Classe responsavel por gerenciar o envio de SMS com a api ZENVIA
 *  Possua em seu projeto um arquivo chamado zenvia.properties com as configuração de autenticação do zenvia.
 *  zenvia.user = login do zenvia
 *  zenvia.password = codigo/senha do zenzia
 *
 * Created by leandro.lima on 22/12/2016.
 */
public class ZenviaSMSManager {


    /** Metodo que envia SMS para uma lista de destinatarios.
     *
     *
     * @param mensagem texto a mensagem a ser enviada. maximo 130 caracteres.
     * @param listaDestinatarios lista com o numero de telefone celular dos destinarios. 5531999998888
     * @param dataAgendamento data para envio do SMS. Caso null envia imediatamente
     * @param aggregateId codigo de agrupamento de mensagens do zenvia
     * @param from remetente
     * @return
     * @throws IOException
     * @throws RestClientException
     * @throws ZenviaPropertiesNotFoundException
     * @throws InvalidZenviaConfigsException
     * @throws UnauthorizedException
     */
    public SendMultipleSmsResponse sendSms(String mensagem, List<String> listaDestinatarios, Date dataAgendamento,
                                           Integer aggregateId, String from)
            throws IOException, RestClientException, ZenviaPropertiesNotFoundException, InvalidZenviaConfigsException, UnauthorizedException {

        Properties properties = loadProperties();

        RestClient clientSms = configRestClientZenvia(properties);

        MultipleMessageSms smsMultElement = new MultipleMessageSms();

        addDestinatarios(mensagem, listaDestinatarios, dataAgendamento, smsMultElement, aggregateId, from);

        return enviarSmsZenzia(clientSms, smsMultElement);
    }


    /** Metodo que acessa a api do zenvia para envio dos SMSs
     *
     * @param clientSms
     * @param smsMultElement
     * @return
     * @throws RestClientException
     */
    private SendMultipleSmsResponse enviarSmsZenzia(RestClient clientSms, MultipleMessageSms smsMultElement) throws RestClientException, UnauthorizedException {

        try {
            return clientSms.sendMultipleSms(smsMultElement);
        } catch (RestClientException e) {
           throw e;
        }

    }

    /** Metodo que adiciona os destinatarios para o envio
     *
     * @param mensagem
     * @param listaDestinatarios
     * @param dataAgendamento
     * @param smsMultElement
     * @param aggregateId
     * @param from
     */
    private void addDestinatarios(String mensagem, List<String> listaDestinatarios, Date dataAgendamento,
                                  MultipleMessageSms smsMultElement, Integer aggregateId, String from) {

        for (String destinatario: listaDestinatarios){
            MessageSmsElement smsElement = new MessageSmsElement();
            smsElement.setMsg(mensagem);
            smsElement.setTo(destinatario);
            smsElement.setFrom(from);
            smsElement.setSchedule(dataAgendamento);
            smsMultElement.addMessageSms(smsElement);
            smsMultElement.setAggregateId(aggregateId);
        }
    }


    /** Metodo que configura o client do zenvia com os dados de autenticacao
     *
     * @param properties
     * @return
     */
    private RestClient configRestClientZenvia(Properties properties) throws InvalidZenviaConfigsException {
        RestClient clientSms = new RestClient();

        if (!properties.containsKey("zenvia.user") || !properties.containsKey("zenvia.password")){
            throw new InvalidZenviaConfigsException();
        }

        clientSms.setUsername(properties.getProperty("zenvia.user"));
        clientSms.setPassword(properties.getProperty("zenvia.password"));

        return clientSms;
    }


    /** Metodo que carrega o arquivo zenvia.proprities
     *
     * @return propriedades de configuracao do zenvia
     * @throws IOException
     */
    private Properties loadProperties() throws IOException, ZenviaPropertiesNotFoundException {
        Properties properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream resourceStream = loader.getResourceAsStream("zenvia.properties");

        if (resourceStream == null){
            throw new ZenviaPropertiesNotFoundException();
        }

        try {
            properties.load(resourceStream);
        } catch (IOException e) {
           throw e;
        }

        return properties;
    }


}
