<!doctype html>
<html>
    <head>

    </head>
    <body>
       <h1>Link box</h1>
        <hr/>
        <g:each var="group" in="${linkGroupList}">
            <li>${group.id} ${group.title}</li>
            ${group.links}

        </g:each>
    </body>
</html>
