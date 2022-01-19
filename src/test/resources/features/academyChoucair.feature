# Autor: Alex Fabian Suarez Caviedes

@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the  Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
        | srtUser   | srtPassword |
        | asuarezc | Choucair2022*     |
      When he search for the course on the choucair academy platform
        |srtCourse |
        |Metodología Bancolombia          |
      Then he finds course called resources
        |srtCourse |
        |Metodología Bancolombia          |

