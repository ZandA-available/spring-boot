/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.cloudnativebuildpack.docker;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * A {@link ProgressUpdateEvent} fired as an image is loaded.
 *
 * @author Phillip Webb
 * @since 2.3.0
 */
public class LoadImageUpdateEvent extends ProgressUpdateEvent {

	private final String stream;

	@JsonCreator
	public LoadImageUpdateEvent(String stream, String status, ProgressDetail progressDetail, String progress) {
		super(status, progressDetail, progress);
		this.stream = stream;
	}

	/**
	 * Return the stream response or {@code null} if no response is available.
	 * @return the stream response.
	 */
	public String getStream() {
		return this.stream;
	}

}