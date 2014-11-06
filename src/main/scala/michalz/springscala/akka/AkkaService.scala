package michalz.springscala.akka

import akka.actor.ActorSystem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service

@Service
class AkkaService {
  
  @Autowired
  val applicationContext: ApplicationContext = null

  val actorSystem = ActorSystem("SpringScala")
}
