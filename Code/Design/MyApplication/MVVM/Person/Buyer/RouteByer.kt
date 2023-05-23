package com.example.ticketease.MVVM.Person.Buyer

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtRepository
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtRepositoryImpl
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepositoryImpl
import com.example.ticketease.MVVM.url
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.*
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun postDataRegisterUser() : BuyerRetrofitAPI {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(JacksonConverterFactory.create())
            .build().create()
    }

@Provides
@Singleton
fun provideSharedPref(app : Application) : SharedPreferences{
    return app.getSharedPreferences("prefs",MODE_PRIVATE)
}

    @Provides
    @Singleton
    fun provideRegisterRepository(api : BuyerRetrofitAPI,prefs : SharedPreferences) : RegisterRepository{
        return RegisterRepositoryImpl(api, prefs)
    }


    @Provides
    @Singleton
    fun provideAvtRepository(api : BuyerRetrofitAPI,prefs : SharedPreferences) : AvtRepository {
        return AvtRepositoryImpl(api, prefs)
    }
}

