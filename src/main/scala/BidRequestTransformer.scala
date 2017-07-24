import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

object BidRequestTransformer {
  val mapper = new ObjectMapper with ScalaObjectMapper
  mapper.registerModule(DefaultScalaModule)
  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
  mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY)


  def fromJsonToBidRequest(json:String) : BidRequest = {
    mapper.readValue[BidRequest](json)
  }

  def bidRequestToJson(bidRequest: BidRequest) : String = {
    mapper.writeValueAsString(bidRequest)
  }
}
