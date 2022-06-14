sealed class SealedExpr {
    class Num(val value: Int) : SealedExpr()
    class Sum(val left: SealedExpr, val right: SealedExpr) : SealedExpr()
}

fun sealedEval(e: SealedExpr): Int =
    when (e) {
        is SealedExpr.Num -> e.value
        is SealedExpr.Sum -> sealedEval(e.right) + sealedEval(e.left)
    }