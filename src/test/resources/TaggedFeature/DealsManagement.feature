@PhaseTwo
Feature: Task Activities

Create,Update,View and Delete tasks

Background:Login into App
Given User login into app


@SmokeTest
Scenario: Create a new Deal
#Given User login into app
When User create a new Deal


Scenario: View Deal
#Given User login into app
When User view Deal

@RegressionTest
Scenario: Update Deal
#Given User login into app
When User update Deal

Scenario: Delete a Deal
#Given User login into app
When User delete a Deal
