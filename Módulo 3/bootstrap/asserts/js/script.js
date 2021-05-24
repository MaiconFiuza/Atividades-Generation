let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let mapa = document.querySelector('#mapa')
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width='100%'
email.style.width='100%'

function validaNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nome.value.length<3){
        txtNome.innerHTML='Nome Inválido'
        txtNome.style.color='red'
    }else{
        txtNome.innerHTML=""
        nomeOk=true
    }
}


function validaEmail(){
    let txtEmail = document.querySelector('#txtEmail')
    if(email.value.indexOf('@')==-1 || email.value.indexOf('.')==-1){
        txtEmail.innerHTML="formato de email inválido"
        txtEmail.style.color='red'
    }else{
        txtEmail.innerHTML="formato de email valido"
        txtEmail.style.color='green'
        emailOk=true
    }
}

function validaAssunto(){
    let txtAssunto = document.querySelector('#txtAssunto')
    if(assunto.value.length>=1000){
        txtAssunto.innerHTML='Brasillllllll colocar uma frase criativa aqui '
        txtAssunto.style.color='red'
        txtAssunto.style.display='block'

    }else{
        txtAssunto.style.display='none'
        assuntoOk=true
    }
}


function enviar(){
    if(nomeOk == true && emailOk==true && assuntoOk==true){
        alert('Formulário enviado com sucesso')
    }
    else{
        alert('Preencha o formulário corretamente')
    }
}