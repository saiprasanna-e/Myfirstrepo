def calculate(num1, num2):
   product = num1 * num2
   if product <= 1000:
       return product
   else:
       return num1 + num2
# Example usage
number1 = 20
number2 = 30
print("The result is", calculate(number1, number2))
