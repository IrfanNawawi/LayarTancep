package id.heycoding.home.presentation.ui.dashboard


import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import id.heycoding.core.base.BaseFragment
import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.home.data.remote.model.viewparam.UpcomingViewParam
import id.heycoding.home.databinding.FragmentDashboardBinding
import id.heycoding.home.presentation.adapter.PopularAdapter
import id.heycoding.home.presentation.adapter.PopularAdapterClickListener
import id.heycoding.home.presentation.adapter.UpcomingAdapter
import id.heycoding.home.presentation.adapter.UpcomingAdapterClickListener
import id.heycoding.home.presentation.ui.home.HomeViewModel
import id.heycoding.shared.utils.ext.subscribe
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class DashboardFragment : BaseFragment<FragmentDashboardBinding, HomeViewModel>(
    FragmentDashboardBinding::inflate
) {
    override val viewModel: HomeViewModel by sharedViewModel()

    private val popularAdapter: PopularAdapter by lazy {
        PopularAdapter(object : PopularAdapterClickListener {
            override fun onPopularMovieClicked(popularViewParam: PopularViewParam) {
                Toast.makeText(requireContext(), "This Popular", Toast.LENGTH_SHORT).show()
            }

        })
    }

    private val upcomingAdapter: UpcomingAdapter by lazy {
        UpcomingAdapter(object : UpcomingAdapterClickListener {
            override fun onUpcomingMovieClicked(upcomingViewParam: UpcomingViewParam) {
                Toast.makeText(requireContext(), "This Popular", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setupRecyclerView() {
        binding.layoutSectionMovie.apply {
            rvMoviePopular.apply {
                adapter = popularAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                clipToPadding = false
                clipChildren = false
                val snapHelper: SnapHelper = LinearSnapHelper()
                snapHelper.attachToRecyclerView(rvMoviePopular)
            }
        }
        binding.layoutSectionMovie.apply {
            rvMovieUpcoming.apply {
                adapter = upcomingAdapter
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                clipToPadding = false
                clipChildren = false
                val snapHelper: SnapHelper = LinearSnapHelper()
                snapHelper.attachToRecyclerView(rvMovieUpcoming)
            }
        }
    }

    override fun initView() {
        setupRecyclerView()
        initData()
    }

    override fun observeData() {
        super.observeData()

        viewModel.homePopularResult.observe(viewLifecycleOwner) {
            it.subscribe(
                doOnSuccess = { result ->
                    showLoading(false)
                    result.payload?.let { data ->
                        popularAdapter.setItems(data)
                    }
                },
                doOnLoading = {
                    showLoading(true)
                },
                doOnError = { error ->
                    showLoading(false)
                    error.exception?.let { e -> showError(true, e) }
                }
            )
        }
        viewModel.homeUpcomingResult.observe(viewLifecycleOwner) {
            it.subscribe(
                doOnSuccess = { result ->
                    showLoading(false)
                    result.payload?.let { data ->
                        upcomingAdapter.setItems(data)
                    }
                },
                doOnLoading = {
                    showLoading(true)
                },
                doOnError = { error ->
                    showLoading(false)
                    error.exception?.let { e -> showError(true, e) }
                }
            )
        }
    }


    private fun initData() {
        viewModel.fetchHomePopular()
        viewModel.fetchHomeUpcoming()
    }

    private fun showLoading(isShowLoading: Boolean) {
        binding.pbHome.isVisible = isShowLoading
    }

}