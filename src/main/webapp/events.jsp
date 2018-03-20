<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple SSE events demo</title>
</head>
<body>

<h2>Messages</h2>
<div id="messages"></div>

<h2>Named String Events</h2>
<div id="stringEvents"></div>

<h2>Named Long Events</h2>
<div id="primitiveEvents"></div>

<h2>Named JSON-B Events</h2>
<div id="jsonbEvents"></div>

<script>
    if (typeof(EventSource) !== "undefined") {
        // TODO open EvenSource

        // Implement onmessage function

        // implement addEventListeners

    } else {
        document.getElementById("messages").innerHTML = "Sorry, your browser does not support server-sent events...";
    }
</script>
</body>
</html>
