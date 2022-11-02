package com.example.lav18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    fun setSelectedItem(selectedItem: String?) {
        val view = view?.findViewById<TextView>(R.id.textView)
        view?.text = selectedItem

        if (selectedItem == "Джек-рассел-терьер"){
            view?.text = "Джек-рассел-терьер ранее был знаменит своими рабочими качествами норной собаки, однако мало кто из современных заводчиков планомерно развивает заложенные в генах этих резвых малышей охотничьи инстинкты." +
                    "В ХХ веке они превратились в преданных и забавных спутников, настоящих любимцев семей, которые привыкли проводить свой досуг активно."
        }
        if (selectedItem == "Афганская борзая"){
            view?.text = "Афганская борзая – самолюбивая «светская дама», не выносящая фамильярности, но обожающая приятное общение и подвижные игры. " +
                    "Это одна из самых интеллигентных пород, представителей которой вы никогда не увидите спорящими с другими собаками из-за косточки или борющимися с собственным владельцем за статус главы дома."
        }
        if (selectedItem == "Бассет-хаунд"){
            view?.text = "Бассет-хаунд– корпулентный коротконожка со взглядом вечного обиженки и душой неутомимого охотника. Эта собака ни в коем случае не меланхолик, хотя именно на него и смахивает больше всего, а вполне общительный и жизнерадостный питомец." +
                    " Впрочем, сказать, что с бассет-хаундом всегда легко и ненапряжно – будет полуправдой."
        }
        if (selectedItem == "Бигль"){
            view?.text = "Бигль мгновенно покоряет своим недюжинным обаянием. Ореховые глаза собаки смотрят прямо в душу, особенно если животное намерено выпросить у вас лакомый кусочек." +
                    " Очаровательный вид непоседы идеально гармонирует с его характером, так что не стоит ждать от бигля кротости и спокойствия. "
        }
        if (selectedItem == "Алабай"){
            view?.text = "Алабай – одна из самых древних пород, дошедшая до сегодняшнего дня практически в первозданном виде. " +
                    "Изначально выведенная как пастушья и сторожевая собака, алабай и по сей день сохранил ярко выраженные инстинкты охранника и бесстрашного защитника."
        }
    }
}