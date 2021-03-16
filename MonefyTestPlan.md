# Monefy Application Test Plan (Android)


# Functional Tests

**Test Case ID:** TFT001<br/>
*Priority:* P1<br/>
*Explore :* Initial Balance<br/> 
*With :* Different types of accounts<br/>
*To :* Validate initial balance is set to zero for a new user<br/>

**Test Case ID:** TFT002<br/>
*Priority:* P1<br/>
*Explore :* All Expense and Income categories<br/> 
*With :* Different types of accounts<br/>
*To :* Validate user is able to categorise the transactions correctly<br/>

**Test Case ID:** TFT003<br/>
*Priority:* P1<br/>
*Explore :* All possible intervals for Transaction Accounting<br/>
*With :* Different time intervals<br/>
*To :* Validate transactions are categorised correctly according to the time interval<br/>

**Test Case ID:** TFT004<br/>
*Priority:* P1<br/>
*Explore :* Updating a already recorded transaction<br/>
*With :* Different categories and accounts<br/>
*To :* Validate transactions are updated correctly<br/>

 **Test Case ID:** TFT005<br/>
*Priority:* P1<br/>
*Explore :* Logic to compute the total balance<br/>
*With :* Different input combinations for income and expense<br/>
*To :* Validate that balance is always displayed correctly<br/>

 **Test Case ID:** TFT006<br/>
*Priority:* P1<br/>
*Explore :* All the general settings (Not pro)<br/>
*With :* Valid and non-valid inputs for each setting<br/>
*To :* Validate settings are applied correctly<br/>

 **Test Case ID:** TFT007<br/>
*Priority:* P1<br/>
*Explore :* All the Pro settings<br/> 
*With :* Pro and Non Pro users<br/>
*To :* Validate only Pro users can access pro settings<br/>

 **Test Case ID:** TFT008<br/>
*Priority:* P1<br/>
*Explore :* Upgradation to Pro users<br/> 
*With :* Different payment types<br/>
*To :* Validate that user upgradation is successful<br/>

 **Test Case ID:** TFT009<br/>
*Priority:* P1<br/>
*Explore :* Downgrading from Pro user<br/>
*To :* Validate that user can cancel the Pro account<br/>

**Test Case ID:** TFT010<br/>
*Priority:* P1<br/>
*Explore :* Calculator module being used while recording transactions<br/> 
*With :* Different combination of inputs and operations<br/>
*To :* Validate the Arithmetic correctness of mathematical operations<br/>

**Test Case ID:** TFT011<br/>
*Priority:* P1<br/>
*Explore :* Backup and Restore<br/> 
*With :* Different balances in different accounts<br/>
*To :* Validate the Data Persistence<br/>

**Test Case ID:** TFT012<br/>
*Priority:* P1<br/>
*Explore :* Transfer Amount<br/>
*With :* Different types of accounts<br/>
*To :* Validate that given amount is transferred across different accounts<br/>

**Test Case ID:** TFT013<br/>
*Priority:* P2<br/>
*Explore :* Sorting the transactions<br/>
*With :* Time and Value<br/>
*To :* Sorting logic across different account types and transaction categories<br/>

**Test Case ID:** TFT013<br/>
*Priority:* P2<br/>
*Explore :* Search functionality<br/>
*With :* Valid and Invalid transactions<br/>
*To :* Validate the Searching logic<br/>


# Non Functional Tests

**Test Case ID:** TNFT001<br/>
*Priority:* P2<br/>
*Explore :* Boundary value analysis<br/>
*With :* All the input fields<br/>
*To :* Validate the Maximum and Minimum<br/>

**Test Case ID:** TNFT002<br/>
*Priority:* P1<br/>
*Explore :* Boundary value analysis<br/>
*With :* Number of Accounts and Transactions<br/>
*To :* Validate the Maximum and Minimum number of Accounts and Transactions<br/>

**Test Case ID:** TNFT003<br/>
*Priority:* P1<br/>
*Explore :* Application in landscape orientation<br/>
*To :* Validate that UI is not broken in the landscape orientation<br/>

**Test Case ID:** TNFT004<br/>
*Priority:* P1<br/>
*Explore :* Login with the same user (google play ID)<br/>
*With :* With a different android device<br/>
*To :* Validate mutual exclusion of transactions in different devices<br/>


**Test Case ID:** TNFT005<br/>
*Priority:* P1<br/>
*Explore :* Operate the application<br/>
*With :* With Battery Saver mode on<br/>
*To :* Observe the application behaviour in resource crunch situation<br/>

**Test Case ID:** TNFT006<br/>
*Priority:* P1<br/>
*Explore :* Operate the application<br/> 
*With :* Not giving all the permissions to the application<br/>
*To :* Validate the handling of missing permissions<br/>

**Test Case ID:** TNFT007<br/>
*Priority:* P3<br/>
*Explore :* Operate the application <br/>
*With :* Device having low secondary storage<br/>
*To :* Observe the application behaviour in resource crunch situation<br/>

**Test Case ID:** TNFT008<br/>
*Priority:* P2<br/>
*Explore :* Battery consumption while using the Application<br/>
*With :* Battery Historian tool<br/>
*To :* Check application is not draining the battery<br/>

**Test Case ID:** TNFT009<br/>
*Priority:* P1<br/>
*Explore :* Force Swiping and Force Killing application<br/>
*To :* Validate data persistence<br/>

**Test Case ID:** TNFT010<br/>
*Priority:* P1<br/>
*Explore :* Network Usage<br/>
*With :* Android Network Monitor<br/>
*To :* Check application is consuming excessive bandwidth<br/>

# Performance Tests

**Test Case ID:** TNPT001<br/>
*Priority:* P1<br/>
*Explore :* Memory leaks and Memory Consumption<br/>
*With :* Memory analyzer tool<br/>
*To :* Check there are no memory leaks in application<br/>

**Test Case ID:** TNPT002
*Priority:* P1<br/>
*Explore :* Application opening and loading<br/>
*With :* Application benchmarking<br/>
*To :* Check there is no delay in Application opening and loading<br/>

**Test Case ID:** TNPT003
*Priority:* P2<br/>
*Explore :* UI performance<br/>
*With :* Lots of data inside the application<br/>
*To :* Validate the actual user experience<br/>

# Device and OS Coverage

**Test Case ID:** TNDC001<br/>
*Priority:* P1<br/>
*Explore :* Different screen sizes<br/>
*To :* Validate look and feel of application<br/>

**Test Case ID:** TNDC002
*Priority:* P1<br/>
*Explore :* Supported operating sizes<br/>
*To :* Ensure that application runs on spectrum of supported operating systems<br/>

# Upgrade Testing

**Test Case ID:** TNUT001<br/>
*Priority:* P1<br/>
*Explore :* Application Upgrade<br/>
*With :* All possible previous version<br/>
*To :* No crashes and data loss after upgrading to latest version<br/>



## Prioritisation and Order of Execution
Navigate to the sections sequentially and within section each test case has it's priority.<br/>

## Time in Man Hours
Functional Tests : 5 hours<br/>
Non Functional Tests : 4 hours<br/>
Performance Tests : 3 hours<br/>
Device and OS Coverage, Upgrade Testing : 3 hours<br/>
Total : 15 man hours.


## Risk Mitigation

 1. Running the existing UI regression suite multiple times
 2. Adding the P1 cases to UI automation suite if possible
 3. Selecting devices combination such that they cater to both : screen-size and operating system coverage
 4. Having a internal team bug hunt before release
 5. Making sure all the risky changes are guarded behind a feature flag
 6. Integrating crash reporting tool like Crashlytics to monitor the application stability.
