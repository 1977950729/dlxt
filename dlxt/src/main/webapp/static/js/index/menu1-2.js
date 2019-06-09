new Vue({
    el: "#app",
    data: {
        list: []
    },
    methods: {
        selectGasOxygen: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectGasOxygen",
                type: "get",
                dataType: "json",
                success: function (result) {
                    that.list = result;
                    setData(result);
                }

            });
        }
    },
    created: function () {
        this.selectGasOxygen();
    }
});

function setData(data) {
    var option = {
        xAxis: {
            name:'时间',
            type: 'category',
            data: data.listTime
        },
        yAxis: {
            min:3,
            max:6,
            name:'氧量%',
            type: 'value'
        },
        series: [{
            data: data.listData,
            type: 'line'
        }]
    };

    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}



