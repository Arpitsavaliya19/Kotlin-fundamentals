abstract class example_of_anonymous_class(
    var name: String
) {
    constructor(name: String,age: Int , mobile: Long):this(name)

    abstract fun running()
    abstract fun walking()

}