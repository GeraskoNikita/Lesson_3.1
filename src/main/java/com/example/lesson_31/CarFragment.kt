package com.example.lesson_31

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_31.databinding.FragmentCarBinding

class CarFragment : Fragment() {
    private lateinit var binding: FragmentCarBinding
    lateinit var carlist: List<CarModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarBinding.inflate(inflater,container,false)
        initData()
        inintView()
        return binding.root


    }

    private fun inintView() {

        binding.rvCar.adapter = CarAdapter(carlist)
    }

    private fun initData() {
        carlist = listOf(
            CarModel(
                title = "BMW X1",
                img = "https://keyauto-probeg.ru/storage/uploads/IMerC5dEufIhLMalHHS7dYAnGOjhxm6ipyJvwwAs.png",
                price = "€ 700",
                status = "Confirm the Rental Request",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Audi",
                img = "https://ir-3.ozone.ru/s3/multimedia-0/c1000/6757122024.jpg",
                price = "€ 300",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Audi A6 2.7 V6 ",
                img = "https://carinvest-europe.com/image/cache/catalog/audi/9/content-uploads-2023-05-audi-a6-2-7-v6-tdi-quattro-2006-1-1-800x600.jpeg",
                price = "€ 700",
                status = "Rental Payment",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = " Zeekr 001 – 200",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2Fe%2Fe%2F7%2Fee7d1f79b67af7a1e4b8c7ded617a4dc_1200x900.jpeg&w=3840&q=75",
                price = "€ 700",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = " Zeekr 001 – 200",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2F6%2Fd%2F5%2F6d51cb4d5c5bc6fe2855337820d434c3_1200x900.jpeg&w=3840&q=75",
                price = "€ 700",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "2021 Bugatti Chiron Super Sport",
                img = "https://www.a777aa77.ru/bugatti/2021-bugatti-chiron-super-sport.jpg",
                price = "€ 15000",
                status = "Rental Payment",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Mercedes-AMG G 63 ",
                img = "https://4x4.media/thumb.php?src=%2Fupload%2Fiblock%2F770%2Ffa9yqw4o4inwld6nb0q04r9gbhhw5zzr%2Ff958aa7efe2111a7d3328ef4c2164c71d02bc7a8.jpg&w=990&q=92",
                price = "€ 1000",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Lada (ВАЗ) 2107:",
                img = "https://avatars.mds.yandex.net/get-verba/997355/2a00000197b2e350320dae20b801fff820c0/cattouchretcr",
                price = "€ 700",
                status = "Confirm the Rental Request",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = " LiXiang L9 – 210",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2F3%2F8%2Ff%2F38ffb0264290eaadbf4f0f1e2fba702d_1200x900.jpeg&w=3840&q=75",
                price = "€ 700",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = " Geely Monjaro – 800",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2F2%2Fd%2F8%2F2d8f5f1c7effa95bab43baca2cb74339_1200x900.jpeg&w=3840&q=75",
                price = "€ 700",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = " Geely Monjaro – 800",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2Fa%2F7%2F6%2Fa76d8666e96f5de25c14561942fdbef4_1200x900.jpeg&w=3840&q=75",
                price = "€ 500",
                status = "Rental Payment",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Volkswagen ID.4",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2Ff%2F8%2F5%2Ff8518ffa9d91254da884f77d6e37b5ad_1200x900.jpeg&w=3840&q=75",
                price = "€ 300",
                status = "Active Rental",
                data = "18 Aug - 20 Aug"
            ), CarModel(
                title = "Geely Coolray",
                img = "https://drive.mashina.kg/_next/image?url=https%3A%2F%2Fim.mashina.kg%2Ftachka%2Fimages%2F%2Fcommunity%2F9%2Ff%2Fa%2F9fad76a15230f79bb3e1f4b802084c56_1200x900.jpeg&w=3840&q=75",
                price = "€ 300",
                status = "Confirm the Rental Requestl",
                data = "18 Aug - 20 Aug"
            )
        )
    }




}