package mr.sardorek.anbiyolarqissasi.recyclerview

import android.annotation.SuppressLint
import android.app.ActionBar
import android.content.Context
import android.content.Intent
import android.os.Binder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import mr.sardorek.anbiyolarqissasi.BookActivity
import mr.sardorek.anbiyolarqissasi.databinding.MainDesignBinding

class Adapter(var context : Context, number : Int,var book : Int):RecyclerView.Adapter<Adapter.ViewHolder>() {

    var lessons = LessonsBase.getLessons(context,number,book)

    inner class ViewHolder(var binding: ViewBinding) : RecyclerView.ViewHolder(binding.root){

        @SuppressLint("SetTextI18n")
        fun getLesson(darslar: Darslar){
            var binding = binding as MainDesignBinding
            binding.imageBook.setBackgroundResource(darslar.image)
            if (book == 1 || book == 2){
                if (adapterPosition == 0){
                    binding.title1.text = darslar.lesson
                    binding.line1.layoutParams.height = ActionBar.LayoutParams.MATCH_PARENT
                    binding.title2.visibility = View.GONE
                }
                else{
                    binding.line1.layoutParams.height = ActionBar.LayoutParams.WRAP_CONTENT
                    binding.title2.visibility = View.VISIBLE
                    binding.title1.text = "${darslar.lesson} дарс"
                    binding.title2.text = darslar.arabic
                }
            }
            else{
                binding.line1.layoutParams.height = ActionBar.LayoutParams.WRAP_CONTENT
                binding.title2.visibility = View.VISIBLE
                binding.title1.text = "${darslar.lesson} дарс"
                binding.title2.text = darslar.arabic
            }
            binding.cardView2.alpha = 0.0f
            binding.cardView2.animate().alpha(1.0f).duration = 650

            binding.cardView2.setOnClickListener {
                val intent = Intent(context, BookActivity::class.java)
                intent.putExtra("book","$book")
                intent.putExtra("lesson","$adapterPosition")
                intent.putExtra("title","${darslar.lesson}")
                context.startActivity(intent)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MainDesignBinding.inflate(LayoutInflater.from(context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getLesson(lessons[position])
    }

    override fun getItemCount() = lessons.size

}