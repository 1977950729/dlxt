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
                    setData(result);
                }
            });
        }
    },
    created: function () {
        this.selectElectricCoalLoss();
    }
})


function setData(data) {
    option = {
        color: ['#3398DB'],
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data : data.dataName,
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'',
                type:'bar',
                barWidth: '60%',
                data:data.dataValue
            }
        ]
    };


    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}
