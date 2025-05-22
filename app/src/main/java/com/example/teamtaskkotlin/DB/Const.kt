package com.example.teamtaskkotlin.DB

class Const {
    companion object{
        val DATA_BASE_NAME = "dbTask.db"
        val DATA_BASE_VERSION = 2

        //TASK
        val TABLE_TASK_CREATE = "CREATE TABLE [TASK] (\n" +
                "[ID] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[NAME] TEXT  NOT NULL, \n" +
                "[STATUS] TEXT  NOT NULL \n" +
                ")"

        val TABLE_TASK_DROP = "DROP TABLE IF EXISTS TASK"

        val TABLE_TASK_NAME = "TASK"

        //TASK RESPONSALE
        val TABLE_TASK_MG_CREATE = "CREATE TABLE [TASK_MANAGER] (\n" +
                "[ID] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[TASK_ID] TEXT  NOT NULL, \n" +
                "[RESPONSABLE] TEXT  NOT NULL \n" +
                ")"

        val TABLE_TASK_MG_DROP = "DROP TABLE IF EXISTS TASK_MANAGER"

        val TABLE_TASK_MG_NAME = "TASK_MANAGER"

        //TASK PLANNING
        val TABLE_TASK_PLANNING_CREATE = "CREATE TABLE [TASK_PLANNING] (\n" +
                "[ID] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[TASK_ID] TEXT  NOT NULL, \n" +
                "[YEAR] TEXT  NOT NULL, \n" +
                "[MONTH] TEXT  NOT NULL, \n" +
                "[DAY] TEXT  NOT NULL, \n" +
                "[HOURS] TEXT  NOT NULL \n" +
                ")"

        val TABLE_TASK_PLANNING_DROP = "DROP TABLE IF EXISTS TASK_PLANNING"

        val TABLE_TASK_PLANNING_NAME = "TASK_PLANNING"

    }
}