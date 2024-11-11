fun main() {
    var count=0
    //for
    for (i in 0..15){
        if(i %2==0){
            println(i)
          ++count
        }
     }
        println("count=$count")
    println("#####################")
    println("#####################")
    var i=0
    //while
    while (i<=15){
        if(i %2==0){
            println(i)
        }
        i++
    }
    println("count =$count")
    println("#####################")
    println("#####################")
    //First even number using break

    for(x in 0..15){
      if(x %2==0){
          println(x)
          break
      }
    }
    //find only odd number from 0 to 10
    for(i in 1..10){
        if (i==5){
            continue
        }
        if (i %2!=0)
        {
           println(i)
        }
    }

}