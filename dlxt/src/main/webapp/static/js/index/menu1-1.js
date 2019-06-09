new Vue({
    el: "#app",
    data: {
        list: []
    },
    methods: {
        selectFurnaceData: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectFurnaceData",
                type: "get",
                dataType: "json",
                success: function (result) {
                    that.list = result;
                }
            });
        }
    },
    created: function () {
        this.selectFurnaceData();
    }
})