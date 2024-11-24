document.getElementById('login-button').addEventListener('click', () => {
    const auth0 = new auth0.WebAuth({
        domain: 'dev-ajgtnof42u2eq7vj.us.auth0.com',
        clientID: 'ngT3BRcEoJl672J52gBkfSi5fTYQuR9j',
        redirectUri: window.location.origin,
        responseType: 'token id_token',
        scope: 'openid profile email'
    });

    auth0.authorize();
});