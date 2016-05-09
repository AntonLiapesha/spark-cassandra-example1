package com.aliapesha.sparkCassandraEx1

import org.apache.spark.sql.Row

case class CountryGdp(id: String, rank: Int, name: String, amount: Int)

object CountryGdp {
  def apply(row: Row) = {
    new CountryGdp(
      id = row.getString(0),
      rank = row.getString(1).toInt,
      name = row.getString(3),
      amount = row.getString(4).replace(",", "").toInt
    )
  }
}