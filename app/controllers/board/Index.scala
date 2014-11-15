package controllers.board

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import scala.slick.model.codegen.SourceCodeGenerator

object Index extends Controller{

  def index = Action{
    Ok(views.html.board.index("Hello world"))
  }

}