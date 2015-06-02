/**
 * Created by Женя on 02.06.2015.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


    /*As a user of the library catalogue,
    I want advanced search options on the front page so that
    I can quickly and easily refine my search.
    I can limit the search by format/type.*/


    class LimitByFormat {
        public static void main(String[] args) {
            String btName="btng";
            String value="site.com";
            String searchBar="q";
            String material="";
            String format = "columns";
            String type = "Comics MS";


            Limit lim = new Limit();
            WebDriver driver = new FirefoxDriver();

            lim.Get_value(driver, value, searchBar);
            lim.Push_button(driver, btName, value, searchBar);
            lim.Format_search(driver, format, type, searchBar, value, btName);
            System.out.println(lim.Will_get_material(driver, material));


            }
        }






