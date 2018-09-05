# Mersenne-Prime-Test
Java program to test for Mersenne primes

PrimeTest.java - main file

PossiblePrime.java- makes sure the number is a prime in the first place by making sure the exponent is prime by checking mod6= 5 or 1; then if number is small enough sends to less31.java to test or LLCheck.java if too big

Less31.java - calls different basic techniques for checking primes from BasicCheck.java

BasicCheck.java - checks smaller primes up to 2^31-1 using basic techniques incuding checking all prime divisors up to sqrt(num)

LLCheck.java- Lucas-Lehmer test used to check primes greater than 2^(2^31)-1

Mersenne.java - displays the Mersenne prime that is being tested
