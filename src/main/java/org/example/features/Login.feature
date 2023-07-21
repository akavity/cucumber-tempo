Feature: Login feature

  Scenario Outline: UnSuccessful login
    Given I open page "<page>"
    When I enter the email "<email>" and the password "<password>"
    Then I want to get the errorText "<errorText>"

    Examples:
      | page                       | email                        | password          | errorText                                   |
      | https://www.pizzatempo.by/ | arthas44Menethil@fexpost.com | 44Icemourne44     | Неверно указано имя пользователя или пароль |
      | https://www.pizzatempo.by/ | kelThuzat66@fexpost.com      | Nerzhul777Forever | Неверно указано имя пользователя или пароль |
      | https://www.pizzatempo.by/ | anubbArakk@fexpost.com       | nubBarakk         | Неверно указано имя пользователя или пароль |
