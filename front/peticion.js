
const form = document.querySelector("#form");

form.addEventListener("submit", async (event) => {

    event.preventDefault();

    const usernameIngresado = event.target.username.value;
    const passwordIngresado = event.target.password.value;

    const url = "http://localhost:8080/users"

    const userData = {
        username: usernameIngresado,
        password: passwordIngresado,
        email: "email@gmail.com"
    }

    const response = await fetch(url, {
        method: "post",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(userData)
    })

    if(response.ok) {
        console.log("USUARIO CREADO ...")

    }else {
        console.error("Error al crear el usuario ...")
    }

})