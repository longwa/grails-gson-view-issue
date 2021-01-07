package example

import grails.testing.web.controllers.ControllerUnitTest
import org.springframework.http.HttpStatus
import spock.lang.Specification

class FooControllerSpec extends Specification implements ControllerUnitTest<FooController> {
    void "test empty collection respond with default object gson"() {
        given:
        request.contentType = "application/json"

        when: 'with no results'
        response.format = 'json'
        controller.index()

        then:
        response.status == HttpStatus.OK.value()
        response.contentType == 'application/json'
        response.json.size() == 0
    }
}
