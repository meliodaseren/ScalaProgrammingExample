// 10_05.scala

import java.io._

def listFiles(file: File, t:String): Array[File] = {
  
  println (t + file.getName + "/")

  val fs = file.listFiles

  print (t)

  for (f <- fs) print (f.getName + " ")
  
  print ("\n\n")


  fs ++ fs.filter(_.isDirectory).flatMap {
             x => listFiles(x, t+"\t")}
}

val dir = new File (".")

listFiles (dir, "")


