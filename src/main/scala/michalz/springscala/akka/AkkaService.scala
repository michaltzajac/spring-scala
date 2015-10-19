package michalz.springscala.akka

import akka.actor.ActorSystem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service
import org.springframework.web.context.request.async.DeferredResult

/**
 * Created by michal on 04.11.14.
 */
@Service
class AkkaService @Autowired() (val applicationContext: ApplicationContext) {
  val actorSystem = ActorSystem("SpringScala")

  def processAsyncRequest(result: DeferredResult[String]) = {

  }
}
