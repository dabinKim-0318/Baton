package com.depromeet.baton.presentation.ui.writepost.view

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
<<<<<<< HEAD
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.FrameLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.depromeet.baton.R
import com.depromeet.baton.databinding.FragmentBottomSelfWriteBinding
=======
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.depromeet.baton.R
import com.depromeet.baton.databinding.FragmentBottomSelfWriteBinding
import com.depromeet.baton.presentation.ui.writepost.viewmodel.ShopInfo
>>>>>>> dabin/home-filter
import com.depromeet.baton.presentation.ui.writepost.viewmodel.WritePostViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
<<<<<<< HEAD
=======
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
>>>>>>> dabin/home-filter


@AndroidEntryPoint
class BottomSelfWriteFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentBottomSelfWriteBinding? = null
    private val binding get() = _binding ?: error("View를 참조하기 위해 binding이 초기화되지 않았습니다.")
    private val writePostViewModel: WritePostViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bottom_self_write, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
<<<<<<< HEAD
        setBackBtnClickListener()
        setCloseBtnClickListener()
=======

        writePostViewModel.selfWriteAddressUiState
            .flowWithLifecycle(lifecycle)
            .onEach { uiState -> binding.uiState = uiState }
            .launchIn(lifecycleScope)

        writePostViewModel.viewEvents
            .flowWithLifecycle(lifecycle)
            .onEach(::handleViewEvents)
            .launchIn(lifecycleScope)


        setInitClickListener()
>>>>>>> dabin/home-filter
        setCitySpinner()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), R.style.BottomSheetDialog).apply {
            setOnShowListener { setupFullHeight(it as BottomSheetDialog) }
        }
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {
        val bottomSheet =
            bottomSheetDialog.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        val behavior = BottomSheetBehavior.from(bottomSheet!!)
        behavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

<<<<<<< HEAD
    private fun setBackBtnClickListener() {
        binding.bdsAppbarSelfWrite.setOnBackwardClick {
            writePostViewModel.setSearchShopPosition(WritePostViewModel.SEARCH_SHOP)
        }
    }

    private fun setCloseBtnClickListener() {
=======
    private fun handleViewEvents(viewEvents: List<WritePostViewModel.ViewEvent>) {
        viewEvents.firstOrNull()?.let { viewEvent ->
            when (viewEvent) {
                WritePostViewModel.ViewEvent.SelfWriteAddressDone -> {
                    with(writePostViewModel.selfWriteAddressUiState.value) {
                        writePostViewModel.setSelectShop(
                            ShopInfo(
                                "$center $centerName",
                                "${binding.spinnerSelfWriteCity.selectedItem} ${binding.spinnerSelfWriteRegion.selectedItem} $detailAddress"
                            )
                        )
                    }
                    writePostViewModel.setSearchShopPosition(WritePostViewModel.DIALOG_DISMISS)
                }
            }
            writePostViewModel.consumeViewEvent(viewEvent)
        }
    }

    private fun setInitClickListener() {
        binding.bdsAppbarSelfWrite.setOnBackwardClick {
            writePostViewModel.setSearchShopPosition(WritePostViewModel.SEARCH_SHOP)
        }

>>>>>>> dabin/home-filter
        binding.bdsAppbarSelfWrite.setOnIconClick {
            writePostViewModel.setSearchShopPosition(WritePostViewModel.DIALOG_DISMISS)
        }
    }

<<<<<<< HEAD
    private fun setCitySpinner() {
        val items = requireContext().resources.getStringArray(R.array.spinner_region)
        val myAdapter = object : ArrayAdapter<String>(requireContext(), R.layout.item_region_spinner) {
=======
    @SuppressLint("DiscouragedPrivateApi")
    private fun setCitySpinner() {
        val items = requireContext().resources.getStringArray(R.array.spinner_region)
        val spinnerAdapter = object : ArrayAdapter<String>(requireContext(), R.layout.item_region_spinner) {
>>>>>>> dabin/home-filter
            @SuppressLint("CutPasteId")
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val tv = super.getView(position, convertView, parent)

                if (position == count) {
                    (tv.findViewById<View>(R.id.tvItemSpinner) as TextView).text = ""
                    (tv.findViewById<View>(R.id.tvItemSpinner) as TextView).hint = getItem(count)
                }
                return tv
            }

            override fun getCount(): Int {
                return super.getCount() - 1
            }
        }

<<<<<<< HEAD
        myAdapter.addAll(items.toMutableList())
        myAdapter.add("시/도")


        binding.spinnerSelfWriteCity.adapter = myAdapter

        binding.spinnerSelfWriteCity.setSelection(myAdapter.count)

=======
        spinnerAdapter.addAll(items.toMutableList())
        spinnerAdapter.add("시/도")


        binding.spinnerSelfWriteCity.adapter = spinnerAdapter
        binding.spinnerSelfWriteCity.setSelection(spinnerAdapter.count)
>>>>>>> dabin/home-filter

        binding.spinnerSelfWriteCity.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    0 -> setRegionSpinner(R.array.spinner_region_seoul)
                    1 -> setRegionSpinner(R.array.spinner_region_busan)
                    2 -> setRegionSpinner(R.array.spinner_region_daegu)
                    3 -> setRegionSpinner(R.array.spinner_region_incheon)
                    4 -> setRegionSpinner(R.array.spinner_region_gwangju)
                    5 -> setRegionSpinner(R.array.spinner_region_daejeon)
                    6 -> setRegionSpinner(R.array.spinner_region_ulsan)
                    7 -> setRegionSpinner(R.array.spinner_region_sejong)
                    8 -> setRegionSpinner(R.array.spinner_region_gyeonggi)
                    9 -> setRegionSpinner(R.array.spinner_region_gangwon)
                    10 -> setRegionSpinner(R.array.spinner_region_chung_buk)
                    11 -> setRegionSpinner(R.array.spinner_region_chung_nam)
                    12 -> setRegionSpinner(R.array.spinner_region_jeon_buk)
                    13 -> setRegionSpinner(R.array.spinner_region_jeon_nam)
                    14 -> setRegionSpinner(R.array.spinner_region_gyeong_buk)
                    15 -> setRegionSpinner(R.array.spinner_region_gyeong_nam)
                    16 -> setRegionSpinner(R.array.spinner_region_jeju)
                    else -> {
                    }
                }
<<<<<<< HEAD
=======
                binding.uiState!!.onCitySelected.invoke(position)
>>>>>>> dabin/home-filter
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }

    private fun setRegionSpinner(array: Int) {
        binding.tvSelfWriteRegion.visibility = View.INVISIBLE
        val items = requireContext().resources.getStringArray(array)
<<<<<<< HEAD
        val myAdapter = ArrayAdapter<String>(requireContext(), R.layout.item_region_spinner, items)
        binding.spinnerSelfWriteRegion.adapter = myAdapter
=======
        val spinnerAdapter = ArrayAdapter(requireContext(), R.layout.item_region_spinner, items)
        binding.spinnerSelfWriteRegion.adapter = spinnerAdapter
        binding.spinnerSelfWriteRegion.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                binding.uiState!!.onRegionSelected.invoke(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
>>>>>>> dabin/home-filter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
<<<<<<< HEAD
}
=======
}


data class SelfWriteAddressUiState(
    val center: String,
    val centerName: String,
    val detailAddress: String,
    val citySelected: String,
    val regionSelected: String,
    val onCenterNameChanged: (Editable?) -> Unit,
    val onCenterChanged: (Editable?) -> Unit,
    val onCitySelected: (Int?) -> Unit,
    val onRegionSelected: (Int?) -> Unit,
    val onDetailAddressChanged: (Editable?) -> Unit,
    val onSelfWriteAddressDoneClick: () -> Unit,
) {

    private val isCenterValid = center.isNotBlank()
    private val isCenterNameValid = centerName.isNotBlank()
    private val isDetailAddressValid = detailAddress.isNotBlank()
    private val isCityValid = citySelected.isNotBlank()
    private val isRegionValid = regionSelected.isNotBlank()

    val isEnabled = isCenterValid && isCenterNameValid && isDetailAddressValid && isCityValid && isRegionValid
}
>>>>>>> dabin/home-filter
