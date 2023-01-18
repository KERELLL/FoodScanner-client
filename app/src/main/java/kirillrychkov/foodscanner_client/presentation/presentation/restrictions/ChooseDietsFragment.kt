package kirillrychkov.foodscanner_client.presentation.presentation.restrictions

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kirillrychkov.foodscanner_client.R
import kirillrychkov.foodscanner_client.databinding.FragmentChooseDietsBinding
import kirillrychkov.foodscanner_client.presentation.presentation.base.BaseFragment


class ChooseDietsFragment : BaseFragment<FragmentChooseDietsBinding, ChooseRestrictionsViewModel>(
    FragmentChooseDietsBinding::inflate
) {

    private lateinit var adapter: ChooseRestrictionsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeDietsList()
        setupRecyclerView()
        launchChooseAllergensFragment()
    }

    private fun subscribeDietsList(){
        viewModel.dietsList.observe(viewLifecycleOwner){
            adapter.restrictionsList = it
        }
    }
    private fun launchChooseAllergensFragment(){
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_chooseDietsFragment_to_chooseAllergensFragment)
        }
    }

    private fun setupRecyclerView(){
        val rvShopList = binding.rvRestrictionsList
        adapter = ChooseRestrictionsAdapter()
        rvShopList.adapter = adapter
    }

    override fun getViewModel(): Class<ChooseRestrictionsViewModel> {
        return ChooseRestrictionsViewModel::class.java
    }

}