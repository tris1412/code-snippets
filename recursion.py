# recursion.py
# Demonstration of recursion: Factorial function

def factorial(n):
    """Calculate factorial using recursion"""
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

print(f"Factorial of 5: {factorial(5)}")
