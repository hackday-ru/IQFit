package com.buildforyourself.iqfit.data

import android.graphics.drawable.BitmapDrawable
import com.buildforyourself.iqfit.model.*
import java.util.*

class FakeDataProvider : IDataProvider {
    override fun saveFood(food: Food) {
        throw UnsupportedOperationException()
    }

    override fun saveDefaultComponents(foodCategory: FoodCategory) {
        throw UnsupportedOperationException()
    }

    override fun saveFoodCategory(foodCategory: FoodCategory) {
        throw UnsupportedOperationException()
    }

    override fun loadUser(): User {
        throw UnsupportedOperationException()
    }

    override fun saveUser(user: User) {
        throw UnsupportedOperationException()
    }

    override fun loadFood(): List<Food> {

        val foodCategories = loadFoodCategories();

        var food = listOf (
                Food (1, foodCategories[0], listOf(), Date(), 10, 1),
                Food (2, foodCategories[1], listOf(), Date(), 10, 2),
                Food (3, foodCategories[2], listOf(), Date(), 10, 3),
                Food (4, foodCategories[3], listOf(), Date(), 10, 4),
                Food (5, foodCategories[4], listOf(), Date(), 10, 5),
                Food (6, foodCategories[5], listOf(), Date(), 10, 6),
                Food (7, foodCategories[6], listOf(), Date(), 10, 7),
                Food (8, foodCategories[0], listOf(), Date(), 10, 8),
                Food (9, foodCategories[1], listOf(), Date(), 10, 9),
                Food (10, foodCategories[2], listOf(), Date(), 10, 10),
                Food (11, foodCategories[3], listOf(), Date(), 10, 11),
                Food (12, foodCategories[4], listOf(), Date(), 10, 12),
                Food (13, foodCategories[5], listOf(), Date(), 10, 13),
                Food (14, foodCategories[6], listOf(), Date(), 10, 14)
        )

        return food;
    }

    override fun loadFoodCategories(): List<FoodCategory> {
        //        var foodCategories: MutableList<FoodCategory> = mutableListOf<FoodCategory>()
        //        for (i : Int in 1..12) {
        //            val foodCategory = FoodCategory ("Суп{i}", BitmapDrawable(), i,  true, listOf<FoodComponent>())
        //            foodCategories.add(foodCategory);
        //        }

        var foodCategories = listOf (
                FoodCategory (1, "Супы", BitmapDrawable(), 1, true, getSoupComponents()),
                FoodCategory (2, "Салаты", BitmapDrawable(), 2, true, getDrinksComponents()),
                FoodCategory (3, "Сладости", BitmapDrawable(), 3, true, listOf<FoodComponent>()),
                FoodCategory (4, "Напитки", BitmapDrawable(), 4, true, listOf<FoodComponent>()),
                FoodCategory (5, "Фрукты", BitmapDrawable(), 5, true, listOf<FoodComponent>()),
                FoodCategory (6, "Овощи", BitmapDrawable(), 6, true, listOf<FoodComponent>()),
                FoodCategory (7, "Мясо", BitmapDrawable(), 7, true, listOf<FoodComponent>()),
                FoodCategory (8, "Рыба", BitmapDrawable(), 8, true, listOf<FoodComponent>()),
                FoodCategory (9, "Гарниры", BitmapDrawable(), 9, true, listOf<FoodComponent>()),
                FoodCategory (10, "Снеки", BitmapDrawable(), 10, true, listOf<FoodComponent>()),
                FoodCategory (11, "Фастфуд", BitmapDrawable(), 11, true, listOf<FoodComponent>()),
                FoodCategory (12, "Молочное", BitmapDrawable(), 12, true, listOf<FoodComponent>())
        )

        return foodCategories;
    }

    private fun getSoupComponents(): List<FoodComponent> {
        return listOf(
                CalorieComponent(1, "Овощной", BitmapDrawable(), "", isDefault = true, calories = 80),
                CalorieComponent(2, "Картофель", BitmapDrawable(), "", calories = 20),
                CalorieComponent(3, "Горох, фасоль", BitmapDrawable(), "", calories = 20),
                CalorieComponent(4, "Крем, сыр", BitmapDrawable(), "", calories = 20),
                CalorieComponent(5, "Макароны, клецки", BitmapDrawable(), "", calories = 40),
                CalorieComponent(6, "Мясо, рыба", BitmapDrawable(), "", calories = 50),
                CalorieComponent(7, "Жирный бульон", BitmapDrawable(), "", calories = 60),
                CalorieComponent(8, "Зажарка, сало", BitmapDrawable(), "", calories = 100),
                CalorieComponent(9, "Сметана (ложка)", BitmapDrawable(), "", calories = 35),
                CalorieComponent(10, "Майонез (ложка)", BitmapDrawable(), "", calories = 85),
                CalorieComponent(11, "Хлеб черный (кусок)", BitmapDrawable(), "", calories = 80),
                CalorieComponent(12, "Хлеб белый (кусок)", BitmapDrawable(), "", calories = 120),
                QuantityComponent(13, "Половина порции", BitmapDrawable(), "", multiplier = 0.5),
                QuantityComponent(14, "Двойная порция", BitmapDrawable(), "", multiplier = 2.0)
        )
    }

    private fun getDrinksComponents(): List<FoodComponent> {
        return listOf(
                CalorieComponent(1, "Кофе", BitmapDrawable(), "", isDefault = true, calories = 10),
                CalorieComponent(2, "Чай", BitmapDrawable(), "", calories = 6),
                CalorieComponent(3, "Молоко/сливки", BitmapDrawable(), "", isDefault = true, calories = 15),
                CalorieComponent(4, "Сахар/мёд", BitmapDrawable(), "", calories = 37),
                CalorieComponent(5, "Фруктовый Сок", BitmapDrawable(), "", calories = 100),
                CalorieComponent(6, "Овощной сок", BitmapDrawable(), "", calories = 40),
                CalorieComponent(7, "Газировка", BitmapDrawable(), "", calories = 80),
                CalorieComponent(8, "Пиво", BitmapDrawable(), "", calories = 215),
                CalorieComponent(9, "Вино", BitmapDrawable(), "", calories = 113),
                CalorieComponent(10, "Крепкий алкоголь", BitmapDrawable(), "", calories = 114)
        )
    }
}