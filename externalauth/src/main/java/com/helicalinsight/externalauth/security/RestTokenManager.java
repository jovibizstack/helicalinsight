/**
 *    Copyright (C) 2013-2017 Helical IT Solutions (http://www.helicalinsight.com) - All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.helicalinsight.externalauth.security;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Map;

/**
 * Created by user on 3/08/2016.
 *
 * @author Somen
 */
public interface RestTokenManager {

    TokenInformationProvider createNewToken(UserDetails userDetails);

    void removeUserDetails(UserDetails userDetails);

    UserDetails removeToken(String token);

    UserDetails getUserDetails(String token);

    Collection<TokenInformationProvider> getUserTokens(UserDetails userDetails);

    Map<String, UserDetails> getValidUsers();
}
