# Homework – BigDecimal and String (operations, precision, rounding)

1. **Simple use of BigDecimal**
    - Create a `BigDecimal` object with value `10.50` and print it to the console.
    - Create another object with value `2.25` and print the sum, difference, product, and quotient.

2. **BigDecimal from String**
    - Create a `BigDecimal` by passing the value as a `String` and as a `double`.
    - Print both values to show the difference in precision.

3. **Rounding prices**
    - Create a `BigDecimal` with value `10.56789`.
    - Round it to two decimal places using `setScale(2, RoundingMode.HALF_UP)`.
    - Print the result.

4. **Calculating discount**
    - Read a price (`BigDecimal`) and a discount percentage (`BigDecimal`).
    - Calculate the price after discount, rounding to two decimal places.

5. **VAT tax**
    - Read net price (`BigDecimal`).
    - Add 23% VAT and print the gross price rounded to two decimal places.

6. **Comparing prices**
    - Read two prices (`BigDecimal`).
    - Check which one is greater using `compareTo()` and print the proper message.

7. **Shopping cart sum**
    - Create an array of `BigDecimal` with several product prices.
    - Calculate the total cart value with precision to two decimal places.

8. **Average price**
    - Read from user the number of products and their prices (`BigDecimal`).
    - Calculate the average price rounded to two decimal places.

9. **Prices in different currencies**
    - Read a price in PLN (`BigDecimal`) and the exchange rate to EUR (`BigDecimal`).
    - Convert the price to EUR and round to two decimal places.

10. **Precision difference – double vs BigDecimal**
    - Calculate `0.1 + 0.2` using `double` and print the result.
    - Do the same with `BigDecimal` (constructor with `String`) and print the result.
    - Compare the differences.

11. **String – basic operations**
    - Read text from user.
    - Print its length, uppercase version, lowercase version, and reversed text (last character first).

12. **String – searching**
    - Read a sentence and a word.
    - Check if the word occurs in the sentence (`contains()`), and at what position (`indexOf()`).

13. **String – replacing fragments**
    - Read a sentence and replace all spaces with `_`.
    - Then remove all commas.

14. **String – comparison**
    - Read two strings.
    - Check equality using `equals()` and `equalsIgnoreCase()`.
    - Print results.

15. **String – splitting text**
    - Read a sentence containing multiple words separated by spaces.
    - Split it with `split(" ")` and print each word on a new line.

16. **String – checking prefix and suffix**
    - Read text from user.
    - Check if it starts with `"Java"` and if it ends with `"2025"`.

17. **Combining BigDecimal and String**
    - Read product name (`String`) and its price (`BigDecimal`).
    - Print: `Product: NAME, price: XX.XX PLN`.

18. **Formatting prices**
    - Read a list of prices (`BigDecimal`) and print them in format `XX.XX zł` (always two decimals, even `.00`).

19. **Splitting a bill**
    - Read total bill amount (`BigDecimal`) and number of people (`int`).
    - Split equally and print how much each pays (always two decimals).

20. **Rounding up**
    - Read a price (`BigDecimal`).
    - Round it up to full grosz (`RoundingMode.CEILING`) and print result.