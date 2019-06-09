new Vue({
    el: "#app",
    data: {
        list: []
    },
    methods: {
        selectElectricCoalLossCircle: function () {
            var that = this;
            $.ajax({
                url: "/dlxt/furnace/selectElectricCoalLossCircle",
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
        this.selectElectricCoalLossCircle();
    }
})


function setData(data) {
    option = {
        title : {
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: data.dataName
        },
        series : [
            {
                name: '',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:data.circle,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };


    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}
