package com.be_practical;


class Category{
    int categoryId = 121;

    public int getCategoryId(){
        return this.categoryId;
    }
}
public class This_keyword_II {
    public static void main(String[] args) {
       Category category = new Category();
     //   Category category1 = new Category();
        System.out.println(category.getCategoryId());
    }
}
