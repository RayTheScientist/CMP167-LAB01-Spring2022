# Loops: It is a block code that repeats itself. Counted or Definite loop, and indefinite loops
# While Loop
## Syntax:
   while (condition) {
      statements 
   }
## Semantics:
- Evaluate the condition
- If condition is true: Execute inner statements and repeat step 1
- If condition is false: End the loop

### Sentinel Value
- Sentinel Value is a value the while loop is always keeping an eye for, if the sentinel value is given then at the next iteration the loop will end


## Example
   while (n ! = -1) {
      statements
      n=input
   }   

### true
-   It will run forever until there is a breaking condition
 
## Example
-   while(true ) {
       statements
       if (condition) {
           break;
       }
   }        
### flag
-     a boolean variabke that is first set to true, and there is a condition inside the loop that will change the value is this flag

## Example
   while(flag){
       statements
       if (condition  ) {
           flag = false; 
       }
  }
# Incrementing
-   this while loop has a condition that willchange as the variable inside (counter) will change every iteration   
   
## Example

   while (n < 100) {
      statements 
      n++;// n = n +1,  n+=1,  
    }

    while (n < 100) {
       statments
       n+= 10;// same as n = n+10



# Do while Loop
- This loop will at least repeat once without checking the condition

## Syntax:
   do {
      statements
   } while(condition);
   
## Semantics:
-   Execute inner statements
-   Check the while condition
-   If condition is true go to step 1
-   If condition is false end the loop.
      
# For Loop
## Syntax:
   for (start; stop; step) {
     statements   
   }
   
   start code:  initialization code,
   stop code:  condition, if condition is false it will stop
   step code: Incrementing code
## Semantics:
-1.   Run start code for the first iteration only
-2.  Check Stop condition
-3.   If condition is true execute inner statements. and then go to step code. go to step 2   
-4.   If condition is false end the loop
   
## Example using accumulator pattern
   int sum = 0 ;
   for ( int i = 1; i <= 10; i++) {
     sum = sum + i; // sum += i
     }
     //1 + 2 = 3 + 3 = 6 + 4 = 10 + 5 = 15 + 6 = 21 + 7 = 28 + 8 = 36 + 9 = 45 +10 = 55     
# For Each Loop
   String  [] names = {"Maria", "Azis", "Galin"};
   
   for ( String tempName : names ) {
     system.out.println(tempName) ;
   }
        

# For Each Loop