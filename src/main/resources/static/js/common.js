// 本地存储 key
const TOKEN_KEY = 'gatekey_token';
const USER_KEY  = 'gatekey_user';

// 工具方法
const store = {
    saveToken: t => localStorage.setItem(TOKEN_KEY, t),
    getToken:  () => localStorage.getItem(TOKEN_KEY),
    saveUser:  u => localStorage.setItem(USER_KEY, JSON.stringify(u)),
    getUser:   () => JSON.parse(localStorage.getItem(USER_KEY) || '{}'),
    clear:     () => { localStorage.removeItem(TOKEN_KEY); localStorage.removeItem(USER_KEY); }
};

// 通用请求头
function authHeader() {
    const token = store.getToken();
    return token ? { 'Authorization': 'Bearer ' + token } : {};
}

// 退出登录
function logout() {
    store.clear();
    location.href = 'index.html';
}