package com.avonfitzgerald.infinitelive.endpoint.session

import com.avonfitzgerald.infinitelive.core.Get
import com.avonfitzgerald.infinitelive.endpoint.common.jsonDefault
import com.avonfitzgerald.infinitelive.endpoint.session.model.SessionInfo
import kotlinx.serialization.decodeFromString

/**
 * Retrieve active sessions (servers) in Infinite Flight.
 *
 * [Official Documentation](https://infiniteflight.com/guide/developer-reference/live-api/sessions)
 */
class GetSessions : Get<List<SessionInfo>>("sessions") {
    override fun deserialize(data: String): List<SessionInfo> = jsonDefault.decodeFromString(data)
}
