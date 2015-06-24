/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.util;

public class OpenmeetingsVariables {
	public static final String CONFIG_CRYPT_KEY = "crypt_ClassName";
	public static final String CONFIG_DASHBOARD_SHOW_MYROOMS_KEY = "dashboard.show.myrooms";
	public static final String CONFIG_DASHBOARD_SHOW_RSS_KEY = "dashboard.show.rssfeed";
	public static final String CONFIG_DEFAULT_LANG_KEY = "default_lang_id";
	public static final String CONFIG_FRONTEND_REGISTER_KEY = "allow_frontend_register";
	public static final String CONFIG_SOAP_REGISTER_KEY = "allow.soap.register";
	public static final String CONFIG_LOGIN_MIN_LENGTH_KEY = "user.login.minimum.length";
	public static final String CONFIG_MAX_UPLOAD_SIZE_KEY = "max_upload_size";
	public static final String CONFIG_PASS_MIN_LENGTH_KEY = "user.pass.minimum.length";
	public static final String CONFIG_RSS_FEED1_KEY = "rss_feed1";
	public static final String CONFIG_RSS_FEED2_KEY = "rss_feed2";
	public static final String CONFIG_IGNORE_BAD_SSL = "oauth2.ignore_bad_ssl";
	public static final String CONFIG_DEFAULT_LANDING_ZONE = "default.landing.zone";
	public static final String CONFIG_DEFAULT_LDAP_ID = "ldap_default_id";
	public static final String CONFIG_REDIRECT_URL_FOR_EXTERNAL_KEY = "redirect.url.for.external.users";
	public static final String CONFIG_APPOINTMENT_REMINDER_MINUTES = "number.minutes.reminder.send";
	public static final String CONFIG_APPLICATION_NAME = "application.name";
	public static final String CONFIG_APPLICATION_BASE_URL = "application.base.url";
	public static final String CONFIG_FLASH_PROTOCOL = "flash.protocol";
	public static final String CONFIG_FLASH_PORT = "flash.port";
	public static final String CONFIG_SCREENSHARING_QUALITY = "default.quality.screensharing";
	public static final String CONFIG_SCREENSHARING_FPS = "default.fps.screensharing";
	public static final String CONFIG_SCREENSHARING_FPS_SHOW = "screensharing.fps.show";
	public static final String CONFIG_SCREENSHARING_ALLOW_REMOTE = "screensharing.allow.remote";
	public static final String CONFIG_CALENDAR_FIRST_DAY = "calendar.firstday";
	public static final String CONFIG_DEFAULT_GROUP_ID = "default_group_id";

	public static int DEFAULT_MINUTES_REMINDER_SEND = 15;
	public static String DEFAULT_BASE_URL = "http://localhost:5080/openmeetings/";
	
	public static final String WEB_DATE_PATTERN = "dd.MM.yyyy HH:mm:ss"; //FIXME need to be made locale based
	public static String webAppRootKey = null;
	public static String webAppRootPath = null;
	public static String configKeyCryptClassName = null;
	public static final int USER_LOGIN_MINIMUM_LENGTH = 4;
	public static final int USER_PASSWORD_MINIMUM_LENGTH = 4;
	public static Boolean whiteboardDrawStatus = null;
	public static String wicketApplicationName = null;
}
