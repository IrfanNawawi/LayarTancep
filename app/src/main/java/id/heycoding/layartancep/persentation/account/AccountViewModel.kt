package id.heycoding.layartancep.persentation.account

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.heycoding.layartancep.utils.DataDummy
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor() : ViewModel() {
    fun getAccountMenu(): List<AccountMenu> = DataDummy.generateAccountMenu()
}