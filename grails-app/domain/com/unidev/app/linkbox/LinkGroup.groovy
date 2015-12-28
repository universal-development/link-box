package com.unidev.app.linkbox

class LinkGroup implements Comparable<LinkGroup> {

    String title;
    String description;
    Integer weight

    @Override
    String toString() {
        return title + "";
    }
    static constraints = {
        title blank: false, nullable: false
        description blank: false, nullable: false
        weight blank: false, nullable: false

    }
    SortedSet links
    static hasMany = [links: Link]

    @Override
    int compareTo(LinkGroup o) {
        return weight.compareTo(o.weight)
    }
}
