$(function () {
    $("#login").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        if (!username || !password) {
            layer.msg('用户名或密码不能为空！', {icon: 2});
        }
        $.ajax({
            url: "/dlxt/login/userLogin?username=" + username + "&password=" + password,
            type: "get",
            dataType: "json",
            success: function (result) {
                if (result.success) {
                    location.href = "/dlxt/pages/index/index.html";
                } else {
                    layer.msg('用户名或密码错误！', {icon: 2});
                }
            }
        });
    });
});