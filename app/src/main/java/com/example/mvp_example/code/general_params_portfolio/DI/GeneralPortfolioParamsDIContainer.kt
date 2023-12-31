package com.example.mvp_example.code.general_params_portfolio.DI

import com.example.mvp_example.code.general_params_portfolio.model.GeneralPortfolioParamsStubModel
import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.presenter.GeneralPortfolioParamsPresenter
import com.example.mvp_example.code.general_params_portfolio.presenter.IGeneralPortfolioParamsPresenter
import org.koin.dsl.module

val portfolioParamsModule = module {
    single<IGeneralPortfolioParamsModel> {
        GeneralPortfolioParamsStubModel()
    }

    single<IGeneralPortfolioParamsPresenter> {
        GeneralPortfolioParamsPresenter(get())
    }
}