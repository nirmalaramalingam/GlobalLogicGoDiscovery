Feature: Testing of goDiscovery application  
  
@task2 @smoke 
Scenario: Task2 Verify writing of all titles and duration to a file

Given Navigate to goDiscovery application
When Scroll down to popular shows
Then Go to the last video by pressing the arrow icon 
When Once you reach the last video click on EXPLORE THE SHOW
Then Click on “SHOW MORE” and you will see the list of shows
And Click on “SHOW MORE” again and few shows will be added
Then Create a new file and write all the show titles and duration into it


      
