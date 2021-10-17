

fun main(args: Array<String>) {
    /*
    class piece
    class board

     */
    val currentTurn = arrayOf("Red","Black")
    var redPieces = arrayOf("red01","red02","red03","red04","red05","red06","red07","red08","red09","red10","red11","red12")
    var blkPieces = arrayOf("blk01","blk02","blk03","blk04","blk05","blk06","blk07","blk08","blk09","blk10","blk11","blk12")
    val board = Board()


    fun displayBoard() {

        println("    1      2      3      4      5      6      7      8")
        print("a ")
        for (i in 0..7) {
            val get = board.array[i]

            print(board.positions.getValue(get))
            print("  ")
        }
        println()

        print("b ")
        for (i in 8..15) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("c ")
        for (i in 16..23) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("d ")
        for (i in 24..31) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("e ")
        for (i in 32..39) {
            val get = board.array[i]

            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("f ")
        for (i in 40..47) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("g ")
        for (i in 48..55) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()
        print("h ")
        for (i in 56..63) {
            val get = board.array[i]
            print(board.positions.getValue(get))
            print("  ")
        }
        println()

    }

    fun checkMove(checkPlayer: String, checkPiece: String, checkAction:String): Boolean {

        if(checkPlayer == "Red"){
            if(checkPiece in redPieces){

            }
            else{
                println("Invalid Move")
                return false
            }
        }
        else if(checkPlayer == "Black"){
            if(checkPiece in blkPieces){
                println("Invalid Move")
                return false
            }
        }

        if(board.positions.getValue(checkAction) == "|   |"){
            println("Invalid Move")
            return false
        }

        if(checkPlayer == "Red"){
            if(board.positions.getValue(checkAction) != "|   |" && board.positions.getValue(checkAction) !in redPieces){
                if(board.positions.getValue(checkAction) in blkPieces){

                }
            }
        }
        else if(checkPlayer == "Black"){
            if(board.positions.getValue(checkAction) != "|   |" && board.positions.getValue(checkAction) !in blkPieces){

            }
        }
        board.positions[checkAction] = "|||||"
        return true
    }

    fun playerTurn(){
        var player = currentTurn[0]
        var Continue = false
        var move = "none"
        var piece = "none"

        while(!Continue) {
            println("$player's move")
            print("Select piece: ")
            piece = readLine()!!
            print(" TO: ")
            move = readLine()!!
            Continue = checkMove(player,piece,move)
        }

        //checkMove(player,piece,move)
        board.positions[move] = piece


    }





    displayBoard()

}


