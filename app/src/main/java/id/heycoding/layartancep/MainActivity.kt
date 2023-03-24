package id.heycoding.layartancep

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import id.heycoding.layartancep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _activityMainBinding: ActivityMainBinding? = null
    private val activityMainBinding get() = _activityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding?.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.frag_container_main) as NavHostFragment
        navController = navHostFragment.navController
    }
}