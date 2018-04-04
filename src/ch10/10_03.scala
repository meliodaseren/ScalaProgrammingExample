// 10_03.scala

import java.io._

val filein = new FileInputStream("Box.class")
val fileout = new FileOutputStream("Box2.class")

var byte = filein.read()

while(byte>=0) {
  fileout.write(byte)
  byte = filein.read()
}

filein.close()
fileout.close()
