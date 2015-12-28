package com.unidev.app.linkbox

class Link {

    String url;
    String title;
    Integer weight;


    static constraints = {
        url blank: false, nullable: false
        title blank: false, nullable: false
        weight blank: false, nullable: false
        linkGroup nullable: false
    }

    def LinkGroup linkGroup
    static belongsTo = [LinkGroup]
}
