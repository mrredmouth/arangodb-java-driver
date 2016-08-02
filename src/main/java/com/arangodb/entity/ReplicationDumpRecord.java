/*
 * Copyright (C) 2012,2013 tamtam180
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.arangodb.entity;

import java.io.Serializable;

/**
 * @author tamtam180 - kirscheless at gmail.com
 *
 */
public class ReplicationDumpRecord<T> implements Serializable {

	long tick;
	ReplicationEventType type;
	String key;
	String rev;
	DocumentEntity<T> data;

	public long getTick() {
		return tick;
	}

	public ReplicationEventType getType() {
		return type;
	}

	public String getKey() {
		return key;
	}

	public String getRev() {
		return rev;
	}

	public DocumentEntity<T> getData() {
		return data;
	}

	public void setTick(final long tick) {
		this.tick = tick;
	}

	public void setType(final ReplicationEventType type) {
		this.type = type;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public void setRev(final String rev) {
		this.rev = rev;
	}

	public void setData(final DocumentEntity<T> data) {
		this.data = data;
	}

}
