package com.example.travelling.AllData

import com.example.travelling.Model.Popular
import com.example.travelling.R

object Popular {

    val popularList: List<Popular>
        get() {
            ArrayList<Popular>().apply {
                add(Popular(1,"Hawa Mahal","Jaipur","Rs 3500 - Rs 4500", R.drawable.rashi,"12 May, 2021","Here's the Description","3.8"))
                add(Popular(2,"Bhangarh Fort","Alwar","Rs 2000 - Rs 2500", R.drawable.rashi,"14 May, 2021","Here's the Description","4.2"))
                add(Popular(3,"La Khardung La","Ladakh","Rs 8500 - Rs 9500", R.drawable.rashi,"12 May, 2021","Here's the Description","4.8"))
                add(Popular(4,"Solang Valley","Himachal","Rs 6500 - Rs 7500", R.drawable.rashi,"25 May, 2021","Here's the Description","4.5"))
                add(Popular(5,"Dharmshala","Himachal","Rs 5000 - Rs 5500", R.drawable.rashi,"16 May, 2021","Here's the Description","4.2"))
                add(Popular(6,"Magnetic Hill","Leh","Rs 8500 - Rs 9500", R.drawable.rashi,"18 May, 2021","Here's the Description","4.5"))
                add(Popular(7,"Spitti valley","Himachal","Rs 6000 - Rs 7500", R.drawable.rashi,"19 May, 2021","Here's the Description","4.6"))
                add(Popular(8,"Double Decker Bridge","Meghalaya","Rs 6000 - Rs 7500", R.drawable.rashi,"28 May, 2021","Here's the Description","4.5"))
                add(Popular(9,"Darjelling","Assam","Rs 6000 - Rs 8500", R.drawable.rashi,"27 May, 2021","Here's the Description","4.2"))

                return this
            }
        }
}