package pe.edu.upeu.sysventasjpc.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
<<<<<<< HEAD
import okhttp3.OkHttpClient
=======

import okhttp3.OkHttpClient
import pe.edu.upeu.sysventasjpc.data.remote.RestCategoria
import pe.edu.upeu.sysventasjpc.data.remote.RestMarca
import pe.edu.upeu.sysventasjpc.data.remote.RestProducto
import pe.edu.upeu.sysventasjpc.data.remote.RestUnidadMedida
>>>>>>> e7f4703 (crud)
import pe.edu.upeu.sysventasjpc.data.remote.RestUsuario
import pe.edu.upeu.sysventasjpc.utils.TokenUtils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

<<<<<<< HEAD
=======

>>>>>>> e7f4703 (crud)
@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {
    var retrofit: Retrofit?=null
    @Singleton
    @Provides
    @Named("BaseUrl")
<<<<<<< HEAD
    fun provideBaseUrl()=TokenUtils.API_URL
=======
    fun provideBaseUrl()= TokenUtils.API_URL
>>>>>>> e7f4703 (crud)
    @Singleton
    @Provides
    fun provideRetrofit(@Named("BaseUrl") baseUrl:String):
            Retrofit {
        val okHttpClient= OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        if (retrofit==null){
<<<<<<< HEAD
            retrofit= Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
=======
            retrofit= Retrofit.Builder()

                .addConverterFactory(GsonConverterFactory.create())
>>>>>>> e7f4703 (crud)
                .client(okHttpClient)
                .baseUrl(baseUrl).build()
        }
        return retrofit!!
    }
<<<<<<< HEAD

    @Singleton
    @Provides
    fun restUsuario(retrofit: Retrofit):RestUsuario{
        return retrofit.create(RestUsuario::class.java)
    }
=======
    @Singleton
    @Provides
    fun restUsuario(retrofit: Retrofit): RestUsuario {
        return retrofit.create(RestUsuario::class.java)
    }
    @Singleton
    @Provides
    fun restProducto(retrofit: Retrofit): RestProducto{
        return retrofit.create(RestProducto::class.java)
    }
    @Singleton
    @Provides
    fun restMarca(retrofit: Retrofit): RestMarca{
        return retrofit.create(RestMarca::class.java)
    }
    @Singleton
    @Provides
    fun restCategoria(retrofit: Retrofit): RestCategoria{
        return retrofit.create(RestCategoria::class.java)
    }
    @Singleton
    @Provides
    fun restUnidadMedida(retrofit: Retrofit): RestUnidadMedida{
        return retrofit.create(RestUnidadMedida::class.java)
    }
>>>>>>> e7f4703 (crud)

}