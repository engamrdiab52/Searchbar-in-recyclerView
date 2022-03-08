package com.amrabdelhamiddiab.searchbarinrecyclerview

import com.airbnb.epoxy.EpoxyAsyncUtil
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.carousel

class HomeEpoxyController : TypedEpoxyController<List<String>>(
    EpoxyAsyncUtil.getAsyncBackgroundHandler(),
    EpoxyAsyncUtil.getAsyncBackgroundHandler()
) {

    override fun buildModels(data: List<String>?) {
        /*homeCell{
            id("title Id")
        }*/
        title {
            id("title")
        }
        categories {
            id("categories_Id")
        }

        val carocelItem = data?.map{
            CarocellBindingModel_().id(it)
        }
        //this is a extension function not the constructor
        carousel {
            id("carocell")
            carocelItem?.let { models(it) }
        }
/*        data?.forEach { it ->
            if (it == "0") {
                homeCell {
                    id(it)
                }
            } else {
                categories {
                    id(it)
                }
            }


        }*/

    }

}