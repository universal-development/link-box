package com.unidev.app.linkbox


class IndexController {

    def index() {
        def linkGroupList = LinkGroup.findAll(sort: 'weight', order: 'desc')
        [linkGroupList: linkGroupList]
    }
}
