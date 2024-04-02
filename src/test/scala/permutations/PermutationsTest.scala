package permutations

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PermutationsTest extends AnyFlatSpec with should.Matchers {

  "Permutations" should "return all options" in {

    val perm = Permutations("ABC")

    perm should have size 6
    perm should contain ("ABC")
    perm should contain ("ACB")
    perm should contain ("BAC")
    perm should contain ("BCA")
    perm should contain ("CAB")
    perm should contain ("CBA")
  }

}
