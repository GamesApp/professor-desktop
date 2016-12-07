/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaodb;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entidades.atividade.Atividade;
import entidades.pessoa.Aluno;
import entidades.pessoa.Professor;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author matheush
 */
public class RequisicaoHttp {
    private final String USER_AGENT = "Mozilla/5.0";
    private final String IP = "127.0.0.1";

    public RequisicaoHttp() {
    }
    
    //Método para verificar o login do professor
    public Professor loginProfessor(String email, String senha) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Professor/login/" +
                email + "/" + senha;
        
        String retornoJson = new RequisicaoHttp().sendGet(url);
        Professor professor;
        
        if (!retornoJson.equals("")) {
            professor = new Professor();
            Gson gson = new Gson();

            Type professorType = new TypeToken<Professor>() {}.getType();

            professor = gson.fromJson(retornoJson, professorType);
            
            return professor;
        } else {
            professor = null;
            
            return professor;
        }        
    }
    //http://localhost:8080/web-service/webresources/GamesApp/Professor/login/{email}/{senha}
    
    //Método para inserir um novo professor
    public void insertProfessor(Professor professor) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Professor/insert";
        
        Gson gson = new Gson();
        Type professorType = new TypeToken<Professor>() {}.getType();
        
        String professorJson = gson.toJson(professor, professorType);
        
        //System.out.println("Professor Json: " + professorJson);
        
        new RequisicaoHttp().sendPost(url, professorJson);
    }
    
    //Método para verificar o login do aluno
    public Aluno loginAluno(String email, String senha) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Aluno/login/" +
                email + "/" + senha;
        
        String retornoJson = new RequisicaoHttp().sendGet(url);
        Aluno aluno;
        
        if (!retornoJson.equals("")) {
            aluno = new Aluno();
            Gson gson = new Gson();

            Type alunoType = new TypeToken<Aluno>() {}.getType();

            aluno = gson.fromJson(retornoJson, alunoType);
            
            return aluno;
        } else {
            aluno = null;
            
            return aluno;
        }        
    }
    
    //Método para inserir um novo aluno
    public void insertAluno(Aluno aluno) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Aluno/insert";
        
        Gson gson = new Gson();
        Type alunoType = new TypeToken<Aluno>() {}.getType();
        
        String alunoJson = gson.toJson(aluno, alunoType);
        
        System.out.println("Aluno Json: " + alunoJson);
        
        new RequisicaoHttp().sendPost(url, alunoJson);
    }
    
    //Método para inserir um novo professor
    public void insertAtividade(Atividade atividade) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Atividade/insert";
        
        Gson gson = new Gson();
        Type atividadeType = new TypeToken<Atividade>() {}.getType();
        
        String atividadeJson = gson.toJson(atividade, atividadeType);
        
        System.out.println("Atividade Json: " + atividadeJson);
        
        new RequisicaoHttp().sendPost(url, atividadeJson);
    }
    
    //Método para buscar todas as atividades
    public ArrayList<Atividade> getAtividadeTodas() throws Exception {
        //http://localhost:8080/web-service/webresources/GamesApp/Atividade/get/todas
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Atividade/get/todas";
        
        String retornoJson = new RequisicaoHttp().sendGet(url);
        ArrayList<Atividade> atividades;
        
        if (!retornoJson.equals("")) {
            atividades = new ArrayList<>();
            Gson gson = new Gson();
            
            Type atividadesType = new TypeToken<ArrayList<Atividade>>() {}.getType();
            
            atividades = gson.fromJson(retornoJson, atividadesType);
            
            return atividades;
        } else {
            atividades = null;
            
            return atividades;
        }
    }

    //Método que faz requisição http via url
    private String sendGet(String url) throws Exception {
 
	//String url = "http://localhost:8080/RestExemplo01/webresources/generic/exemplojson/oi";
 
	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
	// optional default is GET
	con.setRequestMethod("GET");
 
	//add request header
	con.setRequestProperty("User-Agent", USER_AGENT);
 
	int responseCode = con.getResponseCode();
	System.out.println("\nSending 'GET' request to URL : " + url);
	System.out.println("Response Code : " + responseCode);
 
	BufferedReader in = new BufferedReader(
	    new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();
 
	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	in.close();
 
	//retorno resultado
	return response.toString();
    }
    
    //Método que envia dados via Post para o WebService
    private void sendPost(String url, String urlParameters) throws Exception {
 
	//String url = "https://selfsolve.apple.com/wcResults.do";
	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
	//add reuqest header
	con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
	con.setRequestProperty("User-Agent", USER_AGENT);
	con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
	//String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
 
	// Send post request
	con.setDoOutput(true);
	DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	wr.writeBytes(urlParameters);
	wr.flush();
	wr.close();
 
	int responseCode = con.getResponseCode();
	System.out.println("\nSending 'POST' request to URL : " + url);
	System.out.println("Post parameters : " + urlParameters);
	System.out.println("Response Code : " + responseCode);
 
	BufferedReader in = new BufferedReader(
	    new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();
 
	while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
	}
	in.close();
 
	//print result
	System.out.println(response.toString());
    }
}
