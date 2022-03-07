package com.amrabdelhamiddiab.searchbarinrecyclerview

import com.airbnb.epoxy.AutoModel
import com.airbnb.epoxy.EpoxyAsyncUtil
import com.airbnb.epoxy.TypedEpoxyController

class HomeEpoxyController : TypedEpoxyController<List<String>>(
    EpoxyAsyncUtil.getAsyncBackgroundHandler(),
    EpoxyAsyncUtil.getAsyncBackgroundHandler()
) {

    override fun buildModels(data: List<String>?) {

        data?.forEach { it ->
            if (it == "0") {
                homeCell {
                    id(it)
                }
            } else {
                categories {
                    id(it)
                }
            }


        }

    }

}