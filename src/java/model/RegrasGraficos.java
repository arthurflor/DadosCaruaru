package model;

import java.util.ArrayList;

/**
 * Classe que pega todo o código para criar uma página dinâmica com um gráfico com os dados.
 * @author Iago Richard Rodrigues
 */
public class RegrasGraficos {

    /**
     * Este método cria todo código.
     * @param consulta Dados do resultado da consulta SPARQL.
     * @param query Valor do Dataset que está sendo solicitado para exibição do gráfico.
     * @return String - Retorna todo o código necessário para exibição do gráfico em uma String.
     */
    public String getScriptGraph(ArrayList<ArrayList> consulta, String query) {

        String titulo = "";
        String varVertical = "";
        String varHorizontal = "";
        String varLinha = "";
        boolean graficoEnorme;
        
        // código a seguir se refere a algumas das variáveis que estarão presentes do script, depende do dataset
        if (query.equals("MEDIA_DE_ESCOVACAO_BUCAL_SUPERVISIONADA")) {
            titulo = "Escovação buscal supervisionada";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_MAMOGRAFIAS_REALIZADAS")) {
            titulo = "Número de mamografias realizadas";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NASCIDOS_VIVOS_POR_LOCAL_E_MES")){
            titulo = "Número de nascidos vivos por local";
            varVertical = "Quantidade";
            varHorizontal = "Local";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NASCIDOS_VIVOS_POR_TIPOS_DE_PARTO")){
            titulo = "Número de nascidos vivos por tipos de parto";
            varVertical = "Quantidade";
            varHorizontal = "Tipo de parto";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_AIDS_POR_CATEGORIA")){
            titulo = "Números de novos casos de AIDS por categoria";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_AIDS_POR_FAIXA_ETARIA")){
            titulo = "Número de novos casos de AIDS por faixa etária";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_DIABETES_TIPO_1")){
            titulo = "Número de novos casos de Diabetes Tipo 1";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_DIABETES_TIPO_2")){
            titulo = "Número de novos casos de Diabetes Tipo 2";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_HIPERTENSAO")){
            titulo = "Número de novos casos de Hipertensão";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_HIPERTENSOS_DIABETICOS")){
            titulo = "Número de novos casos de Hipertensos Diabéticos";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_NOVOS_CASOS_DE_SIFILIS")){
            titulo = "Número de novos casos de Sífilis";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_OBITOS_ACIDENTAIS")){
            titulo = "Número de Óbitos Acidentais";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_OBITOS_POR_DENGUE")){
            titulo = "Número de Óbitos por Dengue";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_OBITOS_PREMATUROS")){
            titulo = "Número de Óbitos Prematuros";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("NUMERO_DE_TESTES_DE_SIFILIS_EM_GESTANTES")){
            titulo = "Número de testes de Sífilis em Gestantes";
            varVertical = "Quantidade";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_ACOES_DA_VIGILANCIA_SANITARIA")){
            titulo = "Percentual de Ações da Vigilância Sanitária";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_ANALISE_DE_AGUA_REALIZADA")){
            titulo = "Percentual de Análise de Água realizada";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_CAES_VACINADOS")){
            titulo = "Percentual de Cães Vacinados";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_COBERTURA_DE_EQUIPE_DE_SAUDE_BUCAL")){
            titulo = "Percentual de Cobertura de Equipe de Saúde Bucal";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_COBERTURA_DO_SAMU")){
            titulo = "Percentual de Cobertura do SAMU";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_CURA_DE_NOVOS_CASOS_DE_HANSENIASE")){
            titulo = "Percentual de Cura de Novos Casos de Hanseníase";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_CURA_DE_NOVOS_CASOS_DE_TUBERCULOSE")){
            titulo = "Percentual de Cura de novos casos de Tuberculose";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_EXAMES_CITOPATOLOGICOS_DO_COLO_DO_ULTERO")){
            titulo = "Percentual de Exames Citopatológicos do Colo do Últero";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_EXODONTIA")){
            titulo = "Percentual de Exodontia";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else if (query.equals("PERCENTUAL_DE_PARTOS_NORMAIS")){
            titulo = "Percentual de Partos Normais";
            varVertical = "Percentual";
            varHorizontal = "Ano";
            graficoEnorme = false;
        } else {
            titulo = "Título Indefinido";
            varVertical = "Variável Vertical";
            varHorizontal = "Variável Horizontal";
            graficoEnorme = false;
        } 
        
        ArrayList<String> auxGet;
        for (int i = consulta.size()-1; i >=1; i--) {
            //atual: consulta.get(j).get(2).toString();
            //próximo: consulta.get(j+1).get(2).toString();    
            for (int j = 0; j < i; j++) {
                if(consulta.get(j).get(2).toString().compareTo(consulta.get(j+1).get(2).toString()) > 0){
                    auxGet = consulta.get(j);
                    
                    consulta.set(j, consulta.get(j+1));
                    consulta.set(j+1, auxGet);
                }
            }
        }
        

        //0 - sexo ; 1 - valor ; 2 - ano 
        String saida = ""; //saída para testes

        boolean achouColunas = false;
        ArrayList<String> linhas = new ArrayList<>();
        ArrayList<String> colunas = new ArrayList<>();
        ArrayList<String> valores = new ArrayList<>();

        for (int i = 0; i < consulta.size(); i++) {

            int aux = 0;
            if (consulta.get(i).get(0).toString().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
                consulta.remove(i); //removendo tripla chata
                //System.out.println("Removeu uma tripla chata.");
                i--; // se removeu, tem que diminuir 1 em i também, se não 1 dado vai ser engolido
                continue;
            } else {
                String str = consulta.get(i).get(1).toString().replaceAll("^^http", "//");
                String numberOnly = str.substring(0, 8).replaceAll("[^0-9]", "");
                valores.add(numberOnly);
                //saida += numberOnly + "<br>";
                String[] colunasSplit = consulta.get(i).get(0).toString().split("/");

                if (colunas.isEmpty()) {
                    colunas.add(colunasSplit[colunasSplit.length - 1]); //se estiver vazio, vai pegar o primeiro valor
                    //System.out.println("Adicionou primeiro elemento.");
                } else if (colunas.size() > 0 && achouColunas == false) { // se não estiver vazio, vai verificar se o elemento já foi adicionado

                    int j = 0;

                    for (j = 0; j < colunas.size(); j++) {
                        //System.out.println("Entrou no for de achar colunas.");
                        if (colunas.get(j).equals(colunasSplit[colunasSplit.length - 1])) {
                            achouColunas = true; //se o elemento estiver no array, seta achou colunas para true, achou todas as colunas
                            //System.out.println("Achou uma coluna igual, não pode ser adicionado.");
                            break;
                        } else {
                            aux++;
                        }
                    }

                    if (j == aux) { //se o elemento não estiver no array, adicione no array
                        colunas.add(colunasSplit[colunasSplit.length - 1]);
                        System.out.println("Coluna " + colunasSplit[colunasSplit.length - 1] + " adicionada!");
                        //saida += colunasSplit[colunasSplit.length-1]+"<br>"; //length-1: último elemento do array
                        //System.out.println("Coluna "+consulta.get(i).get(0).toString()+" adicionada com sucesso!" );
                    }
                } // fecha if - else de colunas

            } //fecha if - else principal

        } //fecha for

        colunas.remove(colunas.size() - 1);// tá inserindo uma coluna replicada, nem sei porque mas tudo bem: EU APAGO!
        int quantidadeColunas = colunas.size();

        for (int i = 0; i < consulta.size(); i++) {
            String[] linhaSplit = consulta.get(i).get(2).toString().split("/");
            linhas.add(linhaSplit[linhaSplit.length-1]);
            System.out.println("linha adicionada: "+ linhaSplit[linhaSplit.length-1]);
            //saida += linhaSplit[4] + "<br>";
            i += quantidadeColunas - 1; // os próximos i's terão as mesmas linhas, a estratégia foi pegar o valor de colunas e pular, indo assim para pŕoxima linha
        } // fecha for

        /*
        int y=0;
        for (int i = 0; i < linhas.size(); i++) {
            for (int j = 0; j < colunas.size(); j++) {
                saida += linhas.get(i) + " " + colunas.get(j) + " " + valores.get(y) + "<br>";
                y++;
            }
            saida+="<br>";
        }*/
        
        String graficoSaida = "\n"
                + "    <script type=\"text/javascript\">\n"
                + "      google.charts.load('current', {'packages':['corechart']});\n"
                + "      google.charts.setOnLoadCallback(drawVisualization);\n"
                + "\n"
                + "\n" // início do script
                + "      function drawVisualization() {\n"
                + "        var data = google.visualization.arrayToDataTable([\n"; //outra parte do script

        int k = 0;

        String graficoFinal = "";
        
        ArrayList<String> linhasTabela = new ArrayList<>();
        
        String cabecalhoTabela = "         ['" + varHorizontal + "',"; //primeira linha - indicando variável
        for (int i = 0; i < colunas.size(); i++) {
            if (i < colunas.size() - 1) { //se não for o último da coluna, imprima de uma forma
                cabecalhoTabela += " '" + colunas.get(i) + "',";
            } else { //se for, imprima de outra forma
                cabecalhoTabela += " '" + colunas.get(i) + "'],\n";
            }
        }

        for (int i = 0; i < linhas.size(); i++) { // +1 pra poder colocar a linha que indica as variáveis
            String linhaTabela = "";
            linhaTabela += "         ['" + linhas.get(i) + "',"; //linha qualquer - indicando o valor da linha
            for (int j = 0; j < colunas.size(); j++) {
                if (j < colunas.size() - 1) { //se não for o último da coluna, imprima de uma forma
                    linhaTabela += " " + Integer.parseInt(valores.get(k)) + ",";
                } else { //se for o último da coluna e estiver na ultima linha, imprima de outra forma
                    linhaTabela += " " + Integer.parseInt(valores.get(k)) + "]";
                }
                k++; //incrementa o k
            }
            linhasTabela.add(linhaTabela);
        }
        
        for (int i = 0; i < linhasTabela.size(); i++) {
            
            if(i==0){
                graficoFinal += graficoSaida;
                graficoFinal += cabecalhoTabela;
            }
            
            if(i<linhasTabela.size()-1){
                graficoFinal += linhasTabela.get(i) + ",\n";
            }
            
            if(i==linhasTabela.size()-1){
                graficoFinal += linhasTabela.get(i) + "\n";
                graficoFinal += "      ]);\n"
                + "\n"
                + "    var options = {\n"
                + "      title : '" + titulo + "',\n"
                + "      vAxis: {title: '" + varVertical + "'},\n"
                + "      hAxis: {title: '" + varHorizontal + "'},\n"
                + "      seriesType: 'bars',\n"
                + "      series: {20: {type: 'line'}}\n"
                + "    };\n"
                + "\n"
                + "    var chart = new google.visualization.ComboChart(document.getElementById('chart_div_"+1+"'));\n"
                + "    chart.draw(data, options);\n"
                + "  }\n"
                + "    </script>  <div id=\"chart_div_"+1+"\"></div>"
                + "<br><br><br><a href=\"fuseki/upload/n3/"+query+"/"+query+".n3\">Baixar Estes Dados em Arquivo de Formato N3</a>"; //fim do script;
            }
        }
        
        return saida + graficoFinal;
    }
}
