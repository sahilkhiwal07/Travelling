package com.example.travelling.AllData

import com.example.travelling.Model.Recent
import com.example.travelling.R

object Recent {

    val recentList: List<Recent>
        get() {
            ArrayList<Recent>().apply {
                add(Recent(10,"Udaipur","Rajasthan","Rs 5000 - Rs 5500", R.drawable.rashi,"15 May, 2021","Here's the Description","4.5"))
                add(Recent(1,"Taj Mahal","Delhi","Rs 1500 - Rs 2000", R.drawable.rashi,"18 May, 2021","Here's the Description","3.5"))
                add(Recent(2,"Red Fort","Delhi","Rs 1000 - Rs 1200", R.drawable.rashi,"19 May, 2021","Here's the Description","4.2"))
                add(Recent(3,"Hidimba Temple","Himachal","Rs 2000 - Rs 3500", R.drawable.rashi,"17 May, 2021","Here's the Description","4.1"))
                add(Recent(4,"Solang Valley","Himachal","Rs 5000 - Rs 5500", R.drawable.rashi,"16 May, 2021","Here's the Description","4.8"))
                add(Recent(5,"Dharmshala","Himachal","Rs 3000 - Rs 4500", R.drawable.rashi,"22 May, 2021","Here's the Description","4.0"))
                add(Recent(6,"Magnetic Hill","Leh","Rs 7000 - Rs 8500", R.drawable.rashi,"19 May, 2021","Here's the Description","3.8"))
                add(Recent(7,"Spitti valley","Himachal","Rs 6000 - Rs 7500", R.drawable.rashi,"18 May, 2021","Here's the Description","3.5"))
                add(Recent(8,"Double Decker Bridge","Meghalaya","Rs 5000 - Rs 6500", R.drawable.rashi,"26 May, 2021","Here's the Description","4.5"))
                add(Recent(9,"Darjelling","Assam","Rs 6000 - Rs 7500", R.drawable.rashi,"28 May, 2021","Here's the Description","4.2"))
                return this
            }
        }

}