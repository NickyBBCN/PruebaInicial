package certificationInitial.stepdefinitions;

import Inicial.tasks.*;
import Inicial.userinterface.JointodayData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.jruby.util.Join;

public class StepDefinitions {

  @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Tell us about yourself Let's start setting up your account\\. We ask your age to ensure we meet privacy laws and it also helps brands reach out to the exact people they need to help them\\. Similarly, telling us any languages you speak aside from English can make you eligible for more opportunities\\.All fields except \"([^\"]*)\" are required\\.Add your addressBy telling us where you live, you enable our customers to truly test their products and software throughout the globein the hands of real people like you\\. All fields required\\.$")
    public void tellUsAboutYourselfLetSStartSettingUpYourAccountWeAskYourAgeToEnsureWeMeetPrivacyLawsAndItAlsoHelpsBrandsReachOutToTheExactPeopleTheyNeedToHelpThemSimilarlyTellingUsAnyLanguagesYouSpeakAsideFromEnglishCanMakeYouEligibleForMoreOpportunitiesAllFieldsExceptAreRequiredAddYourAddressByTellingUsWhereYouLiveYouEnableOurCustomersToTrulyTestTheirProductsAndSoftwareThroughoutTheGlobeinTheHandsOfRealPeopleLikeYouAllFieldsRequired(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Nicole Bermudez").wasAbleTo(OpenUp.thePage(),(Jointoday1.OnThePage()));
        OnStage.theActor("Bogota").wasAbleTo(OpenUp.thePage(),(Jointoday2.OnThePage()));


    }

    @When("^Tell us about your devices you participate in uTest projects, you need to have at least one device that you perform the test on\\. Please list a device \\(the more devices you have, the more invitations to projects you receive\\)\\.$")
    public void tellUsAboutYourDevicesYouParticipateInUTestProjectsYouNeedToHaveAtLeastOneDeviceThatYouPerformTheTestOnPleaseListADeviceTheMoreDevicesYouHaveTheMoreInvitationsToProjectsYouReceive() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActor("Windows").wasAbleTo(OpenUp.thePage(),(Jointoday3.OnThePage()));
        OnStage.theActorInTheSpotlight().attemptsTo(Jointoday3.the(JointodayData.get(0)));

    }

    @Then("^The last step Almost done! Please create a password for your account\\. Then review and accept our terms of use, code of conduct, and privacy & security policy to complete the setup process\\.$")
    public void theLastStepAlmostDonePleaseCreateAPasswordForYourAccountThenReviewAndAcceptOurTermsOfUseCodeOfConductAndPrivacySecurityPolicyToCompleteTheSetupProcess() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActor("Password").wasAbleTo(OpenUp.thePage(),(Jointoday4.OnThePage()));
    }

}
