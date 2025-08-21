document.getElementById('formReg').addEventListener('submit', async e => {
    e.preventDefault();
    const data = Object.fromEntries(new FormData(e.target).entries());
    try {
        const res = await fetch('http://localhost:8080/api/auth/register', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(data)
        }).then(r => r.json());
        if (res.code === 200) {
            alert('注册成功，即将跳转登录');
            location.href = 'login.html';
        } else {
            alert(res.message || '注册失败');
        }
    } catch (err) {
        alert('网络错误');
    }
});