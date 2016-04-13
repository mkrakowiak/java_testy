Scenario: message is sent
Given servers address by inf.ug.edu.pl
And message by some message
When message can be send
And messenger sends message
Then the result should be equal 0

