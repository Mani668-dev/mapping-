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
#Loans code
def loan_emi(principal, rate, tenure):
    monthly_rate = rate / 12 / 100
    emi = principal * monthly_rate * (1 + monthly_rate) ** tenure / ((1 + monthly_rate) ** tenure - 1)
    return emi

print(loan_emi(500000, 10, 24))  # Example: loan amount, interest rate, and tenure in months
#end of code 

