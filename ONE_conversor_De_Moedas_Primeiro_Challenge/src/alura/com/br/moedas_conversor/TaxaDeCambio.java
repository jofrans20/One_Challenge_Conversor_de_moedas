package alura.com.br.moedas_conversor;

import java.util.Map;

public class TaxaDeCambio {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBase_code() {
        return base_code;
    }

    public double getConversion_rate(String targetCurrency) {
        return conversion_rates.getOrDefault(targetCurrency, 0.0);
    }
}

