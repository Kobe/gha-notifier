package github

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable

@Serializable
data class IpResponse(val ip: String)

class Client() {
    private val httpClient = HttpClient() {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun getIp(): IpResponse = httpClient.get("https://api.ipify.org/?format=json")
}


fun main() {
    runBlocking {
        val client = Client()
        val response = client.getIp()
        println(response.ip)
    }
}