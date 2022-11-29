package com.diponkar.banglatoenglishp

fun String.englishWordChangeToBanglaWord(): String {
  val hash = HashMap<Any, Any>()


  hash["a"] = "a"
  hash["b"] = "b"
  hash["c"] = "c"
  hash["d"] = "d"
  hash["e"] = "e"
  hash["f"] = "f"
  hash["g"] = "g"
  hash["h"] = "h"
  hash["i"] = "i"
  hash["j"] = "j"
  hash["k"] = "k"
  hash["l"] = "l"
  hash["m"] = "m"
  hash["n"] = "n"
  hash["o"] = "o"
  hash["p"] = "p"
  hash["q"] = "q"
  hash["r"] = "r"
  hash["s"] = "s"
  hash["t"] = "t"
  hash["u"] = "u"
  hash["v"] = "v"
  hash["w"] = "w"
  hash["x"] = "x"
  hash["y"] = "y"
  hash["z"] = "z"

  hash["A"] = "a"
  hash["B"] = "b"
  hash["C"] = "c"
  hash["D"] = "d"
  hash["E"] = "e"
  hash["F"] = "f"
  hash["G"] = "g"
  hash["H"] = "h"
  hash["I"] = "i"
  hash["J"] = "j"
  hash["K"] = "k"
  hash["L"] = "l"
  hash["M"] = "m"
  hash["N"] = "n"
  hash["O"] = "o"
  hash["P"] = "p"
  hash["Q"] = "q"
  hash["R"] = "r"
  hash["S"] = "s"
  hash["T"] = "t"
  hash["U"] = "u"
  hash["V"] = "v"
  hash["W"] = "w"
  hash["X"] = "x"
  hash["Y"] = "y"
  hash["Z"] = "z"

  hash["য়"] = "oy"
  hash["?"] = "?"
  hash["—"] = "—"
  hash["-"] = "-"
  hash["–"] = "–"
  hash["\n"] = " "
  hash["\""] = " "
  hash["/"] = "/"
  hash["."] = "."
  hash["+"] = "+"
  hash["*"] = "*"
  hash["০"] = 0
  hash["১"] = 1
  hash["২"] = 2
  hash["৩"] = 3
  hash["৪"] = 4
  hash["৫"] = 5
  hash["৬"] = 6
  hash["৭"] = 7
  hash["৮"] = 8
  hash["৯"] = 9

  hash[""] = ""
  hash["."] = "."
  hash[","] = ","
  hash["।"] = "."
  hash["।"] = "."

  hash["0"] = 0
  hash["1"] = 1
  hash["2"] = 2
  hash["3"] = 3
  hash["4"] = 4
  hash["5"] = 5
  hash["6"] = 6
  hash["7"] = 7
  hash["8"] = 8
  hash["9"] = 9

  hash["অ"] = "a"
  hash["আ"] = "a"
  hash["ই"] = "i"
  hash["ঈ"] = "i"
  hash["উ"] = "u"
  hash["ঊ"] = "u"
  hash["ঋ"] = "ri"
  hash["এ"] = "e"
  hash["ঐ"] = "e"
  hash["ও"] = "o"
  hash["ঔ"] = "u"

  hash["া"] = "a"
  hash["ি"] = "i"
  hash["ী"] = "I"
  hash["ু"] = "u"
  hash["ূ"] = "u"
  hash["ৃ"] = "ri"
  hash["ে"] = "e"
  hash["ো"] = "u"
  hash["ৈ"] = "e"
  hash["ৌ"] = "u"
  hash["ঞ্জ"] = "ng"



  hash["ক"] = "k"
  hash["ক্স"] = "ox"
  hash["খ"] = "kh"
  hash["গ"] = "g"
  hash["ঘ"] = "gh"
  hash["ঙ"] = "Ng"
  hash["চ"] = "ch"
  hash["ছ"] = "ch"
  hash["জ"] = "j"
  hash["ঝ"] = "jh"
  hash["ঞ"] = "on"
  hash["ট"] = "T"
  hash["ঠ"] = "Th"
  hash["ড"] = "d"
  hash["ঢ"] = "Dh"
  hash["ণ"] = "n"
  hash["ত"] = "t"
  hash["থ"] = "th"
  hash["দ"] = "d"
  hash["ধ"] = "dh"
  hash["ন"] = "n"
  hash["প"] = "p"
  hash["ফ"] = "f"
  hash["ব"] = "b"
  hash["ভ"] = "v"
  hash["ম"] = "m"
  hash["য"] = "j"
  hash["র"] = "r"
  hash["ল"] = "l"
  hash["শ"] = "sh"
  hash["ষ"] = "Sh"
  hash["স"] = "s"
  hash["হ"] = "h"
  hash["ড়"] = "R"
  hash["ঢ়"] = "R"
  hash["য়"] = "oy"
  hash["ং"] = "ng"
  hash["ঃ"] = ""
  hash["্য"] = "z"
  hash["ঁ"] = ""
  hash["ড়"] = ""
  hash["ৎ"] = ""
  hash["্র"] = ""
  hash["্"] = ""
  hash[""] = ""
  hash["়"] = ""
  hash[" "] = " "


  var convertedData = ""
  this.forEach {
    try {
      val data = it.toString()
      if (hash[data]==null){
        convertedData +=""
      }else{
        convertedData += hash[data]
      }

    } catch (e: Exception) {
      convertedData += it
    }
  }
  return convertedData

}
