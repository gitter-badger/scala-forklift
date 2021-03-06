package com.liyaos.forklift.slick

import slick.dbio.DBIO
import slick.backend.DatabaseConfig
import slick.driver.JdbcProfile
import com.liyaos.forklift.core.Migration

trait SqlMigrationInterface[T] extends Migration[T, DBIO[Unit]]{
  def queries : Seq[DBIO[Int]]
}

case class SqlMigration[T](val id:T)(val queries: Seq[DBIO[Int]])
    extends SqlMigrationInterface[T] {
  protected val config = SlickMigrationsConfig.dbConfig
  def up = DBIO.seq(queries:_*)
}
