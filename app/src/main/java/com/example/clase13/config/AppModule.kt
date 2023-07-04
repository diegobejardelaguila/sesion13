package com.example.clase13.config

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import dagger.Provides
import javax.inject.Singleton

object AppModule {

    @Provides
    @Singleton
    fun providerFirebaseDatabaseInstance(): FirebaseDatabase{
        return FirebaseDatabase.getInstance()
    }

    @Provides
    @Singleton
    fun providerFirebaseStoreInstance(): FirebaseStorage{
        return FirebaseStorage.getInstance()
    }

    @Provides
    @Singleton
    fun providerFirebaseAuthInstance(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }

    @Provides
    @Singleton
    fun providerFirebaseStorageInstance(): StorageReference{
        return FirebaseStorage.getInstance().getReference(
            FirebaseStorageConstants.ROOT_DIRECTORY
        )
    }


}