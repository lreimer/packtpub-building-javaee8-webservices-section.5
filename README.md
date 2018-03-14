# Building Web Services with Java EE 8 <br>Section 3: Using Server-sent Events (SSE)

## Videos

### Video 5.1: What are Server-Sent Events?

In this video we are talking about the benefits and possible usage scenarios of Server-sent events.

### Video 5.2: Implementing SSE on the server-side

In this video we are implementing simple asynchronous web services.

| Method | URI | Status | Description |
|--------|-----|--------|-------------|
| GET    | /api/events | 200 | Register and get the stream of SSE |

### Video 5.3: Implementing SSE REST clients

In this video we are showing how to implement an REST client received SSE.

### Video 5.4: Implementing and sending SSE broadcasts

In this video is showing how to subscribe and broadcast SSE events to all registered clients.
to calculate Fibonacci numbers async.

| Method | URI | Status | Description |
|--------|-----|--------|-------------|
| GET    | /api/broadcast | 200 | Get the stream of broadcasted SSE |
| POST    | /api/broadcast | 200 | Send a broadcast message |


## Building and Running

```bash
$ mvn clean verify

$ docker build -t sse-service:1.0 .
$ docker run -it -p 8080:8080 sse-service:1.0
```
