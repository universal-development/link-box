package com.unidev.app.linkbox

class LinkGroup {

    String title;
    String description;

    @Override
    String toString() {
        return title + "";
    }
    static constraints = {
        title blank: false, nullable: false
        description blank: false, nullable: false

    }
    static hasMany = [links: Link]
}
