// 10_02.scala

val s = "07-2990399, 02-2398989, 04-2888838, 02-2783373"

val telnumber = """(\d\d)-(\d\d\d\d\d\d\d)""".r

val taipeinumbers = (telnumber findAllIn s collect {
    case telnumber ("02", number) => number    
} ).toList

taipeinumbers foreach println

