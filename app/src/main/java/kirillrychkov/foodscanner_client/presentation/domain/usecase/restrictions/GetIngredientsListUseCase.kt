package kirillrychkov.foodscanner_client.presentation.domain.usecase.restrictions

import androidx.lifecycle.LiveData
import kirillrychkov.foodscanner_client.presentation.domain.entity.Ingredient
import kirillrychkov.foodscanner_client.presentation.domain.repository.ChooseRestrictionsRepository

class GetIngredientsListUseCase (
    private val repository: ChooseRestrictionsRepository
) {
    operator fun invoke(): LiveData<List<Ingredient>> {
        return repository.getIngredients()
    }
}