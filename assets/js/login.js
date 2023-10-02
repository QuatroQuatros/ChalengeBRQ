const loginForm = document.getElementById('loginForm');
const emailInput = document.getElementById('email');
const senhaInput = document.getElementById('password');
const mensagemDiv = document.getElementById('mensagem');

loginForm.addEventListener('submit', function (e) {
    e.preventDefault(); // Impede o envio do formulário padrão

    // Valores de email e senha inseridos pelo usuário
    const email = emailInput.value;
    const senha = senhaInput.value;

    // Verifique as credenciais (substitua por sua lógica de autenticação real)
    if (email === 'user@user.com' && senha === 'senha123') {

        // Simule um redirecionamento após 2 segundos (você pode usar window.location para redirecionar para uma página real)
        setTimeout(function () {
            window.location.href = 'telaUsuário.html'; // Redirecionar para a página de boas-vindas
        }, 2000);
    } else if(email === 'adm@adm.com' && senha === 'senha123') {

        setTimeout(function () {
            window.location.href = 'telaDash.html'; // Redirecionar para a página de boas-vindas
        }, 2000);

    } else {
        // Credenciais incorretas
        mensagemDiv.textContent = 'Credenciais incorretas. Tente novamente.';
    }

    // Limpar os campos de entrada
    emailInput.value = '';
    senhaInput.value = '';
});