package mypatas_vsi

class UsuariosMyPatas {
    open class Usuario(var login: String, var senha: String) {
        protected var loginOficial = ""
        protected var senhaOficial = ""

        companion object{
            var tipoUsuario = 0
        }

        fun cadastrarLoginSenha() {
            println("Digite seu Login")
            login = readLine().toString()
            println("Digite a sua Senha")
            senha = readLine().toString()
            loginOficial = login
            senhaOficial = senha
        }

        fun validarSenha() {
            println("Confirme o seu login")
            var confirmeLogin = readLine().toString()
            println("Confirme a sua Senha")
            var confirmeSenha= readLine().toString()

            if((confirmeLogin == login)&&(confirmeSenha == senha)){
                println("Senha cadastrada")
            }else {
                print("Erro ao Cadastrar")
                println("Tente Novamente")
                cadastrarLoginSenha()
            }
        }

        open fun validacao(){
            println("Digite seu Login")
            var loginValidacao = readLine().toString()
            println("Digite a sua Senha")
            var senhaValidacao = readLine().toString()
            if((loginOficial == loginValidacao)&&(senhaOficial == senhaValidacao)){
                println("Bem vindo ao MyPatas")
            }
        }


    }

    class Gerente: Usuario("",""){
        fun cadastrarFuncionario(){
            val funcionario = Funcionario()
            funcionario.cadastrarLoginSenha()
//        funcionario.validarSenha()
            funcionario.validacao()
        }

        fun cadastrarVeterinario(){
            val veterinario = Veterinario()
            veterinario.cadastrarLoginSenha()
//        veterinario.validarSenha()
            veterinario.validacao()
        }

        override fun validacao(){
            println("Digite seu Login")
            var loginValidacao = readLine().toString()
            println("Digite a sua Senha")
            var senhaValidacao = readLine().toString()
            if((loginOficial == loginValidacao)&&(senhaOficial == senhaValidacao)){
                println("Bem vindo ao MyPatas Gerente")
                tipoUsuario = 1
            }


        }
    }

    class Funcionario: Usuario("",""){
        override fun validacao() {
            println("Digite seu Login")
            var loginValidacao = readLine().toString()
            println("Digite a sua Senha")
            var senhaValidacao = readLine().toString()
            if((loginOficial == loginValidacao)&&(senhaOficial == senhaValidacao)){
                println("Bem vindo ao MyPatas Funcionario")
                tipoUsuario = 2
            }
        }
    }

    class Veterinario: Usuario("",""){
        override fun validacao(){
            println("Digite seu Login")
            var loginValidacao = readLine().toString()
            println("Digite a sua Senha")
            var senhaValidacao = readLine().toString()
            if((loginOficial == loginValidacao)&&(senhaOficial == senhaValidacao)){
                println("Bem vindo ao MyPatas Veterinario")
                tipoUsuario = 3
            }
        }
    }
}