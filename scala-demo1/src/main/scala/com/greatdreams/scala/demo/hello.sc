class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map( (s: String) => s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("Huawei Wang", "apple", "microsoft"))
object MyUtil {
  def upper(strings: String*): Seq[String] = {
    strings.map(_.toUpperCase())
  }
}

println(MyUtil.upper("Hello word", "java world"))