package com.example.mvp_example.code.test.backend.model

import com.example.mvp_example.code.general_params_portfolio.model.IGeneralPortfolioParamsModel
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItem
import com.example.mvp_example.code.general_params_portfolio.model.objects.GeneralPortfolioItemProfitUnderscorePercent
import com.google.gson.Gson
import java.io.File

class GeneralPortfolioParamsCorrectTest: IGeneralPortfolioParamsModel {
    override fun takeCostElement(): GeneralPortfolioItem {
        val jsonFile = File("D:\\Programs\\Kotlin\\mvp-example\\app\\src\\main\\java\\com\\example\\mvp_example\\code\\test\\backend\\model\\json\\correctType.json")
        val jsonString = jsonFile.readText()

        val item: GeneralPortfolioItem = Gson().fromJson(jsonString, GeneralPortfolioItem::class.java)

        return item;
    }

    override fun takeTotalProfitElement(): GeneralPortfolioItemProfitUnderscorePercent {
        val item: GeneralPortfolioItemProfitUnderscorePercent = GeneralPortfolioItemProfitUnderscorePercent("total_profit", 140813.93f, false, 27.18f);

        return item;
    }

    override fun takeProfitabilityElement(): GeneralPortfolioItem {
        val jsonFile = File("D:\\Programs\\Kotlin\\mvp-example\\app\\src\\main\\java\\com\\example\\mvp_example\\code\\test\\backend\\model\\json\\correctIncorrectTypes.json")
        val jsonString = jsonFile.readText()

        val item: Array<GeneralPortfolioItem> = Gson().fromJson(jsonString, Array<GeneralPortfolioItem>::class.java)

        return item[0];
    }

    override fun takeChangePerDayElement(): GeneralPortfolioItemProfitUnderscorePercent {
        val item: GeneralPortfolioItemProfitUnderscorePercent = GeneralPortfolioItemProfitUnderscorePercent("change_per_day", -2540.29f, false, -0.4f);

        return item;
    }

}