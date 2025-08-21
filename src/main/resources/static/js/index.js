const user = store.getUser();
if (store.getToken() && user.username) {
    document.getElementById('welcome').innerText = `欢迎回来，${user.username}`;
    document.getElementById('guestArea').style.display = 'none';
    document.getElementById('userArea').style.display = 'inline-block';
} else {
    document.getElementById('welcome').innerText = '请先登录或注册';
    store.clear();
}