package com.meli.academy.grails.chat

class ChatController {

    def index() {
    }
	
    def entrar(String alias) {
        if (alias.trim() == '') {
            redirect(action:'index')
        } else {
            session.alias = alias
            render (view: 'chat')
        }
    }
	
	def obtenerUltimosMensajes() {
		def mensajes = Mensaje.listOrderByFecha(order: 'desc', max:10)
		[mensajes:mensajes.reverse()]
	}
	
	def submitMensaje(String mensaje) {
		new Mensaje(alias:session.alias, mensaje:mensaje).save()
		render "<script>obtenerUltimosMensajes()</script>"
	}
}
