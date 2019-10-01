Feature: Testing of goDiscovery application
  
@task1 @smoke 
Scenario:  Task1 Verify favorite show in goDiscovery application

Given Navigate to goDiscovery application
When Select See All Shows available in Shows tab
And Wait till the page loads and then select the shows which contain APOLLO
Then Verify the Favorites status
When If status is set or not then icon should change accordingly
Then Store all the favorite or unfavorite done titles in list
When Once favorite or unfavorite is done goto My Videos
Then Validate the favorite or unfavorite titles under FAVORITE SHOWS


   
    