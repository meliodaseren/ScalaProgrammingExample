

val files = (new java.io.File (".")).listFiles

def grep (pat:String) = {
  for (file <- files
       if file.getName.endsWith (".scala")) {
   // println (file)    
    
    val lines = scala.io.Source.fromFile (file).getLines.toList
    //println (lines)
    for (line <- lines;
         if (line.trim.matches (pat)))
      println (file + ": " + line)
      
  }  
}

grep ("(.*)def(.*)")
      
