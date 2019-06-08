new Vue({
    el: "#app",
    data: {
        list: {}
    },
    methods: {
        selectLatest: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectLatest",
                type: "get",
                dataType: "json",
                success: function (result) {
                    that.list = result;
                }
            });
        }
    },
    created: function () {
        this.selectLatest();
    }
})