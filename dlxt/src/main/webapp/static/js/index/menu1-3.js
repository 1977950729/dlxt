new Vue({
    el: "#app",
    data: {},
    methods: {
        selectCoal: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectCoal",
                type: "get",
                dataType: "json",
                success: function (result) {
                    setData(result);
                    console.log(result.times);
                }
            });
        }
    },
    created: function () {
        this.selectCoal();
    }
});

function setData(data) {
    option = {
        title: {
            text: '发电煤耗实时数据图'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                animation: true
            }
        },
        xAxis: {
            type: 'time',
            splitNumber: 5,
            splitLine: {
                show: false
            }
        },
        yAxis: {
            type: 'value',
            boundaryGap: [0, '100%'],
            splitLine: {
                show: false
            }
        },
        series: [{
            name: '发电煤耗',
            type: 'line',
            showSymbol: false,
            hoverAnimation: false,
            data: data.data
        }]
    };

    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}
