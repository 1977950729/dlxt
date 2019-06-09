$(function () {
    $("#login").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        if (!username || !password) {
            layer.msg('用户名或密码不能为空！', {icon: 2});
            return;
        }
        $.ajax({
            url: "/dlxt/login/userLogin",
            type: "post",
            dataType: "json",
            data: {
                username: username,
                password: password
            },
            success: function (result) {
                if (result.success) {
                    location.href = "/dlxt/pages/index/index.html";
                } else {
                    layer.msg('用户名或密码错误！', {icon: 2});
                }
            }
        });
    });
    $("#logon").click(function () {
        var username = $("#user").val();
        var pass1 = $("#pass1").val();
        var pass2 = $("#pass2").val();
        var phone = $("#phone").val();
        if (!username || !pass1 || !pass2) {
            layer.msg('用户名或密码不能为空！', {icon: 2});
            return;
        }
        if (pass1 != pass2) {
            layer.msg('两次输入密码不一致！', {icon: 2});
            return;
        }
        $.ajax({
            url: "/dlxt/login/logon",
            type: "post",
            dataType: "json",
            data: {
                username: username,
                password: pass1,
                phone: phone
            },
            success: function (result) {
                if (result.success) {
                    layer.msg('注册成功！', {icon: 1});
                    $("#user").val();
                    $("#pass1").val();
                    $("#pass2").val();
                    $("#phone").val();
                    location.href = "/dlxt/pages/login/login.html";
                } else {
                    layer.msg('用户名已存在！', {icon: 2});
                }
            }
        });
    });
});