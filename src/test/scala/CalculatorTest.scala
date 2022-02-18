class CalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("Calculator.sum") {
    assert(Calculator.sum(1, 2) === 3)
  }
}
