package mr.sardorek.anbiyolarqissasi.recyclerview

import android.content.Context
import mr.sardorek.anbiyolarqissasi.R

object LessonsBase {

    fun getLessons(context : Context,number : Int,book : Int):ArrayList<Darslar>{

        val uzbdars = arrayOf(context.getString(R.string.muqaddima),
            context.getString(R.string.birinchi),
            context.getString(R.string.ikkinchi),
            context.getString(R.string.uchinchi),
            context.getString(R.string.tortinvhi),
            context.getString(R.string.beshinchi),
            context.getString(R.string.oltinchi),
            context.getString(R.string.yettinchi),
            context.getString(R.string.sakkizinchi),
            context.getString(R.string.toqqizinchi),
            context.getString(R.string.oninchi),
            context.getString(R.string.on1),
            context.getString(R.string.on2),
            context.getString(R.string.on3),
            context.getString(R.string.on4),
            context.getString(R.string.on5),
            context.getString(R.string.on6),
            context.getString(R.string.on7),
            context.getString(R.string.on8),
            context.getString(R.string.on9),
            context.getString(R.string.yigirma),
            context.getString(R.string.yigirma1),
            context.getString(R.string.yigirma2),
            context.getString(R.string.yigirma3),
            context.getString(R.string.yigirma4),
            context.getString(R.string.yigirma5),
            context.getString(R.string.yigirma6),
            context.getString(R.string.yigirma7),
            context.getString(R.string.yigirma8),
            context.getString(R.string.yigirma9),
            context.getString(R.string.ottizinchi),
            context.getString(R.string.ottiz1),
            context.getString(R.string.ottiz2),
            context.getString(R.string.ottiz3),
            context.getString(R.string.ottiz4),
            context.getString(R.string.ottiz5),
            context.getString(R.string.ottiz6),
            context.getString(R.string.ottiz7),
            context.getString(R.string.ottiz8),
            context.getString(R.string.ottiz9),
            context.getString(R.string.qirq),
            context.getString(R.string.qirq1),
            context.getString(R.string.qirq2),
            context.getString(R.string.qirq3),
            context.getString(R.string.qirq4),
            context.getString(R.string.qirq5),
            context.getString(R.string.qirq6),
            context.getString(R.string.qirq7),
            context.getString(R.string.qirq8),
            context.getString(R.string.qirq9),
            context.getString(R.string.ellik),
            context.getString(R.string.ellik1),
            context.getString(R.string.ellik2),
            context.getString(R.string.ellik3),
            context.getString(R.string.ellik4),
            context.getString(R.string.ellik5),
            context.getString(R.string.ellik6),
            context.getString(R.string.ellik7),
            context.getString(R.string.ellik8),
            context.getString(R.string.ellik9),
            context.getString(R.string.oltmish),
            context.getString(R.string.oltmish1),
            context.getString(R.string.oltmish2),
            context.getString(R.string.oltmish3),
            context.getString(R.string.oltmish4),
            context.getString(R.string.oltmish5),
            context.getString(R.string.oltmish6),
            context.getString(R.string.oltmish7),
            context.getString(R.string.oltmish8),
            context.getString(R.string.oltmish9),
            context.getString(R.string.yetmush),
            context.getString(R.string.yetmush1),
            context.getString(R.string.yetmush2),
            context.getString(R.string.yetmush3),
            context.getString(R.string.yetmush4),
            context.getString(R.string.yetmush5),
            context.getString(R.string.yetmush6),
            context.getString(R.string.yetmush7),
            context.getString(R.string.yetmush8),
            context.getString(R.string.yetmush9),
            context.getString(R.string.sakson),
            context.getString(R.string.sakson1),
            context.getString(R.string.sakson2),
            context.getString(R.string.sakson3),
            context.getString(R.string.sakson4),
            context.getString(R.string.sakson5),
            context.getString(R.string.sakson6)
        )

        val arabic = arrayOf(context.getString(R.string.arabic_m),
            context.getString(R.string.a_1,),
            context.getString(R.string.a_2),
            context.getString(R.string.a_3),
            context.getString(R.string.a_4),
            context.getString(R.string.a_5),
            context.getString(R.string.a_6),
            context.getString(R.string.a_7),
            context.getString(R.string.a_8),
            context.getString(R.string.a_9),
            context.getString(R.string.a_10),
            context.getString(R.string.a_11),
            context.getString(R.string.a_12),
            context.getString(R.string.a_13),
            context.getString(R.string.a_14),
            context.getString(R.string.a_15),
            context.getString(R.string.a_16),
            context.getString(R.string.a_17),
            context.getString(R.string.a_18),
            context.getString(R.string.a_19),
            context.getString(R.string.a_20),
            context.getString(R.string.a_21),
            context.getString(R.string.a_22),
            context.getString(R.string.a_23),
            context.getString(R.string.a_24),
            context.getString(R.string.a_25),
            context.getString(R.string.a_26),
            context.getString(R.string.a_27),
            context.getString(R.string.a_28),
            context.getString(R.string.a_29),
            context.getString(R.string.a_30),
            context.getString(R.string.a_31),
            context.getString(R.string.a_32),
            context.getString(R.string.a_33),
            context.getString(R.string.a_34),
            context.getString(R.string.a_35),
            context.getString(R.string.a_36),
            context.getString(R.string.a_37),
            context.getString(R.string.a_38),
            context.getString(R.string.a_39),
            context.getString(R.string.a_40),
            context.getString(R.string.a_41),
            context.getString(R.string.a_42),
            context.getString(R.string.a_43),
            context.getString(R.string.a_44),
            context.getString(R.string.a_45),
            context.getString(R.string.a_46),
        )

        val lessons = ArrayList<Darslar>()

        var plus = 0
        var plus2 = 0

        if (book == 1||book == 2){
            if (book == 1){
                for (i in 0..number){
                    plus++
                    if (plus == 1){
                        lessons.add(Darslar(R.drawable.book1, uzbdars[i],arabic[i]))
                    }
                    else{
                        lessons.add(Darslar(R.drawable.book4, uzbdars[i],arabic[i]))
                    }
                }
            }
            else{
                for (i in 0 until number){
                    plus2++
                    if (plus2 == 1){
                        lessons.add(Darslar(R.drawable.book1, uzbdars[i],arabic[i]))
                    }
                    else{
                        lessons.add(Darslar(R.drawable.book4, uzbdars[i],arabic[i]))
                    }
                }
            }
        }
        else{
            if (book == 3){
                for (i in 0 until number-1){
                    lessons.add(Darslar(R.drawable.book4, uzbdars[i+1],arabic[i+1]))
                }
            }
            else{
                for (i in 0 until number){
                    lessons.add(Darslar(R.drawable.book4, uzbdars[i+1],arabic[i+1]))
                }
            }
        }

        return lessons

    }

}