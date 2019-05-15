import org.homermultitext.hmtmom._

val repo = EditorsRepo(".")
val mom = HmtMom(repo)
val reporter = MomReporter(mom)
val test = "";



def validate(uString : String) = {
  reporter.validate(uString)
}

println("\n\nValidate DSE relations for a given page:")
println("\n\tvalidate(PAGEURN)\n\n")
