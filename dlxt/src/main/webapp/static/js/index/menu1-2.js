var a;
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
                    a=result;
                }
            });
        }
    },
    created: function () {
        this.selectGasOxygen();
    }
});


option = {
    xAxis: {
        type: 'category',
        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: [820, 932, 901, 934, 1290, 1330, 1320],
        type: 'line'
    }]
};

//初始化echarts实例
var myChart = echarts.init(document.getElementById('chartmain'));

//使用制定的配置项和数据显示图表
myChart.setOption(option);