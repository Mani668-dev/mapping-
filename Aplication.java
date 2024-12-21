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
# sip invesement code 
def sip_investment(principal, rate, time):
    return principal * (((1 + rate / 100) ** time - 1) / (rate / 100))

principal = 1000  # SIP amount per month
rate = 12  # Annual rate of return in percentage
time = 12  # Investment duration in months

print(sip_investment(principal, rate, time))  # Total value of SIP investment after the given time
# end of code
