package henriquemosseri.com.github.crypto_monitor.service


import henriquemosseri.com.github.crypto_monitor.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}