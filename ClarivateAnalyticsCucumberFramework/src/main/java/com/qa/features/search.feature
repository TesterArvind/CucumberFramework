Feature:Google Search Test

Scenario:Validate Google Search result for Clarivate Analytics Input Test

Given user opens browser
When user is on google home page
Then user enters "Clarivate Analytics" search box
Then "clarivate.com" should be the first searched result
And close browser 



