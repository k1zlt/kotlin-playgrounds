class Comment(
    val userId: Int,
    val message: String
)

var comments: List<Comment> = listOf(
    Comment(5241, "Nice code"),
    Comment(6624, "Like it"),
    Comment(5224, "What's going on?"),
    Comment(9001, "Check out my website"),
    Comment(8818, "Hello everyone, :)")
)

var blockedUserIds: Set<Int> = setOf(5224, 9001)

var userIdToRelation: Map<Int, String> = mapOf(5241 to "Friend", 6624 to "Work Colleague")

fun main() {
    for (comment in comments) {
        if (comment.userId !in blockedUserIds) {
            var relation = if (comment.userId in userIdToRelation) userIdToRelation[comment.userId] else "unknown"
            println("Comment ${comment.message} from $relation")
        }
    }
}

