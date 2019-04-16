/*
 * Copyright 2019 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.metrics.gauges;

import com.codahale.metrics.Gauge;
import io.netty.channel.group.ChannelGroup;

/**
 * @author Christoph Schäbel
 */
public class OpenConnectionsGauge implements Gauge<Integer> {

    private final ChannelGroup allChannels;

    public OpenConnectionsGauge(final ChannelGroup allChannels) {
        this.allChannels = allChannels;
    }

    @Override
    public Integer getValue() {
        return allChannels.size();
    }
}