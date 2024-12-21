import React, { useState } from 'react';
const LoginPage = () => {
  const [username, setUsername] = useState(''), [password, setPassword] = useState('');
  const handleSubmit = (e) => { e.preventDefault(); if (username === 'admin' && password === 'password123') alert('Success'); else alert('Invalid login'); };
  return (
    <form onSubmit={handleSubmit}>
      <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} required />
      <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} required />
      <button type="submit">Login</button>
    </form>
  );
};
export default LoginPage;
