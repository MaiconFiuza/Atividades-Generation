/*
    Dá par pegar por Tag: getElementByTagName()
    pegar por Id: getElementById()
    por Nome: getElementByName()
    por Classe: getElementsByClassName()
    por Seletor: querySelector()  // é o que a gente mais vai utilizar
    melhor prática para acessar o doom no javascript

    let nome = window.document.getElementById('nome')
     nesse exemplo se sai da raiz do doom para chegar no document

*/

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
    if(assunto.value.length>=100){
        txtAssunto.innerHTML='Texto é muito grande digite no máximo 100 caracteres'
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

function mapaZoom(){
    mapa.style.width='800px'
    mapa.style.height='600px'
}

function mapaNormal(){
    mapa.style.width='400px'
    mapa.style.height='250px'
}
