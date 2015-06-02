/**
 * Created by Женя on 02.06.2015.
 */

/*As a user of the library catalogue,
I want advanced search options on the front page so that
I can quickly and easily refine my search.
I can limit the search by format/type.*/
public class SearchScenario {
    @Steps
    UserSteps user;
    @Given("user type in field advanced_search data")
    public void UserAPresent(String present) {
        user.opens_library_catalogue();

        }

        @When("user can refine search data")
                public void refineSearchData (String SearchData,String keyword, String region){
                buyer.chooses_region(region);
                buyer.chooses_category_and_keywords(category, keyword);
                buyer.performs_search();

        }

        @Then("she should obtain a list of $category ads containing the word $keyword \
              from advertisers in $region")
                public void resultsForACategoryAndKeywordInARegion(String category, String keyword, String region){
                buyer.should_only_see_results_with_titles_containing(keyword);
               buyer.should_only_see_results_from_region(region);
               buyer.should_only_see_results_in_category(category);

        }

    }
}
