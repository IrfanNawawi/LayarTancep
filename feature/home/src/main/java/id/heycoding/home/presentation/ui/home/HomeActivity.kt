package id.heycoding.home.presentation.ui.home

import androidx.fragment.app.Fragment
import id.heycoding.core.base.BaseActivity
import id.heycoding.home.databinding.ActivityHomeBinding
import id.heycoding.home.presentation.ui.dashboard.DashboardFragment
import id.heycoding.home.presentation.ui.genre.GenreFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity :
    BaseActivity<ActivityHomeBinding, HomeViewModel>(ActivityHomeBinding::inflate) {
    private val dashboardFragment = DashboardFragment()
    private val genreFragment = GenreFragment()
    private var activeFragment: Fragment = dashboardFragment

    override val viewModel: HomeViewModel by viewModel()

    override fun initView() {
        setupFragment()
    }

    private fun setupFragment() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        supportFragmentManager.beginTransaction().apply {
            add(binding.container.id, dashboardFragment)
            add(binding.container.id, genreFragment)
            hide(genreFragment)
        }.commit()
        binding.bottomNavView.setOnItemSelectedListener {
            when (it.itemId) {
                id.heycoding.styling.R.id.home -> {
                    showFragment(dashboardFragment)
                    true
                }

                else -> {
                    showFragment(genreFragment)
                    true
                }
            }
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().hide(activeFragment).show(fragment).commit()
        activeFragment = fragment
    }

}