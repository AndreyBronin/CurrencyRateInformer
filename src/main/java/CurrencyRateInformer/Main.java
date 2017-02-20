package CurrencyRateInformer;

import com.beust.jcommander.*;

//currency exchange rates
public class Main {

    public static void main(String[] args) {

        CommandLineArgs cliParams = new CommandLineArgs();
        JCommander jCommander = new JCommander(cliParams);

        try {
            jCommander.parse(args);
        } catch (ParameterException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
            System.out.println();
            jCommander.usage();
        }


        System.out.println(cliParams.getFrom());
        System.out.println(cliParams.getTo());

/*
        CurrencyProvider provider = new FixerIoCurrencyProvider();

        List<String> currencyList = new ArrayList<String>();
        try{
            currencyList = provider.GetCurrencyList();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(currencyList);
*/
    }
}
