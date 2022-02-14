package certificationInitial.stepdefinitions;

import Inicial.tasks.*;
import Inicial.model.JointodayData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.jar.JarEntry;

public class StepDefinitions {

  @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Tell us about yourself Let's start setting up your account\\. We ask your age to ensure we meet privacy laws and it also helps brands reach out to the exact people they need to help them\\. Similarly, telling us any languages you speak aside from English can make you eligible for more opportunities\\.All fields except \"([^\"]*)\" are required\\.Add your addressBy telling us where you live, you enable our customers to truly test their products and software throughout the globein the hands of real people like you\\. All fields required\\.$")
    public void tellUsAboutYourselfLetSStartSettingUpYourAccountWeAskYourAgeToEnsureWeMeetPrivacyLawsAndItAlsoHelpsBrandsReachOutToTheExactPeopleTheyNeedToHelpThemSimilarlyTellingUsAnyLanguagesYouSpeakAsideFromEnglishCanMakeYouEligibleForMoreOpportunitiesAllFieldsExceptAreRequiredAddYourAddressByTellingUsWhereYouLiveYouEnableOurCustomersToTrulyTestTheirProductsAndSoftwareThroughoutTheGlobeinTheHandsOfRealPeopleLikeYouAllFieldsRequired(List<JointodayData> jointodayData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo();
        OnStage.theActorCalled("Nicole Bermudez").wasAbleTo(OpenUp.thePage(),Jointoday1.OnThePage(jointodayData.get(0).getFirstname(),jointodayData.get(0).getLastname(),jointodayData.get(0).getEmail(),jointodayData.get(0).getDate()));
        OnStage.theActorCalled("Nicole Bermudez").wasAbleTo(OpenUp.thePage(),Jointoday2.OnThePage(jointodayData.get(0).getCity(),jointodayData.get(0).getPostal(),jointodayData.get(0).getCountry()));

    }

    @When("^Tell us about your devices you participate in uTest projects, you need to have at least one device that you perform the test on\\. Please list a device \\(the more devices you have, the more invitations to projects you receive\\)\\.$")
    public void tellUsAboutYourDevicesYouParticipateInUTestProjectsYouNeedToHaveAtLeastOneDeviceThatYouPerformTheTestOnPleaseListADeviceTheMoreDevicesYouHaveTheMoreInvitationsToProjectsYouReceive(List<JointodayData> jointodayData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActor("Windows").wasAbleTo(OpenUp.thePage(),(Jointoday3.OnThePage(jointodayData.get(0).getVersion(),jointodayData.get(0).getMobile(),jointodayData.get(0).getModel(),jointodayData.get(0).getComputer(),jointodayData.get(0).getLanguaje(),jointodayData.get(0).getOperating())));

    }

    @Then("^The last step Almost done! Please create a password for your account\\. Then review and accept our terms of use, code of conduct, and privacy & security policy to complete the setup process\\.$")
    public void theLastStepAlmostDonePleaseCreateAPasswordForYourAccountThenReviewAndAcceptOurTermsOfUseCodeOfConductAndPrivac0ySecurityPolicyToCompleteTheSetupProcess(List<JointodayData> jointodayData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActor("password").wasAbleTo(OpenUp.thePage(),(Jointoday4.OnThePage(jointodayData.get(0).getConfirmpass(),jointodayData.get(0).getAceptstay(),(jointodayData.get(0).getCreatepass()),jointodayData.get(0).getAceptutest(),jointodayData.get(0).getAceptpolity())));

    }

}
