package CurrencyRateInformer;

import com.beust.jcommander.JCommander;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CommandLineArgsTest {
    private CommandLineArgs cliParams;
    private JCommander jCommander;

    @Before
    public void setUp() throws Exception {
         cliParams = new CommandLineArgs();
         jCommander = new JCommander(cliParams);
    }

    @After
    public void tearDown() throws Exception {
        cliParams = null;
        jCommander = null;
    }

    @Test
    public void parceParamsWithNoProvider() throws Exception {
        String args = "--from USD --to RUB";
        jCommander.parse(args.split(" "));

        assertEquals(cliParams.getProvider(), "fixer.io");
        assertEquals(cliParams.getFrom(), "USD");
        assertEquals(cliParams.getTo(), "RUB");
    }

}