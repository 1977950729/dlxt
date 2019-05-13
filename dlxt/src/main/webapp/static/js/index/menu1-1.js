new Vue({
    el: "#app",
    data:{
        userList:[],
        user: {}
    },
    methods:{
        findAll:function () {
            //给userList赋值
            //alert("findAll")
            //发起请求去后台找数据
            var url = 'http://localhost:8080/day92_vuejs_02_VueAndJava/user/findAll.do'
            //中转
            var _this = this;

        },
        findById:function (id) {
            //alert(id)
            //调用后台接口获取用户的数据
            //发起请求去后台找数据
            var url = 'http://localhost:8080/day92_vuejs_02_VueAndJava/user/findById.do'
            //中转
            var _this = this;

            $("#myModal").modal("show");//弹出窗

        },
        update:function () {
            //alert(JSON.stringify(this.user));
            //发起请求去后台找数据
            var url = 'http://localhost:8080/day92_vuejs_02_VueAndJava/user/update.do'
            //中转
            var _this = this;

            axios.post(url,_this.user).then(function (response) {
                _this.findAll();
            })
        }
    },
    created:function () {
        //页面创建就调用
        this.findAll()
    }
})