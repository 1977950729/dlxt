new Vue({
    el: "#app",
    data: {
        list: []
    },
    methods: {
        selectElectricCoalLoss: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectElectricCoalLoss",
                type: "get",
                dataType: "json",
                success: function (result) {
                    that.list = result.table;
                }
            });
        }
    },
    created: function () {
        this.selectElectricCoalLoss();
    }
})