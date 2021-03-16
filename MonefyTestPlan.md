# Monefy Application Test Plan (Android)


# Functional Tests<space><space>
**Test Case ID:** TFT001
*Priority:* P1
*Explore :* Initial Balance 
*With :* Different types of accounts
*To :* Validate initial balance is set to zero for a new user

**Test Case ID:** TFT002
*Priority:* P1
*Explore :* All Expense and Income categories 
*With :* Different types of accounts
*To :* Validate user is able to categorise the transactions correctly

**Test Case ID:** TFT003
*Priority:* P1
*Explore :* All possible intervals for Transaction Accounting
*With :* Different time intervals
*To :* Validate transactions are categorised correctly according to the time interval

**Test Case ID:** TFT004
*Priority:* P1
*Explore :* Updating a already recorded transaction
*With :* Different categories and accounts
*To :* Validate transactions are updated correctly

 **Test Case ID:** TFT005
*Priority:* P1
*Explore :* Logic to compute the total balance
*With :* Different input combinations for income and expense
*To :* Validate that balance is always displayed correctly

 **Test Case ID:** TFT006
*Priority:* P1
*Explore :* All the general settings (Not pro)
*With :* Valid and non-valid inputs for each setting
*To :* Validate settings are applied correctly

 **Test Case ID:** TFT007
*Priority:* P1
*Explore :* All the Pro settings 
*With :* Pro and Non Pro users
*To :* Validate only Pro users can access pro settings

 **Test Case ID:** TFT008
*Priority:* P1
*Explore :* Upgradation to Pro users 
*With :* Different payment types
*To :* Validate that user upgradation is successful

 **Test Case ID:** TFT009
*Priority:* P1
*Explore :* Downgrading from Pro user
*To :* Validate that user can cancel the Pro account

**Test Case ID:** TFT010
*Priority:* P1
*Explore :* Calculator module being used while recording transactions 
*With :* Different combination of inputs and operations
*To :* Validate the Arithmetic correctness of mathematical operations

**Test Case ID:** TFT011
*Priority:* P1
*Explore :* Backup and Restore 
*With :* Different balances in different accounts
*To :* Validate the Data Persistence

**Test Case ID:** TFT012
*Priority:* P1
*Explore :* Transfer Amount
*With :* Different types of accounts
*To :* Validate that given amount is transferred across different accounts

**Test Case ID:** TFT013
*Priority:* P2
*Explore :* Sorting the transactions 
*With :* Time and Value
*To :* Sorting logic across different account types and transaction categories

**Test Case ID:** TFT013
*Priority:* P2
*Explore :* Search functionality 
*With :* Valid and Invalid transactions
*To :* Validate the Searching logic


# Non Functional Tests

**Test Case ID:** TNFT001
*Priority:* P2
*Explore :* Boundary value analysis
*With :* All the input fields
*To :* Validate the Maximum and Minimum

**Test Case ID:** TNFT002
*Priority:* P1
*Explore :* Boundary value analysis
*With :* Number of Accounts and Transactions
*To :* Validate the Maximum and Minimum number of Accounts and Transactions

**Test Case ID:** TNFT003
*Priority:* P1
*Explore :* Application in landscape orientation
*To :* Validate that UI is not broken in the landscape orientation

**Test Case ID:** TNFT004
*Priority:* P1
*Explore :* Login with the same user (google play ID)
*With :* With a different android device
*To :* Validate mutual exclusion of transactions in different devices


**Test Case ID:** TNFT005
*Priority:* P1
*Explore :* Operate the application 
*With :* With Battery Saver mode on
*To :* Observe the application behaviour in resource crunch situation

**Test Case ID:** TNFT006
*Priority:* P1
*Explore :* Operate the application 
*With :* Not giving all the permissions to the application
*To :* Validate the handling of missing permissions

**Test Case ID:** TNFT007
*Priority:* P3
*Explore :* Operate the application 
*With :* Device having low secondary storage
*To :* Observe the application behaviour in resource crunch situation

**Test Case ID:** TNFT008
*Priority:* P2
*Explore :* Battery consumption while using the Application
*With :* Battery Historian tool 
*To :* Check application is not draining the battery

**Test Case ID:** TNFT009
*Priority:* P1
*Explore :* Force Swiping and Force Killing application
*To :* Validate data persistence

**Test Case ID:** TNFT010
*Priority:* P1
*Explore :* Network Usage
*With :* Android Network Monitor
*To :* Check application is consuming excessive bandwidth

# Performance Tests

**Test Case ID:** TNPT001
*Priority:* P1
*Explore :* Memory leaks and Memory Consumption
*With :* Memory analyzer tool
*To :* Check there are no memory leaks in application

**Test Case ID:** TNPT002
*Priority:* P1
*Explore :* Application opening and loading
*With :* Application benchmarking
*To :* Check there is no delay in Application opening and loading

**Test Case ID:** TNPT003
*Priority:* P2
*Explore :* UI performance
*With :* Lots of data inside the application
*To :* Validate the actual user experience

# Device and OS Coverage

**Test Case ID:** TNDC001
*Priority:* P1
*Explore :* Different screen sizes
*To :* Validate look and feel of application

**Test Case ID:** TNDC002
*Priority:* P1
*Explore :* Supported operating sizes
*To :* Ensure that application runs on spectrum of supported operating systems.

# Upgrade Testing

**Test Case ID:** TNUT001
*Priority:* P1
*Explore :* Application Upgrade
*With :* All possible previous version
*To :* No crashes and data loss after upgrading to latest version



## Prioritisation and Order of Execution
Navigate to the sections sequentially and within section each test case has it's priority.

## Time in Man Hours
Functional Tests : 5 hours
Non Functional Tests : 4 hours
Performance Tests : 3 hours
Device and OS Coverage, Upgrade Testing : 3 hours
Total : 15 man hours.


## Risk Mitigation

 1. Running the existing UI regression suite multiple times
 2. Adding the P1 cases to UI automation suite if possible
 3. Selecting devices combination such that they cater to both : screen-size and operating system coverage
 4. Having a internal team bug hunt before release
 5. Making sure all the risky changes are guarded behind a feature flag
 6. Integrating crash reporting tool like Crashlytics to monitor the application stability.
