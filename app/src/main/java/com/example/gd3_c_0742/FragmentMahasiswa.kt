package com.example.gd3_c_0742

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0742.entity.Mahasiswa


class FragmentMahasiswa : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mahasiswa, container, false)
    }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)
       val layaoutManager = LinearLayoutManager(context)
       val adapter :  RVMahasiswaAdapter = RVMahasiswaAdapter(Mahasiswa.listOfMahasiswa)

       // Menghubungkan rvMahasiswa dnegan recycler view yang ada pada layout
       val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_mahasiswa)

       // set layout manager dari recycler view
       rvMahasiswa.layoutManager = layaoutManager

       // tidak mengubah size recylcer view jika terdapat item ditambahkan atau dikurangkan
       rvMahasiswa.setHasFixedSize(true)

       // set adapter dari recycler view.
       rvMahasiswa.adapter = adapter
   }
}