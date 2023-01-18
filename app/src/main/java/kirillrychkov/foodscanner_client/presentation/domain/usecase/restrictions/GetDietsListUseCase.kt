package kirillrychkov.foodscanner_client.presentation.domain.usecase.restrictions

import androidx.lifecycle.LiveData
import kirillrychkov.foodscanner_client.presentation.domain.OperationResult
import kirillrychkov.foodscanner_client.presentation.domain.entity.Diet
import kirillrychkov.foodscanner_client.presentation.domain.repository.ChooseRestrictionsRepository

class GetDietsListUseCase(
    private val repository: ChooseRestrictionsRepository
) {
    operator fun invoke(): OperationResult<List<Diet>, String?> {
        return repository.getDiets()
    }
}