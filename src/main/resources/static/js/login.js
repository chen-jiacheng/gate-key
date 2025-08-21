document.getElementById('formLogin').addEventListener('submit', async e => {
    e.preventDefault();
    const data = Object.fromEntries(new FormData(e.target).entries());
    try {
        const res = await fetch('http://localhost:8080/api/auth/login', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(data)
        }).then(r => r.json());
        if (res.code === 200) {
            store.saveToken(res.data.token);
            store.saveUser(res.data.user);
            location.href = 'index.html';
        } else {
            alert(res.message || '登录失败');
        }
    } catch (err) {
        alert('网络错误');
    }
});