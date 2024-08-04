package org.example.Lesson12

fun main() {
    val userPixel = Participants(
        image = "Андройд",
        userName = "Pixel 6",
    )
    val userPixel2 = Participants(
        image = "Андройд",
        userName = "Pixel 8",
    )
    val androidRoom = Room(
        cover = "Goodle",
        name = "Топ за свои деньги",
    )
    val userApple = Participants(
        image = "Яблоко",
        userName = "Iphone 3s",
    )
    val userApple2 = Participants(
        image = "Яблоко",
        userName = "Iphone 15",
    )
    val appleRoom = Room(
        cover = "Apple",
        name = "Дорого и в кредит",
    )

    androidRoom.entranceToTheRoom(userPixel)
    androidRoom.longPress(userPixel2)
    androidRoom.entranceToTheRoom(userPixel2)
    androidRoom.startTalkingStatus(userPixel)
    androidRoom.stoppedTalking(userPixel)
    appleRoom.entranceToTheRoom(userApple)
    appleRoom.entranceToTheRoom(userApple2)

}

class Room(
    var cover: String,
    var name: String,
) {
    val listOfParticipants: MutableList<Participants> = mutableListOf()

    fun longPress(userName: Participants) {
        println("Долгое нажатие на ${userName.image} светится ${userName.userName}")
    }

    fun startTalkingStatus(userName: Participants) {
        println("Пользователь ${userName.userName} - ${userName.statusVoid.get(0)}")
    }

    fun stoppedTalking(userName: Participants) {
        println("Пользователь ${userName.userName} - ${userName.statusVoid.get(1)}")
    }

    fun entranceToTheRoom(userName: Participants) {
        listOfParticipants.add(userName)
        println("Пользователь ${userName.userName} вошел в комнату: ${name}")
    }

}

class Participants(
    var image: String,
    var userName: String,
    ) {
    val statusVoid: List<String> = mutableListOf("разговаривает", "микрофон выключен", "пользователь заглушен")
}
