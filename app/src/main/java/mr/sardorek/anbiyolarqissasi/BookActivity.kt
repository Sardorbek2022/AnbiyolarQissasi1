package mr.sardorek.anbiyolarqissasi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.constraintlayout.motion.widget.MotionLayout
import mr.sardorek.anbiyolarqissasi.databinding.ActivityBookBinding


class BookActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookBinding
    private var isOpen = false
    private var cardClose = false
    private var arabicToUzbek = false
    private var arabic = ""
    private var uzbek = ""
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getStringExtra("book").toString().toInt()
        val lesson = intent.getStringExtra("lesson").toString().toInt()
        val title = intent.getStringExtra("title").toString()

        if (title == getString(R.string.muqaddima)){
            binding.toolbar.title = title
        }
        else{
            binding.toolbar.title = "$title дарс"
        }

        var arabicBook1 = arrayListOf<String>(getString(R.string.a1_1),
            getString(R.string.a1_2),
            getString(R.string.a1_3),
            getString(R.string.a1_4),
            getString(R.string.a1_5),
            getString(R.string.a1_6),
            getString(R.string.a1_7),
            getString(R.string.a1_8),
            getString(R.string.a1_9),
            getString(R.string.a1_10),
            getString(R.string.a1_11),
            getString(R.string.a1_12),
            getString(R.string.a1_13),
            getString(R.string.a1_14),
            getString(R.string.a1_15),
            getString(R.string.a1_16),
            getString(R.string.a1_17),
            getString(R.string.a1_18),
            getString(R.string.a1_19),
            getString(R.string.a1_20),
            getString(R.string.a1_21),
            getString(R.string.a1_22),
            getString(R.string.a1_23),
            getString(R.string.a1_24),
            getString(R.string.a1_25),
            getString(R.string.a1_26),
            getString(R.string.a1_27),
            getString(R.string.a1_28),
            getString(R.string.a1_29),
            getString(R.string.a1_30),
            getString(R.string.a1_31),
            getString(R.string.a1_32),
            getString(R.string.a1_33),
            getString(R.string.a1_34),
            getString(R.string.a1_35),
            getString(R.string.a1_36),
            getString(R.string.a1_37),
            getString(R.string.a1_39),
            getString(R.string.a1_40),
            getString(R.string.a1_41),
            getString(R.string.a1_42),
        )

        var uzbekBook1 = arrayListOf<String>(getString(R.string.u1_1),
            getString(R.string.u1_2),
            getString(R.string.u1_3),
            getString(R.string.u1_4),
            getString(R.string.u1_5),
            getString(R.string.u1_6),
            getString(R.string.u1_7),
            getString(R.string.u1_8),
            getString(R.string.u1_9),
            getString(R.string.u1_10),
            getString(R.string.u1_11),
            getString(R.string.u1_12),
            getString(R.string.u1_13),
            getString(R.string.u1_14),
            getString(R.string.u1_15),
            getString(R.string.u1_16),
            getString(R.string.u1_17),
            getString(R.string.u1_18),
            getString(R.string.u1_19),
            getString(R.string.u1_20),
            getString(R.string.u1_21),
            getString(R.string.u1_22),
            getString(R.string.u1_23),
            getString(R.string.u1_24),
            getString(R.string.u1_25),
            getString(R.string.u1_26),
            getString(R.string.u1_27),
            getString(R.string.u1_28),
            getString(R.string.u1_29),
            getString(R.string.u1_30),
            getString(R.string.u1_31),
            getString(R.string.u1_32),
            getString(R.string.u1_33),
            getString(R.string.u1_34),
            getString(R.string.u1_35),
            getString(R.string.u1_36),
            getString(R.string.u1_37),
            getString(R.string.u1_39),
            getString(R.string.u1_40),
            getString(R.string.u1_41),
            getString(R.string.u1_42),
        )

        var arabicBook2 = arrayListOf<String>(getString(R.string.a2_1),
            getString(R.string.a2_2),
            getString(R.string.a2_3),
            getString(R.string.a2_4),
            getString(R.string.a2_5),
            getString(R.string.a2_6),
            getString(R.string.a2_7),
            getString(R.string.a2_8),
            getString(R.string.a2_9),
            getString(R.string.a2_10),
            getString(R.string.a2_11),
            getString(R.string.a2_12),
            getString(R.string.a2_13),
            getString(R.string.a2_14),
            getString(R.string.a2_15),
            getString(R.string.a2_16),
            getString(R.string.a2_17),
            getString(R.string.a2_18),
            getString(R.string.a2_19),
            getString(R.string.a2_20),
            getString(R.string.a2_21),
            getString(R.string.a2_22),
            getString(R.string.a2_23),
            getString(R.string.a2_24),
            getString(R.string.a2_25),
            getString(R.string.a2_26),
            getString(R.string.a2_27),
            getString(R.string.a2_28),
            getString(R.string.a2_29),
            getString(R.string.a2_30),
            getString(R.string.a2_31),
            getString(R.string.a2_32),
            getString(R.string.a2_33),
            getString(R.string.a2_34),
            getString(R.string.a2_35),
            getString(R.string.a2_36),
            getString(R.string.a2_37),
            getString(R.string.a2_38),
            getString(R.string.a2_39),
            getString(R.string.a2_40),
            getString(R.string.a2_41),
            getString(R.string.a2_42),
            getString(R.string.a2_43),
            getString(R.string.a2_44),
            getString(R.string.a2_45),
            getString(R.string.a2_46),
            getString(R.string.a2_47)
        )

        var uzbekBook2 = arrayListOf<String>(getString(R.string.u2_1),
            getString(R.string.u2_2),
            getString(R.string.u2_3),
            getString(R.string.u2_4),
            getString(R.string.u2_5),
            getString(R.string.u2_6),
            getString(R.string.u2_7),
            getString(R.string.u2_8),
            getString(R.string.u2_9),
            getString(R.string.u2_10),
            getString(R.string.u2_11),
            getString(R.string.u2_12),
            getString(R.string.u2_13),
            getString(R.string.u2_14),
            getString(R.string.u2_15),
            getString(R.string.u2_16),
            getString(R.string.u2_17),
            getString(R.string.u2_18),
            getString(R.string.u2_19),
            getString(R.string.u2_20),
            getString(R.string.u2_21),
            getString(R.string.u2_22),
            getString(R.string.u2_23),
            getString(R.string.u2_24),
            getString(R.string.u2_25),
            getString(R.string.u2_26),
            getString(R.string.u2_27),
            getString(R.string.u2_28),
            getString(R.string.u2_29),
            getString(R.string.u2_30),
            getString(R.string.u2_31),
            getString(R.string.u2_32),
            getString(R.string.u2_33),
            getString(R.string.u2_34),
            getString(R.string.u2_35),
            getString(R.string.u2_36),
            getString(R.string.u2_37),
            getString(R.string.u2_38),
            getString(R.string.u2_39),
            getString(R.string.u2_40),
            getString(R.string.u2_41),
            getString(R.string.u2_42),
            getString(R.string.u2_43),
            getString(R.string.u2_44),
            getString(R.string.u2_45),
            getString(R.string.u2_47),
            getString(R.string.u2_48),
        )

        var arabicBook3 = arrayListOf<String>(getString(R.string.a3_1),
            getString(R.string.a3_2),
            getString(R.string.a3_3),
            getString(R.string.a3_4),
            getString(R.string.a3_5),
            getString(R.string.a3_6),
            getString(R.string.a3_7),
            getString(R.string.a3_8),
            getString(R.string.a3_9),
            getString(R.string.a3_10),
            getString(R.string.a3_11),
            getString(R.string.a3_12),
            getString(R.string.a3_13),
            getString(R.string.a3_14),
            getString(R.string.a3_15),
            getString(R.string.a3_16),
            getString(R.string.a3_17),
            getString(R.string.a3_18),
            getString(R.string.a3_19),
            getString(R.string.a3_20),
            getString(R.string.a3_21),
            getString(R.string.a3_22),
            getString(R.string.a3_23),
            getString(R.string.a3_24),
            getString(R.string.a3_25),
            getString(R.string.a3_26),
            getString(R.string.a3_28),
            getString(R.string.a3_29),
            getString(R.string.a3_30),
            getString(R.string.a3_31),
            getString(R.string.a3_32),
            getString(R.string.a3_33),
            getString(R.string.a3_34),
            getString(R.string.a3_35),
            getString(R.string.a3_36),
            getString(R.string.a3_37),
            getString(R.string.a3_38),
            getString(R.string.a3_39),
            getString(R.string.a3_40),
            getString(R.string.a3_41),
            getString(R.string.a3_42),
            getString(R.string.a3_43),
            getString(R.string.a3_44),
            getString(R.string.a3_45),
            getString(R.string.a3_46),
            getString(R.string.a3_47)
        )

        var uzbekBook3 = arrayListOf<String>(getString(R.string.u3_1),
            getString(R.string.u3_2),
            getString(R.string.u3_3),
            getString(R.string.u3_4),
            getString(R.string.u3_5),
            getString(R.string.u3_6),
            getString(R.string.u3_7),
            getString(R.string.u3_8),
            getString(R.string.u3_9),
            getString(R.string.u3_10),
            getString(R.string.u3_11),
            getString(R.string.u3_12),
            getString(R.string.u3_13),
            getString(R.string.u3_14),
            getString(R.string.u3_15),
            getString(R.string.u3_16),
            getString(R.string.u3_17),
            getString(R.string.u3_18),
            getString(R.string.u3_19),
            getString(R.string.u3_20),
            getString(R.string.u3_21),
            getString(R.string.u3_22),
            getString(R.string.u3_23),
            getString(R.string.u3_24),
            getString(R.string.u3_25),
            getString(R.string.u3_26),
            getString(R.string.u3_28),
            getString(R.string.u3_29),
            getString(R.string.u3_30),
            getString(R.string.u3_31),
            getString(R.string.u3_32),
            getString(R.string.u3_33),
            getString(R.string.u3_34),
            getString(R.string.u3_35),
            getString(R.string.u3_36),
            getString(R.string.u3_37),
            getString(R.string.u3_38),
            getString(R.string.u3_39),
            getString(R.string.u3_40),
            getString(R.string.u3_41),
            getString(R.string.u3_42),
            getString(R.string.u3_43),
            getString(R.string.u3_44),
            getString(R.string.u3_45),
            getString(R.string.u3_46),
            getString(R.string.u3_47),
        )

        var arabicBook4 = arrayListOf<String>(getString(R.string.a4_1),
            getString(R.string.a4_2),
            getString(R.string.a4_3),
            getString(R.string.a4_4),
            getString(R.string.a4_5),
            getString(R.string.a4_6),
            getString(R.string.a4_7),
            getString(R.string.a4_8),
            getString(R.string.a4_9),
            getString(R.string.a4_10),
            getString(R.string.a4_11),
            getString(R.string.a4_12),
            getString(R.string.a4_13),
            getString(R.string.a4_14),
            getString(R.string.a4_15),
            getString(R.string.a4_16),
            getString(R.string.a4_17),
            getString(R.string.a4_18),
            getString(R.string.a4_19),
            getString(R.string.a4_20),
            getString(R.string.a4_21),
            getString(R.string.a4_22),
            getString(R.string.a4_23),
            getString(R.string.a4_24),
            getString(R.string.a4_25),
            getString(R.string.a4_26),
            getString(R.string.a4_27),
            getString(R.string.a4_28),
            getString(R.string.a4_29),
            getString(R.string.a4_30),
            getString(R.string.a4_31),
            getString(R.string.a4_32),
            getString(R.string.a4_33),
            getString(R.string.a4_34),
            getString(R.string.a4_35),
            getString(R.string.a4_36),
            getString(R.string.a4_37),
            getString(R.string.a4_38),
            getString(R.string.a4_39),
            getString(R.string.a4_40),
            getString(R.string.a4_41),
            getString(R.string.a4_42),
            getString(R.string.a4_43),
            getString(R.string.a4_44),
            getString(R.string.a4_45),
            getString(R.string.a4_46),
            getString(R.string.a4_47),
            getString(R.string.a4_48),
            getString(R.string.a4_49),
            getString(R.string.a4_50),
            getString(R.string.a4_51),
            getString(R.string.a4_52),
            getString(R.string.a4_53),
            getString(R.string.a4_54),
            getString(R.string.a4_55),
            getString(R.string.a4_56),
            getString(R.string.a4_57),
            getString(R.string.a4_58),
            getString(R.string.a4_59),
            getString(R.string.a4_60),
            getString(R.string.a4_61),
            getString(R.string.a4_62),
            getString(R.string.a4_63),
            getString(R.string.a4_64),
            getString(R.string.a4_65),
            getString(R.string.a4_66),
            getString(R.string.a4_67),
            getString(R.string.a4_68),
            getString(R.string.a4_69),
            getString(R.string.a4_70),
            getString(R.string.a4_71),
            getString(R.string.a4_72),
            getString(R.string.a4_73),
            getString(R.string.a4_74),
            getString(R.string.a4_75),
            getString(R.string.a4_76),
            getString(R.string.a4_77),
            getString(R.string.a4_78),
            getString(R.string.a4_79),
            getString(R.string.a4_80),
            getString(R.string.a4_81),
            getString(R.string.a4_82),
            getString(R.string.a4_83),
            getString(R.string.a4_84),
            getString(R.string.a4_85),
            getString(R.string.a4_86),
        )

        var uzbekBook4 = arrayListOf<String>(getString(R.string.u4_1),
            getString(R.string.u4_2),
            getString(R.string.u4_3),
            getString(R.string.u4_4),
            getString(R.string.u4_5),
            getString(R.string.u4_6),
            getString(R.string.u4_7),
            getString(R.string.u4_8),
            getString(R.string.u4_9),
            getString(R.string.u4_10),
            getString(R.string.u4_11),
            getString(R.string.u4_12),
            getString(R.string.u4_13),
            getString(R.string.u4_14),
            getString(R.string.u4_15),
            getString(R.string.u4_16),
            getString(R.string.u4_17),
            getString(R.string.u4_18),
            getString(R.string.u4_19),
            getString(R.string.u4_20),
            getString(R.string.u4_21),
            getString(R.string.u4_22),
            getString(R.string.u4_23),
            getString(R.string.u4_24),
            getString(R.string.u4_25),
            getString(R.string.u4_26),
            getString(R.string.u4_27),
            getString(R.string.u4_28),
            getString(R.string.u4_29),
            getString(R.string.u4_30),
            getString(R.string.u4_31),
            getString(R.string.u4_32),
            getString(R.string.u4_33),
            getString(R.string.u4_34),
            getString(R.string.u4_35),
            getString(R.string.u4_36),
            getString(R.string.u4_37),
            getString(R.string.u4_38),
            getString(R.string.u4_39),
            getString(R.string.u4_40),
            getString(R.string.u4_41),
            getString(R.string.u4_42),
            getString(R.string.u4_43),
            getString(R.string.u4_44),
            getString(R.string.u4_45),
            getString(R.string.u4_46),
            getString(R.string.u4_47),
            getString(R.string.u4_48),
            getString(R.string.u4_49),
            getString(R.string.u4_50),
            getString(R.string.u4_51),
            getString(R.string.u4_52),
            getString(R.string.u4_53),
            getString(R.string.u4_54),
            getString(R.string.u4_55),
            getString(R.string.u4_56),
            getString(R.string.u4_57),
            getString(R.string.u4_58),
            getString(R.string.u4_59),
            getString(R.string.u4_60),
            getString(R.string.u4_61),
            getString(R.string.u4_62),
            getString(R.string.u4_63),
            getString(R.string.u4_64),
            getString(R.string.u4_65),
            getString(R.string.u4_66),
            getString(R.string.u4_67),
            getString(R.string.u4_68),
            getString(R.string.u4_69),
            getString(R.string.u4_70),
            getString(R.string.u4_71),
            getString(R.string.u4_72),
            getString(R.string.u4_73),
            getString(R.string.u4_74),
            getString(R.string.u4_75),
            getString(R.string.u4_76),
            getString(R.string.u4_77),
            getString(R.string.u4_78),
            getString(R.string.u4_79),
            getString(R.string.u4_80),
            getString(R.string.u4_81),
            getString(R.string.u4_82),
            getString(R.string.u4_83),
            getString(R.string.u4_84),
            getString(R.string.u4_85),
            getString(R.string.u4_86),
        )

        if (book == 1){
            arabic = arabicBook1[lesson]
            uzbek = uzbekBook1[lesson]
        }
        else if(book == 2){
            arabic = arabicBook2[lesson]
            uzbek = uzbekBook2[lesson]
        }
        else if(book == 3){
            arabic = arabicBook3[lesson]
            uzbek = uzbekBook3[lesson]
        }
        else if(book == 4){
            arabic = arabicBook4[lesson]
            uzbek = uzbekBook4[lesson]
        }
        else if(book == 5){
            arabic = arabicBook4[lesson+43]
            uzbek = uzbekBook4[lesson+43]
        }

        binding.arabicTv.text = arabic
        binding.uzbekTv.text = uzbek

        binding.settings.setOnClickListener {
            if (!isOpen){
                binding.arabicToUzb.alpha = 0.0f
                binding.settings.animate().rotation(-370f).duration = 2400

                isOpen = true
                binding.mainMotion.transitionToEnd()
                binding.mainMotion.addTransitionListener(object : MotionLayout.TransitionListener{
                    override fun onTransitionStarted(
                        motionLayout: MotionLayout?,
                        startId: Int,
                        endId: Int
                    ) {

                    }

                    override fun onTransitionChange(
                        motionLayout: MotionLayout?,
                        startId: Int,
                        endId: Int,
                        progress: Float
                    ) {

                    }

                    override fun onTransitionCompleted(
                        motionLayout: MotionLayout?,
                        currentId: Int
                    ) {
                        binding.seekbar.visibility = View.VISIBLE
                        binding.openSeekbar.animate().translationX(-binding.seekbar.width-30f).duration = 1000
                        binding.arabicToUzb.animate().alpha(1.0f).duration = 800
                    }

                    override fun onTransitionTrigger(
                        motionLayout: MotionLayout?,
                        triggerId: Int,
                        positive: Boolean,
                        progress: Float
                    ) {
                    }

                })
            }
            else{
                isOpen = false
                binding.settings.animate().rotation(0f).duration = 2200
                binding.arabicToUzb.animate().alpha(0.0f).duration = 700
                binding.openSeekbar.animate().translationX(0f).setDuration(1000).withEndAction {
                    binding.seekbar.visibility = View.INVISIBLE
                    binding.mainMotion.transitionToStart()
                }
            }
        }

        binding.seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.arabicTv.alpha = 0.0f
                binding.uzbekTv.alpha = 0.0f

                binding.arabicTv.animate().alpha(1.0f).duration = 650
                binding.uzbekTv.animate().alpha(1.0f).duration = 650

                binding.arabicTv.textSize = 16+binding.seekbar.progress.toFloat()
                binding.uzbekTv.textSize = 16+binding.seekbar.progress.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        binding.motion.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }
            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }
            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                cardClose = currentId == R.id.end
            }
            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }

        })

        binding.arabicToUzb.setOnClickListener {
            if (!arabicToUzbek){
                arabicToUzbek = true
                binding.arabicTv.alpha = 0.0f
                binding.uzbekTv.alpha = 0.0f
                binding.arabicTv.animate().alpha(1.0f).duration = 1100
                binding.uzbekTv.animate().alpha(1.0f).duration = 1100
                binding.arabicTv.text = uzbek
                binding.uzbekTv.text = arabic
                binding.arabicToUzb.animate().rotation(130f).duration = 800
            }
            else{
                binding.arabicTv.alpha = 0.0f
                binding.uzbekTv.alpha = 0.0f
                binding.arabicTv.animate().alpha(1.0f).duration = 1100
                binding.uzbekTv.animate().alpha(1.0f).duration = 1100
                binding.arabicTv.text = arabic
                binding.uzbekTv.text = uzbek
                arabicToUzbek = false
                binding.arabicToUzb.animate().rotation(-50f).duration = 800
            }
        }

        binding.toolbar.setNavigationOnClickListener {
            super.onBackPressed()
        }

    }

    override fun onBackPressed() {
        if (cardClose){
            binding.motion.transitionToStart()
        }
        else{
            super.onBackPressed()
        }
    }
}