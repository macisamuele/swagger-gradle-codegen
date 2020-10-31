/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property xmodelOnly
 */
@JsonClass(generateAdapter = true)
data class ModelWithOnlyXModel(
    @Json(name = "xmodel_only") @field:Json(name = "xmodel_only") var xmodelOnly: ModelWithOnlyXModel.XmodelOnlyEnum? = null,
) {
    /**
     * Values:
     *     VAL1,
     *     VAL2,
     */
    @JsonClass(generateAdapter = false)
    enum class XmodelOnlyEnum(val value: String) {
        @Json(name = "val1") VAL1("val1"),
        @Json(name = "val2") VAL2("val2"),
    }
}
