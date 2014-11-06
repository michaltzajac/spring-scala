package michalz.springscala.akka

import michalz.springscala.ApplicationConfig
import org.scalatest.{FunSuite, Matchers}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.{TestContextManager, ContextConfiguration}
import org.springframework.test.context.support.AnnotationConfigContextLoader

/**
 * @author mzajac
 * @since 2014.11.06
 */
//@ContextConfiguration(
//  classes = Array(classOf[ApplicationConfig]),
//  loader = classOf[AnnotationConfigContextLoader]
//)
@SpringApplicationConfiguration(classes = Array(classOf[ApplicationConfig]))
class AkkaServiceTest extends FunSuite with Matchers {
  
  @Autowired val akkaService: AkkaService = null
  new TestContextManager(this.getClass).prepareTestInstance(this)
  
  test("AkkaService shold be injected into test") {
    akkaService should not be null
  }

  test("Application contex should be injected into AkkaService") {
    akkaService.applicationContext should not be null
  }
}
