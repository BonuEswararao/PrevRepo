Feature: Shop Page Validation

  @shopPage
  Scenario Outline: Shopping Page Validation
    Given the user launches the application
    When user redirects to shop Page
    And adds Products "<products>" and no of times "<numberOfProducts>" total cart value "<totalValue>" Order Value "<orderValue>"

    #  Then place the order
    Examples: 
      | products                | numberOfProducts | totalValue   | ordervalue |
      | iphone X,Samsung Note 8 |              2,3 | 100000,50000 |     200000 |
