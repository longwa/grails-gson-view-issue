package example

import grails.rest.RestfulController

class FooController extends RestfulController<FooTestCommand> {
    FooController() {
        super(FooTestCommand)
    }

    def index() {
        respond([])
    }
}

class FooTestCommand {
    String name
}
