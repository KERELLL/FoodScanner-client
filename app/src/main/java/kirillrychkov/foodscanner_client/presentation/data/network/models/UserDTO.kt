package kirillrychkov.foodscanner_client.presentation.data.network.models

data class UserDTO(
    val id: Long,
    val username: String,
    val email: String,
    val password: String,
    val diets: List<String>,
    val allergies: List<String>,
    val avoidance: List<String>,
    val ingredients: List<String>,
) {
}