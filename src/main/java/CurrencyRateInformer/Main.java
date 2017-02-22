package CurrencyRateInformer;

import com.beust.jcommander.*;

import java.util.List;

/**
 * Main application class
 */
public class Main {

    private static final String ERROR_MESSAGE_UNKNOWN_CURRENCY = "Unknown currenсy eror.";
    private static final String ERROR_LABEL = "Application get error: ";
    private static final String LIST_LABEL = "Currency list: ";
    private static final String PROVIDERS_LABEL = "Providers list: ";
    private static final String RATE_LABEL_FORMAT = "%s => %s rate is %s \n";

    public static void main(String[] args) {

        CommandLineArgs cliParams = new CommandLineArgs();
        JCommander jCommander = new JCommander(cliParams);

        try {
            jCommander.parse(args);
        } catch (ParameterException e) {
            System.out.println(ERROR_LABEL + e.getLocalizedMessage());
            System.out.println();
            jCommander.usage();
        }

        if (cliParams.isHelp())
        {
            jCommander.usage();
            System.exit(0);
        }

        if (cliParams.isProviders())
        {
            System.out.println(PROVIDERS_LABEL + CurrencyProviderFactory.getProvidersList().toString());
            System.exit(0);
        }

        try {
            //if provider is not specified, default used
            CurrencyProvider provider = CurrencyProviderFactory.create(cliParams.getProvider());

            List<String> currencyList = provider.GetCurrencyList();
            if (cliParams.isList())
            {
                System.out.println(LIST_LABEL + currencyList.toString());
                System.exit(0);
            }

            if (currencyList.contains(cliParams.getFrom()) && currencyList.contains(cliParams.getTo()))
            {
                String rate = provider.GetRate(cliParams.getFrom(), cliParams.getTo());
                System.out.printf(RATE_LABEL_FORMAT, cliParams.getFrom(), cliParams.getTo(), rate);

                System.exit(0);
            }
            else
            {
                System.out.println(ERROR_MESSAGE_UNKNOWN_CURRENCY);
                System.exit(-1);
            }
        }
        catch (Exception e) {
            System.out.println(ERROR_LABEL + e.getLocalizedMessage());
            System.exit(-1);
        }
    }
}
