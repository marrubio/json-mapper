package com.develop.app;

import java.io.File;

import com.develop.app.vo.RespuestaDw;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("######################## INI jackson-test ###############################");

        System.out.println("Creamos mapeador");
        ObjectMapper mapper = new ObjectMapper();

        RespuestaDw respuestaDw;
        //Staff staff;

        String fileName = "search-response_min.json";
        System.out.println("Cargamos " + fileName);            
        

        try {                        
            
            String file = App.class.getClassLoader().getResource(fileName).getFile();
            System.out.println(file);
            File fjson = new File(file);
            
            long start = System.currentTimeMillis();

            respuestaDw = mapper.readValue(fjson, RespuestaDw.class);
            
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            
            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(respuestaDw);            
            System.out.println(jsonInString2);

            System.out.println("Fin mapeo de json " + fileName + " a VO en " + timeElapsed + " ms" );            

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("######################## FIN jackson-test ###############################");

    }

}
