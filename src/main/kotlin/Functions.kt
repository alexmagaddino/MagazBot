import com.jessecorbett.diskord.api.model.Message

fun Message.getFirstArgs(): Int = content.split(" ").getOrNull(1)?.toIntOrNull() ?: 1

fun getAction(dice: Int): String {
    return (1..dice).joinToString(" ; ") {
        val random = (1..6).random()
        when {
            random % 2 == 0 -> DiceFace.SKULL.prettyString
            random == 1 -> DiceFace.FANG.prettyString
            else -> DiceFace.SHIELD.prettyString
        }
    }
}

fun getMovement(dice: Int): String {
    return (1..dice).map {
        (1..6).random()
    }.let {
        "${it.joinToString(" + ")} = ${it.sum()}"
    }
}