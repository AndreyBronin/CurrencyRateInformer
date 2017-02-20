package CurrencyRateInformer;

import com.beust.jcommander.Parameter;


public class CommandLineArgs {

    @Parameter(names="--from", description = "Currency from", required = true)
    String from;

    @Parameter(names="--to", description = "Currency to",  required = true)
    private String to;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
