package com.avonfitzgerald.infinitelive.endpoint.misc

import com.avonfitzgerald.infinitelive.core.Get
import com.avonfitzgerald.infinitelive.endpoint.common.jsonDefault
import com.avonfitzgerald.infinitelive.endpoint.misc.model.OceanicTrack
import kotlinx.serialization.decodeFromString

/**
 * Retrieves a list of Oceanic Tracks active in Infinite Flight multiplayer sessions.
 *
 * [Official Documentation](https://infiniteflight.com/guide/developer-reference/live-api/oceanic-tracks)
 */
class GetOceanicTracks : Get<List<OceanicTrack>>("tracks") {
    override fun deserialize(data: String): List<OceanicTrack> = jsonDefault.decodeFromString(data)
}
