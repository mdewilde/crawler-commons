/**
 * Copyright 2016 Crawler-Commons
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package crawlercommons.fetcher;

import java.io.IOException;

/**
 * @deprecated As of release 0.6. We recommend directly using Apache HttpClient,
 *             async-http-client, or any other robust, industrial-strength HTTP
 *             clients.
 * 
 */
@Deprecated
@SuppressWarnings({ "serial" })
public class IOFetchException extends BaseFetchException {

    public IOFetchException() {
        super();
    }

    public IOFetchException(String url, IOException e) {
        super(url, e);
    }

}
