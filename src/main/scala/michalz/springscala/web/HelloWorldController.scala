package michalz.springscala.web

import michalz.springscala.utils.AppLogging
import michalz.springscala.web.dto.MessageContainer
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

@RestController
class HelloWorldController extends AppLogging {

  @RequestMapping(Array("/hello"))
  def helloWorldHandler() = {
    info("HelloWorld handler called")
    new MessageContainer("Hello World!")
  }

  @RequestMapping(value = Array("/receive"), method = Array(RequestMethod.PUT))
  def readMessage(@RequestBody message: MessageContainer) = {

    info("Received message: {}", message.getMessage)
    new MessageContainer("Received message: " + message.getMessage)
  }
}
