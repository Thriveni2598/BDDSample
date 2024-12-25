@PhaseOne
Feature: Task Activities

Create, Update, View and Delete task

@SmokeTest
Scenario: Create a new task
Given User login into app
When User create a new task

Scenario: View task
Given User login into app
When User view task

@RegressionTest
Scenario: Update task
Given User login into app
When User update task


Scenario: Delete a task
Given User login into app
When User delete a task
