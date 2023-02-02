package kirillrychkov.foodscanner_client.presentation.data

import android.content.Context
import kirillrychkov.foodscanner_client.presentation.domain.entity.User
import javax.inject.Inject

class PrefsStorage @Inject constructor(
    context: Context
) {
    private val sharedPreferences = context.getSharedPreferences(
        "User data preferences",
        Context.MODE_PRIVATE
    )

    fun saveToSharedPreferences(user: User?){
        if(user != null){
            sharedPreferences.edit()
                .putLong(ID_KEY, user.id)
                .putString(PASSWORD_KEY, user.password)
                .putString(USERNAME_KEY, user.username)
                .putString(EMAIL_KEY, user.email)
                .putString(TOKEN_KEY, user.token)
                .apply()
        }else{
            sharedPreferences.edit()
                .remove(ID_KEY)
                .remove(PASSWORD_KEY)
                .remove(USERNAME_KEY)
                .remove(EMAIL_KEY)
                .remove(TOKEN_KEY)
                .apply()
        }
    }

    companion object {
        private const val ID_KEY = "id"
        private const val USERNAME_KEY = "username"
        private const val EMAIL_KEY = "email"
        private const val PASSWORD_KEY = "password"
        private const val TOKEN_KEY = "token"
    }
}