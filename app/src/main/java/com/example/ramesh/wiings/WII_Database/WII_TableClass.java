package com.example.ramesh.wiings.WII_Database;

/**
 * Created by Ram on 14-07-2017.
 */

public class WII_TableClass {



    public static String CATEGORYTABLE="create table categoryTable(id integet primary key,cate_id text not null,cate_name text not null)";
    public static String PRODUCTTABLE="create table productTable(id integet primary key,product_id text not null,cate_id text not null,product_name text not null)";




}
