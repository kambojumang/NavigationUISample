package umang.kamboj.navigation_ui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import umang.kamboj.navigation_ui.R

class MainActivity  : AppCompatActivity() {

    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.main_container) as NavHostFragment

        findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
            .setupWithNavController(navController = navHostFragment.navController)

    }

}
