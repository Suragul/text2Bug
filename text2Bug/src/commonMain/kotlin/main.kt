import com.soywiz.klock.seconds
import com.soywiz.korge.*
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.degrees
import com.soywiz.korma.interpolation.Easing

suspend fun main() = Korge() {
	text2("I find bug!" + "\n"+
			"Its colon symbol " + ":" +"\n"+
			"Its semicolon symbol " + ";"){
		position(10, 200)
	}
}