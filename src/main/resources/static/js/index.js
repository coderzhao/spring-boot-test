var app = new Vue({
    el: '#app',
    data: {
        message: '',
        test_data: ''
    },
    // created: function () {
    //     var _self = this;
    //     var url = "getHelloWorlds";
    //     $.get(url, function (data) {
    //         _self.message = data.msg;
    //     })
    // },
    methods: {
        loadTestData : function() {
            var _self = this;
            var url = "loadTestData";
            $.get(url, function (data) {
                _self.message = data.msg.aaa;
            })
        }
    }
})