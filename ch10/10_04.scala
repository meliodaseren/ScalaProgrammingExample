// 10_04.scala

import java.io._

val file = new FileInputStream ("Box.class")

val bytes = new Array[Byte](16)

var count = 0
var readresult = file.read (bytes)

while (readresult > 0) {

 print (f"$count%08x ")
 for (i <- 0 until readresult)
   printf ("%02X ", bytes(i))

 println ()
 count += 16
 readresult = file.read (bytes)


}

file.close ()

