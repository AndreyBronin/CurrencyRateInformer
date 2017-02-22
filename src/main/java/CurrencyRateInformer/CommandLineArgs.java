package CurrencyRateInformer;

import com.beust.jcommander.Parameter;


public class CommandLineArgs {

    @Parameter(names={ "-h", "--help" }, description = "show usage")
    boolean help;

    @Parameter(names="--from", description = "Currency from")
    String from;

    @Parameter(names="--to", description = "Currency to")
    private String to;

    @Parameter(names="--list", description = "Currency list")
    private boolean list;

    @Parameter(names="--providers", description = "Api providers list")
    private boolean providers;

    @Parameter(names="--provider", description = "Api provider:")
    private String provider = "fixer.io";

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getProvider() {
        return provider;
    }

    public boolean isList() {
        return list;
    }

    public boolean isProviders() {
        return providers;
    }

    public boolean isHelp() {
        return help;
    }
}
