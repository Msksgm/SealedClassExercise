fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(
        sealedEval(
            SealedExpr.Sum(
                SealedExpr.Sum(SealedExpr.Num(1), SealedExpr.Num(2)),
                SealedExpr.Num(4)
            )
        )
    )
}