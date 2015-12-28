package com.unidev.app.linkbox

class Link implements Comparable<Link>  {

    String url;
    String title;
    Integer weight;

    @Override
    String toString() {
        return title + "";
    }
    static constraints = {
        url blank: false, nullable: false
        title blank: false, nullable: false
        weight blank: false, nullable: false
        linkGroup nullable: false
    }

    def LinkGroup linkGroup
    static belongsTo = [LinkGroup]

    @Override
    int compareTo(Link o) {
        return weight.compareTo(o.weight)
    }
}
