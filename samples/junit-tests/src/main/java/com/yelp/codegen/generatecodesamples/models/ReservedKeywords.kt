/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: JUnit Tests
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package com.yelp.codegen.generatecodesamples.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * @property `class`
 * @property `for`
 * @property `operator`
 * @property `val`
 * @property `var`
 * @property `when`
 */
@JsonClass(generateAdapter = true)
data class ReservedKeywords(
    @Json(name = "class") @field:Json(name = "class") var `class`: String? = null,
    @Json(name = "for") @field:Json(name = "for") var `for`: String? = null,
    @Json(name = "operator") @field:Json(name = "operator") var `operator`: String? = null,
    @Json(name = "val") @field:Json(name = "val") var `val`: String? = null,
    @Json(name = "var") @field:Json(name = "var") var `var`: String? = null,
    @Json(name = "when") @field:Json(name = "when") var `when`: String? = null,
)
