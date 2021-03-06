import com.jessecorbett.diskord.dsl.bot
import com.jessecorbett.diskord.dsl.command
import com.jessecorbett.diskord.dsl.commands
import it.alexm.BuildConfig

suspend fun main(args: Array<String>) {

    bot(BuildConfig.DISCORD_TOKEN) {
        commands("!") {
            command("a") {
                reply(getAction(getFirstArgs()))
            }
            command("action") {
                reply(getAction(getFirstArgs()))
            }

            command("m") {
                reply(getMovement(getFirstArgs()))
            }
            command("mov") {
                reply(getMovement(getFirstArgs()))
            }

            command("i") {
                reply(insulti.random())
            }
            command("insulta") {
                reply(insulti.random())
            }
        }
    }
}