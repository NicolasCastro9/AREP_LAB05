package edu.escuelaing.arem.ASE.app;
import static spark.Spark.*;

public class SparkWebServer {
    
    public static void main(String... args){
          port(getPort());
          staticFiles.location("/public");
          get("hello", (req,res) -> "Hello Docker!");
          get("sin", (req,res) -> Math.sin(Double.parseDouble(req.queryParams("valor"))));
          get("cos", (req,res) -> Math.cos(Double.parseDouble(req.queryParams("valor"))));
          get("palindromo", (req,res) -> {
            String request = req.queryParams("valor");
            boolean espali = true;
            String result = "palindromo";

            for (int i = 0; i < request.length(); i++){
                if(!(request.charAt(i) == request.charAt(request.length() -1 -i))){
                    espali = false;
                    result = "no es palindormo :(";
                    break;
                }
            }
            return result;
          });
          get("vect",(req,res) -> {
            float num1 = Float.parseFloat(req.queryParams("num1"));
            float num2 = Float.parseFloat(req.queryParams("num2"));
            return Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2));
          });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}