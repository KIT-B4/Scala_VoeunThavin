class Fibonacci {
  def fibonacci(a: Int): Int = {
    if (a<=1) a
    else fibonacci(a-1)+fibonacci(a-2)
  }
}
