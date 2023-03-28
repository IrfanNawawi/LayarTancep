package id.heycoding.layartancep.utils

import id.heycoding.layartancep.R
import id.heycoding.layartancep.persentation.account.AccountMenu

object DataDummy {
    fun generateAccountMenu(): ArrayList<AccountMenu> {
        val accountMenu = ArrayList<AccountMenu>()
        accountMenu.add(
            AccountMenu(
                menuAccountId = 1,
                menuAccountImage = R.drawable.ic_dark_mode,
                menuAccountName = "Enable Dark Mode",
                menuAccountSwitch = 1
            )
        )
        accountMenu.add(
            AccountMenu(
                menuAccountId = 2,
                menuAccountImage = R.drawable.ic_language,
                menuAccountName = "Change Language",
                menuAccountSwitch = 0
            )
        )
        return accountMenu
    }
}