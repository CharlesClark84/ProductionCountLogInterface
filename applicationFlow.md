# Application Flow


### User Checks Weather

1. User checks the current weather conditions using the API that runs with the application.
1. Based on the current weather conditions the User will take all necessary PM/TPM (Preventative Maintenance)
recommended.

### User Inputs Shift and Personal Data

1. User enters the current date in the form.
1. User enters the shift in which the machine is being ran on in the form.
1. User enters their employee number in the form.
1. User enters their first and last name in the form.
1. User enters the order number in the form.
1. User enter the product name(Maybe a dropdown with options to select) in the form.
1. User enters which machine number which they are working on.

### User Inputs Machine Production Data

1. User enters the hours worked in the form.(Users must subtract thirty minutes for their lunch)
1. User enters the total number of parts produced on the shift.
1. User enters the down time. (down time is subtracted from the hours worked before a total is given and the credits are added)
1. A total number of hours worked is determined by using the rate per hour for the product named int the form. 
   * The hours worked and rate per hour are multiplied giving a base rate. base = hours worked * rate per hour
   * The actual number of parts produced is divided by the base rate per hour.  percentage = actual/base
   * The percentage is multiplied by the hours worked to get a total of hours produced. Total hours = percentage * hours worked
   * The total hours is multiplied by the base rate of pay per hour for a daily dollar amount. $ = total hours * base rate pay per hour

### User Inputs Shift/Machine Credits Data

1. User enters the credits in the form.
 * This could be javascript buttons with + and - symbols on them that add and subtract from the total of the specific credits 
   nest to their name.
 * Each individual credit has its own rate which will be multiplied by the number of occurrences of that credit.
1. The total number of credits in hours will be added to the total of the actual/expected.  

### User Submits Form and Gets a Reciept/Results

1. User submits the form.
1. A detail receipt is outputted to the page containing:
 * Name/Employee Number
 * Date/Shift
 * Order Number/Product Name
 * Rate/Total Hours
 * Total Credits/DownTime/Parts Produced
 * Daily Percentage/Dollar amount 
1. A way to start the applicaton over from the beginning will be implemented.
 * A form reset button?
 * A back button?
 * A thread or jframe structure to open and close windows?
 
 ### Future Implementations
 
 1. A way to compile all the data into one place.
  * I think will start will logs that will have a file to hold some shift/machine data to start.
  * Converting and sending data to Microsoft Excel.
  * Making differnt files for each machine number so data is sorted.
  * Running queries on data to determine priority tasks to fix downtime and production errors.
  
  
    