class UrlMappings {

    static mappings = {
        "/admin/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"index")
        "/admin"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
