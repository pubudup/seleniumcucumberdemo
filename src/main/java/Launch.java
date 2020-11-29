import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;


public class Launch {

    public static void main(String[] args){
        System.out.println("Launching Tests...");

        org.junit.runner.JUnitCore.main("TestRunner");

        System.out.println("Tests Finished!");
    }

}
