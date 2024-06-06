import com.google.gson.annotations.SerializedName;

public class Moneda {

    @SerializedName("base_code")
    public String fromCurrency;

    @SerializedName("target_code")
    public String toCurrency;

    @SerializedName("conversion_rate")
    public double tasaConversion;

    @SerializedName("conversion_result") double resultado;


    public void showConversion(){
        System.out.println("la Moneda: "+ this.fromCurrency + "; convertida a: " + this.toCurrency +
                "; tiene una tasa de conversión de: " + this.tasaConversion + "; dando como Resultado: " + this.resultado);
    }
}
