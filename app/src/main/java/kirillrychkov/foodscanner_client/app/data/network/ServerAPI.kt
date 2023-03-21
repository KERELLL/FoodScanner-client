package kirillrychkov.foodscanner_client.app.data.network

import androidx.room.Query
import kirillrychkov.foodscanner_client.app.data.network.models.*
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path


interface ServerAPI {
    @POST("auth/login")
    suspend fun login(
        @Body loginRequestDTO: LoginRequestDTO
    ) : Response<LoginResponseDTO>

    @POST("auth/register")
    suspend fun register(
        @Body registerRequestDTO: RegisterRequestDTO
    ) : Response<LoginResponseDTO>

    @GET("restrictions/diets")
    suspend fun getDiets(
    ) : List<DietDTO>

    @GET("restrictions/allergens")
    suspend fun getAllergens(
    ) : List<AllergenDTO>

    @GET("products/details/{barcode}")
    suspend fun getProductDetails(
        @Path("barcode") barcode: Long
    ) : ProductDTO

    @GET("products/list")
    suspend fun getProducts(
    ): List<ProductDTO>

    @GET("products/search")
    suspend fun getProductBySearch(
        @retrofit2.http.Query("name") name: String
    ): List<ProductDTO>
}