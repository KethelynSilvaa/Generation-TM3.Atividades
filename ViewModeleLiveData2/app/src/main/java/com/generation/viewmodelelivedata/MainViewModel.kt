package com.generation.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

     /*LiveData- irá responder ao UI, indicando que algum dado foi alterado
     para ultiizar como valor =MutableLiveData
    */

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
    }
}