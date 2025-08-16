package eu.kanade.tachiyomi.animeextension.ar.arabhentai

import eu.kanade.tachiyomi.animesource.online.AnimeHttpSource
import eu.kanade.tachiyomi.animesource.model.AnimeSearchResponse
import eu.kanade.tachiyomi.animesource.model.SAnime
import eu.kanade.tachiyomi.animesource.model.SEpisode
import eu.kanade.tachiyomi.animesource.model.Video
import okhttp3.Request
import okhttp3.Response

class ArabHentai : AnimeHttpSource() {
    override val name = "Arab Hentai"
    override val baseUrl = "https://arabshentai.com"
    override val lang = "ar"
    override val supportsLatest = true

    override fun popularAnimeRequest(page: Int): Request {
        return GET("$baseUrl/page/$page", headers)
    }

    override fun popularAnimeParse(response: Response): AnimeSearchResponse {
        // هون رح نضيف الكود لاحقًا لما نربطه بالموقع
        throw Exception("لسا بدنا نكمل البرمجة هون")
    }

    override fun episodeListParse(response: Response): List<SEpisode> {
        throw Exception("لسا بدنا نكمل البرمجة هون")
    }

    override fun videoListParse(response: Response): List<Video> {
        throw Exception("لسا بدنا نكمل البرمجة هون")
    }

    override fun animeDetailsParse(response: Response): SAnime {
        throw Exception("لسا بدنا نكمل البرمجة هون")
    }

    override fun searchAnimeParse(response: Response): AnimeSearchResponse {
        throw Exception("لسا بدنا نكمل البرمجة هون")
    }
}
