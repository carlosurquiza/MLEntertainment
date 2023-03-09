package cl.cdum.mlentertainment.util

import androidx.room.TypeConverter
import cl.cdum.mlentertainment.data.model.categoryItemDetail.*
import cl.cdum.mlentertainment.data.model.categoryItemDetail.Attribute
import cl.cdum.mlentertainment.data.model.categoryItemDetail.SellerAddress
import cl.cdum.mlentertainment.data.model.categoryItemDetail.Shipping
import cl.cdum.mlentertainment.data.model.categoryItems.*
import cl.cdum.mlentertainment.data.model.homeCategories.ChannelsSetting
import cl.cdum.mlentertainment.data.model.homeCategories.ChildrenCategory
import cl.cdum.mlentertainment.data.model.homeCategories.PathFromRoot
import cl.cdum.mlentertainment.data.model.homeCategories.SettingsX
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {
    @TypeConverter
    fun restoreAvailableFilterList(objectToRestore: String?): List<AvailableFilter>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<AvailableFilter>?>() {}.type)
    }

    @TypeConverter
    fun saveAvailableFilterList(objectToSave: List<AvailableFilter>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreAvailableSortList(objectToRestore: String?): List<AvailableSort>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<AvailableSort>?>() {}.type)
    }

    @TypeConverter
    fun saveAvailableSortList(objectToSave: List<AvailableSort>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreFilterList(objectToRestore: String?): List<Filter>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<Filter>?>() {}.type)
    }

    @TypeConverter
    fun saveFilterList(objectToSave: List<Filter>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreResultList(objectToRestore: String?): List<CategoryResult>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<CategoryResult>?>() {}.type)
    }

    @TypeConverter
    fun saveResultList(objectToSave: List<CategoryResult>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restorePaging(objectToRestore: String?): Paging? {
        return Gson().fromJson(objectToRestore, object : TypeToken<Paging?>() {}.type)
    }

    @TypeConverter
    fun savePaging(objectToSave: Paging?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreSort(objectToRestore: String?): Sort? {
        return Gson().fromJson(objectToRestore, object : TypeToken<Sort?>() {}.type)
    }

    @TypeConverter
    fun saveSort(objectToSave: Sort?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreAttributeList(objectToRestore: String?): List<Attribute>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<Attribute>?>() {}.type)
    }

    @TypeConverter
    fun saveAttributeList(objectToSave: List<Attribute>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreChannelsSettingList(objectToRestore: String?): List<ChannelsSetting>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<ChannelsSetting>?>() {}.type)
    }

    @TypeConverter
    fun saveChannelsSettingList(objectToSave: List<ChannelsSetting>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreChildrenCategoryList(objectToRestore: String?): List<ChildrenCategory>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<ChildrenCategory>?>() {}.type)
    }

    @TypeConverter
    fun saveChildrenCategoryList(objectToSave: List<ChildrenCategory>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restorePathFromRootList(objectToRestore: String?): List<PathFromRoot>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<PathFromRoot>?>() {}.type)
    }

    @TypeConverter
    fun savePathFromRootList(objectToSave: List<PathFromRoot>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreSettingsX(objectToRestore: String?): SettingsX? {
        return Gson().fromJson(objectToRestore, object : TypeToken<SettingsX?>() {}.type)
    }

    @TypeConverter
    fun saveSettingsX(objectToSave: SettingsX?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreStringList(objectToRestore: String?): List<String>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<String>?>() {}.type)
    }

    @TypeConverter
    fun saveStringList(objectToSave: List<String>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreLocation(objectToRestore: String?): Location? {
        return Gson().fromJson(objectToRestore, object : TypeToken<Location?>() {}.type)
    }

    @TypeConverter
    fun saveLocation(objectToSave: Location?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restorePictureList(objectToRestore: String?): List<Picture>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<Picture>?>() {}.type)
    }

    @TypeConverter
    fun savePictureList(objectToSave: List<Picture>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreSaleTermList(objectToRestore: String?): List<SaleTerm>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<SaleTerm>?>() {}.type)
    }

    @TypeConverter
    fun saveSaleTermList(objectToSave: List<SaleTerm>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreSellerAddress(objectToRestore: String?): SellerAddress? {
        return Gson().fromJson(objectToRestore, object : TypeToken<SellerAddress?>() {}.type)
    }

    @TypeConverter
    fun saveSellerAddress(objectToSave: SellerAddress?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreShipping(objectToRestore: String?): Shipping? {
        return Gson().fromJson(objectToRestore, object : TypeToken<Shipping?>() {}.type)
    }

    @TypeConverter
    fun saveShipping(objectToSave: Shipping?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restorePaymentMethodList(objectToRestore: String?): List<PaymentMethod>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<PaymentMethod>?>() {}.type)
    }

    @TypeConverter
    fun savePaymentMethodList(objectToSave: List<PaymentMethod>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreSubStatusList(objectToRestore: String?): List<SubStatus>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<SubStatus>?>() {}.type)
    }

    @TypeConverter
    fun saveSubStatusList(objectToSave: List<SubStatus>?): String? {
        return Gson().toJson(objectToSave)
    }

    @TypeConverter
    fun restoreVariationList(objectToRestore: String?): List<Variation>? {
        return Gson().fromJson(objectToRestore, object : TypeToken<List<Variation>?>() {}.type)
    }

    @TypeConverter
    fun saveVariationList(objectToSave: List<Variation>?): String? {
        return Gson().toJson(objectToSave)
    }
}