@stories
Feature: Academy chicair
  As a user, I want to learn how to atomate un screamplay at the choucair Academy with the automation course
  @scenario1
  Scenario:  search for a automation course
    Given Tell us about yourself Let's start setting up your account. We ask your age to ensure we meet privacy laws and it also helps brands reach out to the exact people they need to help them. Similarly, telling us any languages you speak aside from English can make you eligible for more opportunities.All fields except "Languages" are required.Add your addressBy telling us where you live, you enable our customers to truly test their products and software throughout the globein the hands of real people like you. All fields required.
      |Firstname|Lastname|email|date  |
      |<Firstname>|<Lastname>|<email>|<date>  |
    When  Tell us about your devices you participate in uTest projects, you need to have at least one device that you perform the test on. Please list a device (the more devices you have, the more invitations to projects you receive).
      |city|postal Code|country |
      |<city>|<postal Code>|<country> |
    Then The last step Almost done! Please create a password for your account. Then review and accept our terms of use, code of conduct, and privacy & security policy to complete the setup process.
      |yourcomputer|version|language|yourmobiledevice|model|operatingsystem|
      |<yourcomputer>|<version>|<language>|<yourmobiledevice>|<model>|<operatingsystem>|
