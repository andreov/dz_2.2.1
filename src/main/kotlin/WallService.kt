import java.util.*

class WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val idLast: Long = if (posts.size == 0) post.id else posts.lastIndex.toLong() + 1
        post.id = (idLast + 1)
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        if (findById(post.id) !== null) {
            val index = post.id.toInt()-1
            posts[index] = post.copy(idAuthor = 10, idOnwer = 10, createdBy = 10)
            return true
        }
        return false
    }


    fun removeById(id: Long): Boolean {

        TODO()
    }

    fun likeById(id: Long) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = Likes(post.likes.count + 1))
            }
        }
    }

    fun findById(id: Long): Post? {
        for (post in posts) {
            if (post.id == id) return post
        }
        return null
    }
}

