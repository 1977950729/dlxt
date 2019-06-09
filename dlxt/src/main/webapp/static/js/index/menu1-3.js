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
                    console.log(result);
                    setData(result);
                }
            });
        }
    },
    created: function () {
        this.selectCoal();
    }
});

function setData(result) {
    option = {
        title: {
            text: '发电煤耗实时数据图',
            x: 'center'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                animation: false
            }
        },
        toolbox: {
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                restore: {},
                saveAsImage: {}
            }
        },
        axisPointer: {
            link: {xAxisIndex: 'all'}
        },
        xAxis: [
            {
                type: 'category',
                boundaryGap: false,
                axisLine: {onZero: true},
                data: result.timeLList
            }
        ],
        yAxis: [
            {
                name: '发电煤耗',
                type: 'value',
                max: 300,
                min: 260
            }
        ],
        series: [
            {
                name: '发电煤耗',
                type: 'line',
                symbolSize: 8,
                hoverAnimation: false,
                data: result.dataList
            }
        ]
    };

    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}
