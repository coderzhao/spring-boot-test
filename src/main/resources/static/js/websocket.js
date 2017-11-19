var stompClient;

function connect() {
    var socketjs = new SockJS('my-websocket');
    stompClient = Stomp.over(socketjs);
    stompClient.connect({}, function (frame) {
        alert("已连接...");
        stompClient.subscribe('/topic/hello-response', function (response) {
            showResponse(JSON.parse(response.body).content);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
        alert("已断开连接..");
    }
}

function hello() {
    if (stompClient) {
        var data = JSON.stringify({
            'name': 'winthesky',
            'date': new Date().toLocaleString()
        });
        stompClient.send("/ws/hello", {}, data);
    }
}

function showResponse(content) {
    $('#response').append(content);
}