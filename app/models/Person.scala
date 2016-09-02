package models

import java.util

/**
  * Created by knodus on 19/8/16.
  */
case class Person(firstName: String){
  def serialize = Map("first_name" -> firstName)
}
