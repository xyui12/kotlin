class Comment(
    val userid:Int,
    val message:String
)

fun main() {
    val comments:List<Comment> =listOf(
        Comment(5241, "Nice Code"),
        Comment(6624, "Like it"),
        Comment(5224, "What's going on"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone ")

    )

    val blockUserIds:Set<Int> =setOf(5224,9001)
    val userIdToRelation:Map<Int,String> =mapOf(
        5241 to "friend",
        6624 to "Close Friend"
    )

    for(comment in comments){
        if(comment.userid !in blockUserIds){
            val relation=userIdToRelation[comment.userid]?:"unknown"
            println("Comment ${comment.message} from $relation")
        }
    }
}
