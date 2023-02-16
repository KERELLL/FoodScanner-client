package kirillrychkov.foodscanner_client.app.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kirillrychkov.foodscanner_client.app.presentation.auth.AuthViewModel
import kirillrychkov.foodscanner_client.app.presentation.mainpage.profile.ProfileViewModel
import kirillrychkov.foodscanner_client.app.presentation.restrictions.ChooseRestrictionsViewModel

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    fun bindAuthViewModel(authViewModel : AuthViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ChooseRestrictionsViewModel::class)
    fun bindChooseRestrictionsViewModel(chooseRestrictionsViewModel : ChooseRestrictionsViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    fun bindProfileViewModel(profileViewModel: ProfileViewModel) : ViewModel
}