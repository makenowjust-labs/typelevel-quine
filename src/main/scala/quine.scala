package quine

import scala.compiletime._, ops.int._, ops.string.{+ => ++}

type Lines[I <: Int] = I match {
  case 0 => "package quine"
  case 1 => ""
  case 2 => "import scala.compiletime._, ops.int._, ops.string.{+ => ++}"
  case 3 => ""
  case 4 => "type Lines[I <: Int] = I match {"
  case 5 => "}"
  case 6 => ""
  case 7 => "type MkString[I, To] = (I > To) match {"
  case 8 => "  case true  => Lines[1]"
  case 9 => "  case false => Lines[I] ++ Lines[100] ++ MkString[I + 1, To]"
  case 10 => "}"
  case 11 => ""
  case 12 => "type Quote[I, To] = (I > To) match {"
  case 13 => "  case true => Lines[1]"
  case 14 => "  case false =>"
  case 15 => "    Lines[103] ++ ToString[I] ++ Lines[104] ++ Lines[102] ++ Lines[I] ++ Lines[102] ++ Lines[100] ++ Quote[I + 1, To]"
  case 16 => "}"
  case 17 => ""
  case 18 => "type Quine = MkString[0, 4] ++ Quote[0, 22] ++"
  case 19 => "  Lines[103] ++ ToString[100] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[105] ++ Lines[102] ++ Lines[100] ++"
  case 20 => "  Lines[103] ++ ToString[101] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[101] ++ Lines[102] ++ Lines[100] ++"
  case 21 => "  Lines[103] ++ ToString[102] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[102] ++ Lines[102] ++ Lines[100] ++"
  case 22 => "  Quote[103, 105] ++ MkString[5, 22]"
  case 100 => "\n"
  case 101 => "\\"
  case 102 => "\""
  case 103 => "  case "
  case 104 => " => "
  case 105 => "n"
}

type MkString[I, To] = (I > To) match {
  case true  => Lines[1]
  case false => Lines[I] ++ Lines[100] ++ MkString[I + 1, To]
}

type Quote[I, To] = (I > To) match {
  case true => Lines[1]
  case false =>
    Lines[103] ++ ToString[I] ++ Lines[104] ++ Lines[102] ++ Lines[I] ++ Lines[102] ++ Lines[100] ++ Quote[I + 1, To]
}

type Quine = MkString[0, 4] ++ Quote[0, 22] ++
  Lines[103] ++ ToString[100] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[105] ++ Lines[102] ++ Lines[100] ++
  Lines[103] ++ ToString[101] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[101] ++ Lines[102] ++ Lines[100] ++
  Lines[103] ++ ToString[102] ++ Lines[104] ++ Lines[102] ++ Lines[101] ++ Lines[102] ++ Lines[102] ++ Lines[100] ++
  Quote[103, 105] ++ MkString[5, 22]
