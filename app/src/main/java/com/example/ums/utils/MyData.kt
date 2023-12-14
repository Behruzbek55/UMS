package com.example.ums.utils

import com.example.ums.models.MyUms

object MyData {
    lateinit var tarifList:ArrayList<MyUms>
    lateinit var daqiqaList:ArrayList<MyUms>
    lateinit var internetList:ArrayList<MyUms>
    lateinit var xizmatlarList:ArrayList<MyUms>
    lateinit var smsList:ArrayList<MyUms>

    fun addUms(){
        tarifList = ArrayList()
        tarifList.add(MyUms("Mobi 20","Yaxshi","*111*120#"))
        tarifList.add(MyUms("Mobi 11","Yaxshi","*111*111#"))
        tarifList.add(MyUms("Mobi 22","Yaxshi","*111*122#"))
        tarifList.add(MyUms("Mobi 23","Yaxshi","*111*123#"))

        daqiqaList = ArrayList()
        daqiqaList.add(MyUms("daqiqa 60","1000 so'm","*110*60#"))
        daqiqaList.add(MyUms("daqiqa 160","11000 so'm","*110*61#"))
        daqiqaList.add(MyUms("daqiqa 260","15000 so'm","*110*62#"))
        daqiqaList.add(MyUms("daqiqa 360","2000 so'm","*110*63#"))

        internetList = ArrayList()
        internetList.add(MyUms("1GB","5000 so'm","*868*868#"))
        internetList.add(MyUms("3GB","10000 so'm","*868*686#"))
        internetList.add(MyUms("7GB","15000 so'm","*868*777#"))
        internetList.add(MyUms("10GB","20000 so'm","*868*666#"))

        xizmatlarList = ArrayList()
        xizmatlarList.add(MyUms("Qayta qo'ngiroq","telefon o'chiq bo'lgan","*303*123#"))
        xizmatlarList.add(MyUms("Operator bilan bog'lanish","Ko'di","2020"))
        xizmatlarList.add(MyUms("O'z raqamini bilish","Sizning raqamingiz","+998994093812"))
        xizmatlarList.add(MyUms("Tarif rejangizni bilish","sizning tarifingiz","Mobi 11"))

        smsList = ArrayList()
        smsList.add(MyUms("SMS 30","1300 so'm","*110*30*1#"))
        smsList.add(MyUms("SMS 40","1500 so'm","*110*89*8#"))
        smsList.add(MyUms("SMS 50","2000 so'm","*110*11*9#"))
        smsList.add(MyUms("SMS 60","2500 so'm","*666*66*6#"))

    }
}