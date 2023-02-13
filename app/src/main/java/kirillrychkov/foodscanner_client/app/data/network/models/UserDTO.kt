package kirillrychkov.foodscanner_client.app.data.network.models

data class UserDTO(
    val id: Long,
    val username: String,
    val email: String,
    val password: String,
    val diets: List<DietDTO>,
    val allergens: List<AllergenDTO>
) {
}