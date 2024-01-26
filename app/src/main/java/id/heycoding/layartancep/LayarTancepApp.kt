package id.heycoding.layartancep

import android.app.Application
import id.heycoding.shared.di.SharedModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class LayarTancepApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@LayarTancepApp)
            modules(
                SharedModules.getModules()
            )
        }
    }
}